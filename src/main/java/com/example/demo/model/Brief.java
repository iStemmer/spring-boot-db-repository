package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="t_media_brief")
public class Brief {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name="campaign")
    private String campaign;
    @Column(name="comment")
    private String comment;

    @Column(name = "ID_CLIENT")
    private int clientId;

    public Brief() {
    }

    public Brief(int id, String campaign, String comment, int clientId) {
        this.id = id;
        this.campaign = campaign;
        this.comment = comment;
        this.clientId = clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brief brief = (Brief) o;
        return id == brief.id &&
                clientId == brief.clientId &&
                Objects.equals(campaign, brief.campaign) &&
                Objects.equals(comment, brief.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
