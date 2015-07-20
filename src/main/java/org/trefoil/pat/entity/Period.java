package org.trefoil.pat.entity;

import java.util.Date;

public class Period {
    private Integer sid;

    private Integer projectsid;

    private String sequence;

    private String iterationname;

    private Date starttime;

    private Date endtime;

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

    public Integer getProjectsid() {
        return projectsid;
    }

    public void setProjectsid(Integer projectsid) {
        this.projectsid = projectsid;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }

    public String getIterationname() {
        return iterationname;
    }

    public void setIterationname(String iterationname) {
        this.iterationname = iterationname == null ? null : iterationname.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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