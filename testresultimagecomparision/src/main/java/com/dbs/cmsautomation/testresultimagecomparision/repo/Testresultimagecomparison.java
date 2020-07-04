package com.dbs.cmsautomation.testresultimagecomparision.repo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CompositeId.class)
public class Testresultimagecomparison {
    private Integer sno;
    @Id
    private String country;
    @Id
    private String segment;
    @Id
    private String url;
    private String runid;
    private String exp_screenshot_timestamp;
    private String act_screenshot_timestamp;
    private byte[] exp_screenshot;
    private byte[]  act_screenshot_withdiffs;
    private String status;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRunid() {
        return runid;
    }

    public void setRunid(String runid) {
        this.runid = runid;
    }

    public String getExp_screenshot_timestamp() {
        return exp_screenshot_timestamp;
    }

    public void setExp_screenshot_timestamp(String exp_screenshot_timestamp) {
        this.exp_screenshot_timestamp = exp_screenshot_timestamp;
    }

    public String getAct_screenshot_timestamp() {
        return act_screenshot_timestamp;
    }

    public void setAct_screenshot_timestamp(String act_screenshot_timestamp) {
        this.act_screenshot_timestamp = act_screenshot_timestamp;
    }

    public byte[] getExp_screenshot() {
        return exp_screenshot;
    }

    public void setExp_screenshot(byte[] exp_screenshot) {
        this.exp_screenshot = exp_screenshot;
    }

    public byte[] getAct_screenshot_withdiffs() {
        return act_screenshot_withdiffs;
    }

    public void setAct_screenshot_withdiffs(byte[] act_screenshot_withdiffs) {
        this.act_screenshot_withdiffs = act_screenshot_withdiffs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
