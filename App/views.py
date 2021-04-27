import json

import xlrd

from flask import Blueprint, request, session, jsonify
from geventwebsocket import WebSocketError

from App.models import db, User, Student, Permission, StudentSchema, Role, Notice, NoticeSchema, Message, MessageSchema
from utils.login import is_login

user_blueprint = Blueprint('user', __name__)


@user_blueprint.route('/create_db/')
def create_db():
    """
    创建数据库
    """
    db.create_all()
    return '创建成功'


@user_blueprint.route('/drop_db/')
def drop_db():
    """
    删除数据库
    """
    db.drop_all()
    return '删除成功'


@user_blueprint.route('/register/', methods=['GET', 'POST'])
def register():
    """
    用户注册页面
    """

    if request.method == 'POST':
        # 获取用户填写的信息
        u_id = request.values.get('u_id')
        username = request.values.get('username')
        u_phone = request.values.get('u_phone')
        pwd1 = request.values.get('pwd1')
        pwd2 = request.values.get('pwd2')

        # 定义个变量来控制过滤用户填写的信息
        flag = True
        # 判断用户是否信息都填写了.(all()函数可以判断用户填写的字段是否有空)
        if not all([username, pwd1, pwd2]):
            msg, flag = '请填写完整信息', False
        # 判断用户名是长度是否大于16
        if len(username) > 16:
            msg, flag = '用户名太长', False

        if len(u_phone) != 11:
            msg, flag = '手机号码输入错误', False
        # 判断两次填写的密码是否一致
        if pwd1 != pwd2:
            msg, flag = '两次密码不一致', False
        # 如果上面的检查有任意一项没有通过就返回注册页面,并提示响应的信息
        if not flag:
            return jsonify(code=200, msg=msg)

        # 核对输入的用户是否已经被注册了
        u = User.query.filter(User.u_id == u_id).first()
        # 判断用户名是否已经存在
        if u:
            msg = '用户名已经存在'
            return jsonify(code=200, msg=msg)
        # 上面的验证全部通过后就开始创建新用户
        user = User(u_id=u_id, username=username, password=pwd1, u_phone=u_phone)
        # 保存注册的用户
        user.save()
        # 跳转到登录页面
        return jsonify(code=200, msg="注册成功")


@user_blueprint.route('/login/', methods=['GET', 'POST'])
def login():
    """
    登录
    """

    if request.method == 'POST':
        u_id = request.values.get('u_id')
        password = request.values.get('password')
        # 判断用户名和密码是否填写
        if not all([u_id, password]):
            msg = '请填写好完整的信息'
            return jsonify(code=200, msg=msg)
        # 核对用户名和密码是否一致
        user = User.query.filter_by(u_id=u_id, password=password).first()
        # 如果用户名和密码一致
        if user:
            # 向session中写入相应的数据
            session['u_id'] = user.u_id
            session['username'] = user.username
            return jsonify(code=200, msg="登录成功", use_id=user.u_id)
        # 如果用户名和密码不一致返回登录页面,并给提示信息
        else:
            msg = '用户名或者密码不一致'
            return jsonify(code=200, msg=msg)


@user_blueprint.route('/logout/', methods=['POST'])
def logout():
    """
    退出登录
    """
    if request.method == 'POST':
        # 清空session
        session.clear()
        # 跳转到登录页面
        return jsonify(code=200, msg="登出成功")


@user_blueprint.route('/stulist/', methods=['GET', 'POST'])
@is_login
def student_list():
    """学生信息列表"""
    if request.method == 'POST':
        students = Student.query.all()
        student_schema = StudentSchema(many=True)
        student_data = student_schema.dump(students)
        return jsonify(student_data)


@user_blueprint.route('/addstu/', methods=['GET', 'POST'])
@is_login
def add_stu():
    """添加学生"""

    if request.method == 'POST':

        s_id = request.values.get('s_id')
        s_name = request.values.get('s_name')
        s_phone = request.values.get('s_phone')
        s_permission = request.values.get('s_permission')
        user_id = session.get('u_id')

        stu = Student.query.filter(Student.s_id == s_id).first()
        if stu:
            msg = '学生学号不能重复'
            return jsonify(code=200, msg=msg)
        stu = Student(s_id=s_id, s_name=s_name, s_phone=s_phone, s_permission=s_permission, user_id=user_id)
        stu.save()

        return jsonify(code=200, msg="添加学生成功")


@user_blueprint.route('/substu/', methods=['GET', 'POST'])
@is_login
def sub_stu():
    """删除学生"""

    if request.method == 'POST':

        s_id = request.values.get('s_id')

        stu = Student.query.filter(Student.s_id == s_id).first()
        if stu:
            db.session.delete(stu)
            db.session.commit()
            return jsonify(code=200, msg="删除学生成功")
        msg = '学生学号不存在'
        return jsonify(code=200, msg=msg)


@user_blueprint.route('/addrole/', methods=['GET', 'POST'])
@is_login
def add_role():
    """添加角色"""

    if request.method == 'POST':
        r_name = request.values.get('r_name')
        role = Role(r_name=r_name)
        role.save()

        return jsonify(code=200, msg="添加角色成功")


@user_blueprint.route('/addpermission/', methods=['GET', 'POST'])
@is_login
def add_permission():
    """添加权限"""

    if request.method == 'POST':
        p_name = request.values.get('p_name')

        permission = Permission(p_name=p_name)
        permission.save()

        return jsonify(code=200, msg="添加权限成功")


@user_blueprint.route('/addroleper/', methods=['GET', 'POST'])
@is_login
def add_role_per():
    """添加角色权限"""

    if request.method == 'POST':
        r_id = request.values.get('r_id')
        p_id = request.values.get('p_id')
        # 获取角色对象
        role = Role.query.get(r_id)
        # 获取权限对象
        per = Permission.query.get(p_id)
        # 添加对应的角色和权限的对应关系
        per.roles.append(role)
        # 添加
        db.session.add(per)
        # 保存信息
        db.session.commit()

        return jsonify(code=200, msg="添加用户权限成功")


@user_blueprint.route('/subroleper/', methods=['GET', 'POST'])
@is_login
def sub_role_per():
    """减少角色权限"""

    if request.method == 'POST':
        r_id = request.args.get('r_id')
        p_id = request.values.get('p_id')

        role = Role.query.get(r_id)
        per = Permission.query.get(p_id)

        # 解除角色和权限的对应关系
        per.roles.remove(role)

        db.session.commit()

        return jsonify(code=200, msg="减少用户权限成功")


@user_blueprint.route('/assignuserrole/', methods=['GET', 'POST'])
@is_login
def assign_user_role():
    if request.method == 'POST':
        r_id = request.values.get('r_id')
        u_id = request.values.get('u_id')
        user = User.query.filter_by(u_id=u_id).first()
        user.role_id = r_id
        db.session.commit()

        return jsonify(code=200, msg="分配用户角色成功")


@user_blueprint.route('/assignsturole/', methods=['GET', 'POST'])
@is_login
def assign_stu_role():
    if request.method == 'POST':
        r_id = request.values.get('r_id')
        s_id = request.values.get('s_id')
        student = Student.query.filter_by(s_id=s_id).first()
        student.role_id = r_id
        db.session.commit()

        return jsonify(code=200, msg="分配学生角色成功")


@user_blueprint.route('/changepwd/', methods=['GET', 'POST'])
@is_login
def change_password():
    """修改用户密码"""

    if request.method == 'POST':
        username = session.get('username')
        pwd1 = request.values.get('pwd1')
        pwd2 = request.values.get('pwd2')
        pwd3 = request.values.get('pwd3')

        pwd = User.query.filter(User.password == pwd1, User.username == username).first()
        if not pwd:
            msg = '请输入正确的旧密码'
            return jsonify(code=200, msg=msg, user=user)
        else:
            if not all([pwd2, pwd3]):
                msg = '密码不能为空'
                return jsonify(code=200, msg=msg, user=user)
            if pwd2 != pwd3:
                msg = '两次密码不一致,请重新输入'
                return jsonify(code=200, msg=msg)
            pwd.password = pwd2
            db.session.commit()
            return jsonify(code=200, msg="修改密码成功")


@user_blueprint.route('/notice/', methods=['GET', 'POST'])
def notice():
    """
    发布通知
    """
    if request.method == 'POST':
        n_title = request.values.get('n_title')
        n_content = request.values.get('n_content')
        user_id = session.get('u_id')
        notice = Notice(n_title=n_title, n_content=n_content, user_id=user_id)
        notice.save()
        return jsonify(code=200, msg="添加通知成功")


@user_blueprint.route('/noticelist/', methods=['GET', 'POST'])
@is_login
def notice_list():
    """通知信息列表"""
    if request.method == 'POST':
        notices = Notice.query.all()
        notice_schema = NoticeSchema(many=True)
        notice_data = notice_schema.dump(notices)
        return jsonify(notice_data)


@user_blueprint.route('/message/', methods=['GET', 'POST'])
def message():
    """
    发布通知
    """
    if request.method == 'POST':
        m_content = request.values.get('m_content')
        m_from = request.values.get('m_from')
        m_to = request.values.get('m_to')
        user_id = session.get('u_id')
        message = Message(m_content=m_content,m_from=m_from,m_to=m_to, user_id=user_id)
        message.save()
        return jsonify(code=200, msg="添加消息成功")


@user_blueprint.route('/messagelist/', methods=['GET', 'POST'])
@is_login
def message_list():
    """通知信息列表"""
    if request.method == 'POST':
        messages = Notice.query.all()
        message_schema = MessageSchema(many=True)
        message_data = message_schema.dump(messages)
        return jsonify(message_data)
