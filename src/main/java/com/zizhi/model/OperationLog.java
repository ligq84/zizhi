package com.zizhi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "usr_operation_log")
public class OperationLog {
    private Integer operationId;

    /**
     * 公司Id
     */
    private Integer companyId;

    /**
     * 操作模块
     */
    private String operationModule;

    /**
     * 操作功能
     */
    private String operationFunction;

    /**
     * 操作类型
     */
    private String operationType;

    /**
     * 操作人
     */
    private String operationName;

    /**
     * 操作时间
     */
    private Date operationTime;

    /**
     * @return operationId
     */
    public Integer getOperationId() {
        return operationId;
    }

    /**
     * @param operationId
     */
    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
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
     * 获取操作模块
     *
     * @return operationModule - 操作模块
     */
    public String getOperationModule() {
        return operationModule;
    }

    /**
     * 设置操作模块
     *
     * @param operationModule 操作模块
     */
    public void setOperationModule(String operationModule) {
        this.operationModule = operationModule;
    }

    /**
     * 获取操作功能
     *
     * @return operationFunction - 操作功能
     */
    public String getOperationFunction() {
        return operationFunction;
    }

    /**
     * 设置操作功能
     *
     * @param operationFunction 操作功能
     */
    public void setOperationFunction(String operationFunction) {
        this.operationFunction = operationFunction;
    }

    /**
     * 获取操作类型
     *
     * @return operationType - 操作类型
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * 设置操作类型
     *
     * @param operationType 操作类型
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * 获取操作人
     *
     * @return operationName - 操作人
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * 设置操作人
     *
     * @param operationName 操作人
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * 获取操作时间
     *
     * @return operationTime - 操作时间
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * 设置操作时间
     *
     * @param operationTime 操作时间
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
}