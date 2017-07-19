-- drop database if exists zizhi;
-- create database zizhi;
use zizhi;

-- 新增公司表
DROP TABLE IF EXISTS usr_company;
CREATE TABLE usr_company (
company_Id INT(11) PRIMARY KEY NOT NULL auto_increment,
company_name  VARCHAR(150) DEFAULT'' COMMENT'公司名称',
company_code  VARCHAR(20) DEFAULT'' COMMENT'公司编码',
contacts VARCHAR(20) DEFAULT'' COMMENT'联系人',
phone VARCHAR(20) DEFAULT'' COMMENT'联系人电话',
created_time timestamp not null default current_timestamp COMMENT'创建时间'
)engine=INNODB auto_increment=10001;
INSERT INTO usr_company(company_name,company_code,contacts,phone)
VALUES('趣逛演示公司','8888','曹志峰','13524676562');

-- 创建用户表
DROP TABLE IF EXISTS usr_account;
CREATE TABLE usr_account(
account_Id INT(11) PRIMARY KEY NOT NULL auto_increment,
company_Id INT(11) NOT NULL  COMMENT'公司Id',
account_phone VARCHAR(11) DEFAULT'' COMMENT'手机号码',
account_name VARCHAR(20) DEFAULT'' COMMENT'用户名字',
account_login VARCHAR(30) DEFAULT'' COMMENT'登录用户名字',
account_password VARCHAR(100) DEFAULT'' COMMENT'登录密码',
account_status VARCHAR(2) DEFAULT'0' COMMENT'用户状态 0启用 1停用',
created_time timestamp not null default current_timestamp COMMENT'创建时间'
)engine=INNODB auto_increment=10001;
INSERT INTO usr_account(company_Id,account_phone,account_name,account_login,account_password)
VALUES(10001,'13524446578','管理员','zzadmin','123456');

-- 用户登录日志表
DROP TABLE IF EXISTS usr_login_log;
CREATE TABLE usr_login_log(
log_Id INT(11) PRIMARY KEY NOT NULL auto_increment,
company_Id INT(11) NOT NULL  COMMENT'公司Id',
account_login VARCHAR(30) DEFAULT'' COMMENT'登录用户名',
account_name VARCHAR(20) DEFAULT'' COMMENT'登录人',
login_Ip VARCHAR(100) DEFAULT'' COMMENT'登录ip',
login_time timestamp not null default current_timestamp COMMENT'登录时间'
)engine=INNODB auto_increment=10001;

-- 用户操作日志表
DROP TABLE IF EXISTS usr_operation_log;
CREATE TABLE usr_operation_log(
operation_Id INT(11) PRIMARY KEY NOT NULL auto_increment,
company_Id INT(11) NOT NULL  COMMENT'公司Id',
operation_module VARCHAR(30) DEFAULT'' COMMENT'操作模块',
operation_function VARCHAR(20) DEFAULT'' COMMENT'操作功能',
operation_type VARCHAR(20) DEFAULT'' COMMENT'操作类型',
operation_name VARCHAR(100) DEFAULT'' COMMENT'操作人',
operation_time timestamp not null default current_timestamp COMMENT'操作时间'
)engine=INNODB auto_increment=10001;

-- 权限表
DROP TABLE IF EXISTS usr_permission;
CREATE TABLE usr_permission (
permissionId INT(11) PRIMARY KEY NOT NULL auto_increment,
permission_name VARCHAR(50) DEFAULT'' COMMENT'权限名称',
permission_desc VARCHAR(50) DEFAULT'' COMMENT'权限描述',
permission_category VARCHAR(50) DEFAULT'' COMMENT'权限类型',
created_time timestamp not null default current_timestamp COMMENT'创建时间'
)engine=INNODB auto_increment=10001;

-- 用户权限表
DROP TABLE IF EXISTS usr_account_permission;
CREATE TABLE usr_account_permission (
userPermissionId INT(11) PRIMARY KEY NOT NULL auto_increment,
account_Id INT(11) NOT NULL  COMMENT'归属用户',
permissionId INT(11) NOT NULL  COMMENT'权限Id',
created_accountid INT(11) NOT NULL  COMMENT'创建者',
created_time timestamp not null default current_timestamp COMMENT'创建时间',
updated_accountid  INT(11) NOT NULL  COMMENT'更新者',
updated_time timestamp not null default current_timestamp COMMENT'跟新时间'
)engine=INNODB auto_increment=10001;

