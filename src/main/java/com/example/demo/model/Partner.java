package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "t_ref_partner")
public class Partner {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "sys_name")
    private String sysname;

    public Partner() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSysname() {
        return sysname;
    }

    public void setSysname(String sysname) {
        this.sysname = sysname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partner partner = (Partner) o;

        if (id != partner.id) return false;
        return sysname != null ? sysname.equals(partner.sysname) : partner.sysname == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sysname != null ? sysname.hashCode() : 0);
        return result;
    }
}
