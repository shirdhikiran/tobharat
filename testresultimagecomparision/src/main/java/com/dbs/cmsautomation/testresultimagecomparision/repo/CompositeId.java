package com.dbs.cmsautomation.testresultimagecomparision.repo;

import java.io.Serializable;

public class CompositeId implements Serializable {

    public CompositeId(){
        /* default constructor */
    }
    public CompositeId(String country, String segment,String url){
        this.country = country;
        this.segment = segment;
        this.url = url;
    }
    private String country;
    private String segment;
    private String url;

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
}
