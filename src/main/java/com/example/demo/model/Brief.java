package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

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

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
            name="t_media_brief_practices",
            joinColumns = @JoinColumn(name="id_brief"),
            inverseJoinColumns = @JoinColumn(name="id_practice")
    )
    private Set<Practice> practices;

    @ManyToOne()
    @JoinColumn(name="ID_CLIENT", nullable=false)
    private Partner partner;

    public Brief() {
    }

    public Brief(int id, String campaign, String comment) {
        this.id = id;
        this.campaign = campaign;
        this.comment = comment;
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

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public Set<Practice> getPractices() {
        return practices;
    }

    public void setPractices(Set<Practice> practices) {
        this.practices = practices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brief brief = (Brief) o;
        return id == brief.id &&
                Objects.equals(campaign, brief.campaign) &&
                Objects.equals(comment, brief.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
