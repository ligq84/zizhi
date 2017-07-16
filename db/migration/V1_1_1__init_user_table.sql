drop database if exists zizhi;
create database zizhi;
use zizhi;

-- 创建用户表
DROP TABLE IF EXISTS usr_account;
CREATE TABLE usr_account(
account_Id INT(11) PRIMARY KEY NOT NULL auto_increment,
account_phone VARCHAR(11) DEFAULT'' COMMENT'手机号码',
account_name VARCHAR(20) DEFAULT'' COMMENT'用户名字',
account_login VARCHAR(30) DEFAULT'' COMMENT'登录用户名字',
account_password VARCHAR(100) DEFAULT'' COMMENT'登录密码',
account_status VARCHAR(2) DEFAULT'0' COMMENT'用户状态 0启用 1停用',
created_time timestamp not null default current_timestamp COMMENT'创建时间'
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