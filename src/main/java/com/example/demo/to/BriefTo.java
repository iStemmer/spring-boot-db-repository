package com.example.demo.to;

import com.example.demo.model.Partner;
import com.example.demo.model.Practice;

import java.util.Set;

public class BriefTo {

    private int id;
    private String campaign;
    private String comment;
    private Set<Integer> practiceId;
    private int clientId;


    public BriefTo() {
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

}
