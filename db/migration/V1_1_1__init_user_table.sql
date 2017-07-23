-- drop database if exists zizhi;
-- create database zizhi;
use zizhi;

-- 新增公司表
DROP TABLE IF EXISTS usrcompany;
CREATE TABLE usr_company (
companyId INT(11) PRIMARY KEY NOT NULL auto_increment,
companyName  VARCHAR(150) DEFAULT'' COMMENT'公司名称',
companyCode  VARCHAR(20) DEFAULT'' COMMENT'公司编码',
contacts VARCHAR(20) DEFAULT'' COMMENT'联系人',
phone VARCHAR(20) DEFAULT'' COMMENT'联系人电话',
createdTime timestamp not null default current_timestamp COMMENT'创建时间'
)engine=INNODB auto_increment=10001;
INSERT INTO usr_company(companyName,companyCode,contacts,phone)
VALUES('趣逛演示公司','8888','曹志峰','13524676562');

-- 创建用户表
DROP TABLE IF EXISTS usr_account;
CREATE TABLE usr_account(
accountId INT(11) PRIMARY KEY NOT NULL auto_increment,
companyId INT(11) NOT NULL  COMMENT'公司Id',
accountPhone VARCHAR(11) DEFAULT'' COMMENT'手机号码',
accountName VARCHAR(20) DEFAULT'' COMMENT'用户名字',
accountLogin VARCHAR(30) DEFAULT'' COMMENT'登录用户名字',
accountPassword VARCHAR(100) DEFAULT'' COMMENT'登录密码',
accountStatus VARCHAR(2) DEFAULT'0' COMMENT'用户状态 0启用 1停用',
createdTime timestamp not null default current_timestamp COMMENT'创建时间'
)engine=INNODB auto_increment=10001;
INSERT INTO usr_account(companyId,accountPhone,accountName,accountLogin,accountPassword)
VALUES(10001,'13524446578','管理员','zzadmin','123456');

-- 用户登录日志表
DROP TABLE IF EXISTS usr_login_log;
CREATE TABLE usr_login_log(
logId INT(11) PRIMARY KEY NOT NULL auto_increment,
companyId INT(11) NOT NULL  COMMENT'公司Id',
accountLogin VARCHAR(30) DEFAULT'' COMMENT'登录用户名',
accountName VARCHAR(20) DEFAULT'' COMMENT'登录人',
loginIp VARCHAR(100) DEFAULT'' COMMENT'登录ip',
loginTime timestamp not null default current_timestamp COMMENT'登录时间'
)engine=INNODB auto_increment=10001;

-- 用户操作日志表
DROP TABLE IF EXISTS usr_operation_log;
CREATE TABLE usr_operation_log(
operationId INT(11) PRIMARY KEY NOT NULL auto_increment,
companyId INT(11) NOT NULL  COMMENT'公司Id',
operationModule VARCHAR(30) DEFAULT'' COMMENT'操作模块',
operationFunction VARCHAR(20) DEFAULT'' COMMENT'操作功能',
operationType VARCHAR(20) DEFAULT'' COMMENT'操作类型',
operationName VARCHAR(100) DEFAULT'' COMMENT'操作人',
operationTime timestamp not null default current_timestamp COMMENT'操作时间'
)engine=INNODB auto_increment=10001;

-- 权限表
DROP TABLE IF EXISTS usr_permission;
CREATE TABLE usr_permission (
permissionId INT(11) PRIMARY KEY NOT NULL auto_increment,
permissionName VARCHAR(50) DEFAULT'' COMMENT'权限名称',
permissionDesc VARCHAR(50) DEFAULT'' COMMENT'权限描述',
permissionCategory VARCHAR(50) DEFAULT'' COMMENT'权限类型',
createdTime timestamp not null default current_timestamp COMMENT'创建时间'
)engine=INNODB auto_increment=10001;

-- 用户权限表
DROP TABLE IF EXISTS usr_account_permission;
CREATE TABLE usr_account_permission (
userPermissionId INT(11) PRIMARY KEY NOT NULL auto_increment,
accountId INT(11) NOT NULL  COMMENT'归属用户',
permissionId INT(11) NOT NULL  COMMENT'权限Id',
createdAccountid INT(11) NOT NULL  COMMENT'创建者',
createdTime timestamp not null default current_timestamp COMMENT'创建时间',
updatedAccountid  INT(11) NOT NULL  COMMENT'更新者',
updatedTime timestamp not null default current_timestamp COMMENT'跟新时间'
)engine=INNODB auto_increment=10001;

