package com.zizhi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "usr_operation_log")
public class OperationLog {
    @Column(name = "operation_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer operationId;

    /**
     * 公司Id
     */
    @Column(name = "company_Id")
    private Integer companyId;

    /**
     * 操作模块
     */
    @Column(name = "operation_module")
    private String operationModule;

    /**
     * 操作功能
     */
    @Column(name = "operation_function")
    private String operationFunction;

    /**
     * 操作类型
     */
    @Column(name = "operation_type")
    private String operationType;

    /**
     * 操作人
     */
    @Column(name = "operation_name")
    private String operationName;

    /**
     * 操作时间
     */
    @Column(name = "operation_time")
    private Date operationTime;

    /**
     * @return operation_Id
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
     * @return company_Id - 公司Id
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
     * @return operation_module - 操作模块
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
     * @return operation_function - 操作功能
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
     * @return operation_type - 操作类型
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
     * @return operation_name - 操作人
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
     * @return operation_time - 操作时间
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