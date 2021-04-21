import json

from flask import Blueprint, redirect, render_template, request, url_for, session, jsonify
from geventwebsocket import WebSocketError

from App.models import db, User, Grade, Student, Role, Permission, GradeSchema
from utils.login import is_login

from gevent.pywsgi import WSGIServer

user_socket_list = []
user_socket_dict = {}

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
        username = request.values.get('username')
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
        # 判断两次填写的密码是否一致
        if pwd1 != pwd2:
            msg, flag = '两次密码不一致', False
        # 如果上面的检查有任意一项没有通过就返回注册页面,并提示响应的信息
        if not flag:
            return jsonify(code=200, msg=msg)

        # 核对输入的用户是否已经被注册了
        u = User.query.filter(User.username == username).first()
        # 判断用户名是否已经存在
        if u:
            msg = '用户名已经存在'
            return jsonify(code=200, msg=msg)
        # 上面的验证全部通过后就开始创建新用户
        user = User(username=username, password=pwd1)
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
        username = request.values.get('username')
        password = request.values.get('password')
        # 判断用户名和密码是否填写
        if not all([username, password]):
            msg = '请填写好完整的信息'
            return jsonify(code=200, msg=msg)
        # 核对用户名和密码是否一致
        user = User.query.filter_by(username=username, password=password).first()
        # 如果用户名和密码一致
        if user:
            # 向session中写入相应的数据
            session['user_id'] = user.u_id
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


@user_blueprint.route('/addgrade/', methods=['GET', 'POST'])
@is_login
def add_grade():
    """添加班级"""

    g_name = request.values.get('g_name')
    g = Grade.query.filter(Grade.g_name == g_name).first()
    # 判断要添加的信息数据库中是否存在(因为班级名称不能重复)
    if g:
        msg = '班级名称不能重复,请核对好在来添加'
        return jsonify(code=200, msg=msg)
    # 创建班级
    grade = Grade(g_name)
    # 保存班级信息
    grade.save()

    return jsonify(code=200, msg="添加班级成功")


@user_blueprint.route('/editgrade/', methods=['GET', 'POST'])
@is_login
def edit_grade():
    """编辑班级"""

    if request.method == 'POST':
        # 获取需要修改的班级id
        g_id = request.values.get('g_id')
        g_name = request.values.get('g_name')
        # 通过获取到的班级id
        grade = Grade.query.filter(Grade.g_id == g_id).first()
        # 重新给班级赋值
        grade.g_name = g_name
        grade.save()

        return jsonify(code=200, msg="编辑班级成功")


@user_blueprint.route('/gradelist/', methods=['GET', 'POST'])
@is_login
def grade_list():
    """班级信息列表"""
    if request.method == 'POST':
        grades = Grade.query.all()
        grade_schema = GradeSchema(many=True)
        grade_data = grade_schema.dump(grades)
        return jsonify(grade_data)


@user_blueprint.route('/addstu/', methods=['GET', 'POST'])
@is_login
def add_stu():
    """添加学生"""

    if request.method == 'POST':
        s_name = request.values.get('s_name')
        s_sex = request.values.get('s_sex')
        grade_id = request.values.get('g_id')

        stu = Student.query.filter(Student.s_name == s_name).first()
        if stu:
            msg = '学生姓名不能重复'
            grades = Grade.query.all()
            return jsonify(code=200, msg=msg, grades=grades)
        stu = Student(s_name=s_name, s_sex=s_sex, grade_id=grade_id)
        stu.save()

        return jsonify(code=200, msg="添加学生成功")


@user_blueprint.route('/addroles/', methods=['GET', 'POST'])
@is_login
def add_roles():
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
        p_er = request.values.get('p_er')

        permission = Permission(p_name=p_name, p_er=p_er)
        permission.save()

        return jsonify(code=200, msg="添加权限成功")


@user_blueprint.route('/eidtorpermission/', methods=['GET', 'POST'])
@is_login
def eidtor_permission():
    """编辑权限"""

    if request.method == 'POST':
        p_id = request.values.get('p_id')
        p_name = request.values.get('p_name')
        p_er = request.values.get('p_er')

        permission = Permission.query.filter(Permission.p_id == p_id).first()
        # 重新给班级赋值
        permission.p_name = p_name
        permission.p_er = p_er
        permission.save()

        return jsonify(code=200, msg="编辑权限成功")


@user_blueprint.route('/adduserper/', methods=['GET', 'POST'])
@is_login
def add_user_per():
    """添加用户权限"""

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


@user_blueprint.route('/subuserper/', methods=['GET', 'POST'])
@is_login
def sub_user_per():
    """减少用户权限"""

    if request.method == 'POST':
        r_id = request.args.get('r_id')
        p_id = request.values.get('p_id')

        role = Role.query.get(r_id)
        per = Permission.query.get(p_id)

        # 解除角色和权限的对应关系
        per.roles.remove(role)

        db.session.commit()

        return jsonify(code=200, msg="减少用户权限成功")


@user_blueprint.route('/assignrole/', methods=['GET', 'POST'])
@is_login
def assign_user_role():
    """分配用户权限"""

    if request.method == 'POST':
        r_id = request.values.get('r_id')
        u_id = request.values.get('u_id')
        user = User.query.filter_by(u_id=u_id).first()
        user.role_id = r_id
        db.session.commit()

        return jsonify(code=200, msg="分配用户权限成功")


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
            username = session.get('username')
            user = User.query.filter_by(username=username).first()
            return jsonify(code=200, msg=msg)
        else:
            if not all([pwd2, pwd3]):
                msg = '密码不能为空'
                username = session.get('username')
                user = User.query.filter_by(username=username).first()
                return jsonify(code=200, msg=msg)
            if pwd2 != pwd3:
                msg = '两次密码不一致,请重新输入'
                username = session.get('username')
                user = User.query.filter_by(username=username).first()
                return jsonify(code=200, msg=msg)
            pwd.password = pwd2
            db.session.commit()
            return jsonify(code=200, msg="修改密码成功")


@user_blueprint.route('/ws/', methods=['GET', 'POST'])
@is_login
def my_ws_func():
    # print(dir(request.environ))
    user_socket = request.environ.get("wsgi.websocket")  # type:WebSocket
    user_socket_list.append(user_socket)
    # web + socket
    print(user_socket)
    while 1:
        msg = user_socket.receive()  # 等待接收客户端发送过来的消息
        for us in user_socket_list:
            if us == user_socket:
                continue
            try:
                us.send(msg)
            except:
                continue

        # print(msg)
        # user_socket.send(msg)
