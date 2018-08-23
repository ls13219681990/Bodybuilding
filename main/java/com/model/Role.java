package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
    private String id;
    private String name;

    public Role() {
    }

    public Role(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @Column(name = "role_id", length = 16)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "role_name", length = 16)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
