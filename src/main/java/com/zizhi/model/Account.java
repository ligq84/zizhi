package com.zizhi.model;

import javax.persistence.*;

@Table(name = "usr_account")
public class Account {
    @Column(name = "accountId")
    private Integer accountid;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户名字
     */
    @Column(name = "accountName")
    private String accountname;

    /**
     * 登录用户名字
     */
    @Column(name = "accountLogin")
    private String accountlogin;

    /**
     * 登录密码
     */
    @Column(name = "accountPassword")
    private String accountpassword;

    /**
     * 用户类型
     */
    @Column(name = "accountType")
    private String accounttype;

    /**
     * 归属门店id
     */
    @Column(name = "shopId")
    private Integer shopid;

    /**
     * @return accountId
     */
    public Integer getAccountid() {
        return accountid;
    }

    /**
     * @param accountid
     */
    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户名字
     *
     * @return accountName - 用户名字
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * 设置用户名字
     *
     * @param accountname 用户名字
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
     * 获取登录用户名字
     *
     * @return accountLogin - 登录用户名字
     */
    public String getAccountlogin() {
        return accountlogin;
    }

    /**
     * 设置登录用户名字
     *
     * @param accountlogin 登录用户名字
     */
    public void setAccountlogin(String accountlogin) {
        this.accountlogin = accountlogin;
    }

    /**
     * 获取登录密码
     *
     * @return accountPassword - 登录密码
     */
    public String getAccountpassword() {
        return accountpassword;
    }

    /**
     * 设置登录密码
     *
     * @param accountpassword 登录密码
     */
    public void setAccountpassword(String accountpassword) {
        this.accountpassword = accountpassword;
    }

    /**
     * 获取用户类型
     *
     * @return accountType - 用户类型
     */
    public String getAccounttype() {
        return accounttype;
    }

    /**
     * 设置用户类型
     *
     * @param accounttype 用户类型
     */
    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    /**
     * 获取归属门店id
     *
     * @return shopId - 归属门店id
     */
    public Integer getShopid() {
        return shopid;
    }

    /**
     * 设置归属门店id
     *
     * @param shopid 归属门店id
     */
    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }
}