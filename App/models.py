from datetime import datetime
# 导入SQLAlchemy模块
from flask import jsonify, request
from flask_marshmallow import Marshmallow
from flask_sqlalchemy import SQLAlchemy
from marshmallow_sqlalchemy import ModelSchema

# 初始化db
db = SQLAlchemy()


class User(db.Model):
    """用户模型"""
    u_id = db.Column(db.String(200), primary_key=True)
    username = db.Column(db.String(16))
    password = db.Column(db.String(200))
    u_phone = db.Column(db.String(11))
    u_create_time = db.Column(db.DateTime, default=datetime.now)

    # 用户和角色的一对多的关联关系
    role_id = db.Column(db.Integer, db.ForeignKey('role.r_id'))

    __tablename__ = 'user'

    def __init__(self, u_id, username, password, u_phone):
        self.u_id = u_id
        self.username = username
        self.password = password
        self.u_phone = u_phone

    def save(self):
        db.session.add(self)
        db.session.commit()


class Student(db.Model):
    """学生模型"""
    s_id = db.Column(db.String(200), primary_key=True)
    s_name = db.Column(db.String(16))
    s_phone = db.Column(db.String(11))
    s_permission = db.Column(db.Integer)
    s_create_time = db.Column(db.DateTime, default=datetime.now)

    # 设置与班级 一对多的关联关系`
    user_id = db.Column(db.String(200), db.ForeignKey('user.u_id'), nullable=True)

    __tablename__ = 'student'

    def __init__(self, s_id, s_name, s_phone, s_permission, user_id):
        self.s_id = s_id
        self.s_name = s_name
        self.s_phone = s_phone
        self.s_permission = s_permission
        self.user_id = user_id

    def save(self):
        db.session.add(self)
        db.session.commit()


class Message(db.Model):
    """消息模型"""
    m_id = db.Column(db.Integer, autoincrement=True, primary_key=True)
    m_content = db.Column(db.String(200))
    m_from = db.Column(db.String(200))
    m_to = db.Column(db.String(200))
    m_create_time = db.Column(db.DateTime, default=datetime.now)

    # 设置与班级 一对多的关联关系`
    user_id = db.Column(db.String(200), db.ForeignKey('user.u_id'), nullable=True)

    __tablename__ = 'message'

    def __init__(self, m_content, m_from, m_to, user_id):
        self.m_content = m_content
        self.m_from = m_from
        self.m_to = m_to
        self.user_id = user_id

    def save(self):
        db.session.add(self)
        db.session.commit()


class Notice(db.Model):
    """通知模型"""
    n_id = db.Column(db.Integer, autoincrement=True, primary_key=True)
    n_title = db.Column(db.String(200))
    n_content = db.Column(db.String(200))
    n_create_time = db.Column(db.DateTime, default=datetime.now)

    # 设置与用户 一对多的关联关系`
    user_id = db.Column(db.String(200), db.ForeignKey('user.u_id'), nullable=True)

    __tablename__ = 'notice'

    def __init__(self, n_title, n_content, user_id):
        self.n_title = n_title
        self.n_content = n_content
        self.user_id = user_id

    def save(self):
        db.session.add(self)
        db.session.commit()


# 角色和权限的(多对多的)关联表
# r_p为关联表的表名
r_p = db.Table('r_p',
               db.Column('role_id', db.Integer, db.ForeignKey('role.r_id'), primary_key=True),
               db.Column('permission_id', db.Integer, db.ForeignKey('permission.p_id'), primary_key=True))


class Role(db.Model):
    r_id = db.Column(db.Integer, autoincrement=True, primary_key=True)
    r_name = db.Column(db.String(10))
    # 用户和角色的一对多的关联关系
    users = db.relationship('User', backref='role')

    __tablename__ = 'role'

    def __init__(self, r_name):
        self.r_name = r_name

    def save(self):
        db.session.add(self)
        db.session.commit()


class Permission(db.Model):
    p_id = db.Column(db.Integer, autoincrement=True, primary_key=True)
    p_name = db.Column(db.String(16), unique=True)
    # 角色和权限的多对多的关系
    roles = db.relationship('Role', secondary=r_p, backref=db.backref('permission', lazy=True))

    __tablename__ = 'permission'

    def __init__(self, p_name):
        self.p_name = p_name

    def save(self):
        db.session.add(self)
        db.session.commit()


class StudentSchema(ModelSchema):
    class Meta:
        model = Student


class NoticeSchema(ModelSchema):
    class Meta:
        model = Notice


class MessageSchema(ModelSchema):
    class Meta:
        model = Message
