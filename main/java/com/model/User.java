package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "role")
public class User {

    private String id;
    private String name;
    private Date registerTime;
    private int phone;
    private String password;

    public User() {
    }

    public User(String id, String name, Date registerTime, int phone, String password) {
        this.id = id;
        this.name = name;
        this.registerTime = registerTime;
        this.phone = phone;
        this.password = password;
    }

    @Id
    @Column(name = "user_id", length = 16)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "user_name", length = 16)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "register_time", length = 20)
    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    @Column(name = "phone", length = 11)
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Column(name = "password", length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
