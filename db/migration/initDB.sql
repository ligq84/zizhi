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
account_status VARCHAR(2) DEFAULT'0' COMMENT'用户状态 0启用 1停用'
)engine=INNODB auto_increment=10001;
