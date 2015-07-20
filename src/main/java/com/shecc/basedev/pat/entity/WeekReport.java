package com.shecc.basedev.pat.entity;

import java.util.Date;

import com.shecc.basedev.core.entity.AbstractEntity;

public class WeekReport extends AbstractEntity{

    private String contractor;

    private String projectid;

    private String projectnae;

    private Date startdate;

    private Date enddate;

    private String projectstatus;

    private String workcontent;

    private String followingplan;

    private String problemanalysis;

    private String riskandsolutions;

    private String extension1;

    private String extension2;

    private String extension3;

    private String extension4;

    private String extension5;

    private String extension6;

    private String extension7;

    private String extension8;

    private String extension9;

    private String extension10;

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor == null ? null : contractor.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public String getProjectnae() {
        return projectnae;
    }

    public void setProjectnae(String projectnae) {
        this.projectnae = projectnae == null ? null : projectnae.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getProjectstatus() {
        return projectstatus;
    }

    public void setProjectstatus(String projectstatus) {
        this.projectstatus = projectstatus == null ? null : projectstatus.trim();
    }

    public String getWorkcontent() {
        return workcontent;
    }

    public void setWorkcontent(String workcontent) {
        this.workcontent = workcontent == null ? null : workcontent.trim();
    }

    public String getFollowingplan() {
        return followingplan;
    }

    public void setFollowingplan(String followingplan) {
        this.followingplan = followingplan == null ? null : followingplan.trim();
    }

    public String getProblemanalysis() {
        return problemanalysis;
    }

    public void setProblemanalysis(String problemanalysis) {
        this.problemanalysis = problemanalysis == null ? null : problemanalysis.trim();
    }

    public String getRiskandsolutions() {
        return riskandsolutions;
    }

    public void setRiskandsolutions(String riskandsolutions) {
        this.riskandsolutions = riskandsolutions == null ? null : riskandsolutions.trim();
    }

    public String getExtension1() {
        return extension1;
    }

    public void setExtension1(String extension1) {
        this.extension1 = extension1 == null ? null : extension1.trim();
    }

    public String getExtension2() {
        return extension2;
    }

    public void setExtension2(String extension2) {
        this.extension2 = extension2 == null ? null : extension2.trim();
    }

    public String getExtension3() {
        return extension3;
    }

    public void setExtension3(String extension3) {
        this.extension3 = extension3 == null ? null : extension3.trim();
    }

    public String getExtension4() {
        return extension4;
    }

    public void setExtension4(String extension4) {
        this.extension4 = extension4 == null ? null : extension4.trim();
    }

    public String getExtension5() {
        return extension5;
    }

    public void setExtension5(String extension5) {
        this.extension5 = extension5 == null ? null : extension5.trim();
    }

    public String getExtension6() {
        return extension6;
    }

    public void setExtension6(String extension6) {
        this.extension6 = extension6 == null ? null : extension6.trim();
    }

    public String getExtension7() {
        return extension7;
    }

    public void setExtension7(String extension7) {
        this.extension7 = extension7 == null ? null : extension7.trim();
    }

    public String getExtension8() {
        return extension8;
    }

    public void setExtension8(String extension8) {
        this.extension8 = extension8 == null ? null : extension8.trim();
    }

    public String getExtension9() {
        return extension9;
    }

    public void setExtension9(String extension9) {
        this.extension9 = extension9 == null ? null : extension9.trim();
    }

    public String getExtension10() {
        return extension10;
    }

    public void setExtension10(String extension10) {
        this.extension10 = extension10 == null ? null : extension10.trim();
    }

}