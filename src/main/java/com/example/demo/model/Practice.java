package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_ref_practices")
public class Practice {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "sys_name")
    private String sysname;

    @ManyToMany(mappedBy = "practices", fetch = FetchType.LAZY)
    Set<Brief> briefs;

    public Practice() {
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

        Practice practice = (Practice) o;

        if (id != practice.id) return false;
        return sysname.equals(practice.sysname);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + sysname.hashCode();
        return result;
    }
}
