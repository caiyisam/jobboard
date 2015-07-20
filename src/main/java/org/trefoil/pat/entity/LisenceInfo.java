package org.trefoil.pat.entity;

import java.util.Date;

public class LisenceInfo {
    private Integer sid;

    private Integer userSid;

    private Integer orgSid;

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

    public Integer getUserSid() {
        return userSid;
    }

    public void setUserSid(Integer userSid) {
        this.userSid = userSid;
    }

    public Integer getOrgSid() {
        return orgSid;
    }

    public void setOrgSid(Integer orgSid) {
        this.orgSid = orgSid;
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