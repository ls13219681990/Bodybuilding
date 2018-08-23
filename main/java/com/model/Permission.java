package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permission")
public class Permission {
    private String id;
    private String name;
    private String resource;

    public Permission(String id, String name, String resource) {
        this.id = id;
        this.name = name;
        this.resource = resource;
    }

    public Permission() {
    }

    @Id
    @Column(name = "permission_id", length = 16)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "permission_name", length = 16)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "resource", length = 100)
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
