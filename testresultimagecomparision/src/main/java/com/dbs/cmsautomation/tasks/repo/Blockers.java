package com.dbs.cmsautomation.tasks.repo;

import javax.persistence.*;

@Entity
@Table(name = "blockers")
public class Blockers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String creationdate;
    private String blockerdetails;
    private String status;
    private String eta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    public String getBlockerdetails() {
        return blockerdetails;
    }

    public void setBlockerdetails(String blockerdetails) {
        this.blockerdetails = blockerdetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    private String comments;
}
