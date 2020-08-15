package com.dbs.cmsautomation.tasks.repo;

import javax.persistence.*;

@Entity
@Table(name = "delivarables")
public class Delivarables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String creationdate;

    private String taskdescription;

    private String status;

    private String eta;

    private String comments;

    @Override
    public String toString() {
        return "Delivarables{" +
                "id=" + id +
                ", creationdate='" + creationdate + '\'' +
                ", taskdescription='" + taskdescription + '\'' +
                ", status='" + status + '\'' +
                ", eta='" + eta + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }

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

    public String getTaskdescription() {
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
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
}
