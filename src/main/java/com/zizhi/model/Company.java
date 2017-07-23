package com.zizhi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "usr_company")
public class Company {
    private Integer companyId;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司编码
     */
    private String companyCode;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系人电话
     */
    private String phone;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * @return companyId
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取公司名称
     *
     * @return companyName - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取公司编码
     *
     * @return companyCode - 公司编码
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 设置公司编码
     *
     * @param companyCode 公司编码
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取联系人电话
     *
     * @return phone - 联系人电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系人电话
     *
     * @param phone 联系人电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
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