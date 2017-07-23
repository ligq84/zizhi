package com.zizhi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "usr_account")
public class Account {
    private Integer accountId;

    /**
     * 公司Id
     */
    private Integer companyId;

    /**
     * 手机号码
     */
    private String accountPhone;

    /**
     * 用户名字
     */
    private String accountName;

    /**
     * 登录用户名字
     */
    private String accountLogin;

    /**
     * 登录密码
     */
    private String accountPassword;

    /**
     * 用户状态 0启用 1停用
     */
    private String accountStatus;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * @return accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * @param accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取公司Id
     *
     * @return companyId - 公司Id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置公司Id
     *
     * @param companyId 公司Id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取手机号码
     *
     * @return accountPhone - 手机号码
     */
    public String getAccountPhone() {
        return accountPhone;
    }

    /**
     * 设置手机号码
     *
     * @param accountPhone 手机号码
     */
    public void setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
    }

    /**
     * 获取用户名字
     *
     * @return accountName - 用户名字
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置用户名字
     *
     * @param accountName 用户名字
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取登录用户名字
     *
     * @return accountLogin - 登录用户名字
     */
    public String getAccountLogin() {
        return accountLogin;
    }

    /**
     * 设置登录用户名字
     *
     * @param accountLogin 登录用户名字
     */
    public void setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
    }

    /**
     * 获取登录密码
     *
     * @return accountPassword - 登录密码
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * 设置登录密码
     *
     * @param accountPassword 登录密码
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     * 获取用户状态 0启用 1停用
     *
     * @return accountStatus - 用户状态 0启用 1停用
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * 设置用户状态 0启用 1停用
     *
     * @param accountStatus 用户状态 0启用 1停用
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * 获取创建时间
     *
     * @return createdTime - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}