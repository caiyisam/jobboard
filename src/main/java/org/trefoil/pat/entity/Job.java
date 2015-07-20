package org.trefoil.pat.entity;

import java.util.Date;

public class Job {
    private Integer sid;

    private String jobname;

    private Date estimatestarttime;

    private Date estimateendtime;

    private Integer estimateworkingtime;

    private Date realstarttime;

    private Date realendtime;

    private Integer realworkingtime;

    private String desc;

    private Integer moduleSid;

    private Integer projectSid;

    private Integer iterationSid;

    private Integer functionarySid;

    private Integer stateSid;

    private Integer createdBy;

    private Date createdDt;

    private Integer updatedBy;

    private Date updatedDt;

    private Integer version;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public Date getEstimatestarttime() {
        return estimatestarttime;
    }

    public void setEstimatestarttime(Date estimatestarttime) {
        this.estimatestarttime = estimatestarttime;
    }

    public Date getEstimateendtime() {
        return estimateendtime;
    }

    public void setEstimateendtime(Date estimateendtime) {
        this.estimateendtime = estimateendtime;
    }

    public Integer getEstimateworkingtime() {
        return estimateworkingtime;
    }

    public void setEstimateworkingtime(Integer estimateworkingtime) {
        this.estimateworkingtime = estimateworkingtime;
    }

    public Date getRealstarttime() {
        return realstarttime;
    }

    public void setRealstarttime(Date realstarttime) {
        this.realstarttime = realstarttime;
    }

    public Date getRealendtime() {
        return realendtime;
    }

    public void setRealendtime(Date realendtime) {
        this.realendtime = realendtime;
    }

    public Integer getRealworkingtime() {
        return realworkingtime;
    }

    public void setRealworkingtime(Integer realworkingtime) {
        this.realworkingtime = realworkingtime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getModuleSid() {
        return moduleSid;
    }

    public void setModuleSid(Integer moduleSid) {
        this.moduleSid = moduleSid;
    }

    public Integer getProjectSid() {
        return projectSid;
    }

    public void setProjectSid(Integer projectSid) {
        this.projectSid = projectSid;
    }

    public Integer getIterationSid() {
        return iterationSid;
    }

    public void setIterationSid(Integer iterationSid) {
        this.iterationSid = iterationSid;
    }

    public Integer getFunctionarySid() {
        return functionarySid;
    }

    public void setFunctionarySid(Integer functionarySid) {
        this.functionarySid = functionarySid;
    }

    public Integer getStateSid() {
        return stateSid;
    }

    public void setStateSid(Integer stateSid) {
        this.stateSid = stateSid;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}