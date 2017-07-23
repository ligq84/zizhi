package com.zizhi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "usr_login_log")
public class LoginLog {
    private Integer logId;

    /**
     * 公司Id
     */
    private Integer companyId;

    /**
     * 登录用户名
     */
    private String accountLogin;

    /**
     * 登录人
     */
    private String accountName;

    /**
     * 登录ip
     */
    private String loginIp;

    /**
     * 登录时间
     */
    private Date loginTime;

    /**
     * @return logId
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * @param logId
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
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
     * 获取登录用户名
     *
     * @return accountLogin - 登录用户名
     */
    public String getAccountLogin() {
        return accountLogin;
    }

    /**
     * 设置登录用户名
     *
     * @param accountLogin 登录用户名
     */
    public void setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
    }

    /**
     * 获取登录人
     *
     * @return accountName - 登录人
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置登录人
     *
     * @param accountName 登录人
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取登录ip
     *
     * @return loginIp - 登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录ip
     *
     * @param loginIp 登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取登录时间
     *
     * @return loginTime - 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}