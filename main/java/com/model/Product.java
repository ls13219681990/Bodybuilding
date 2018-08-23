package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product {
    private String id;
    private String name;
    //产品简介
    private String briefIntroduction;
    private double money;
    //有效期（开始）
    private Date startTermValidity;
    //有效期（结束）
    private Date endTermValidity;

    public Product(String id, String name, String briefIntroduction, double money, Date startTermValidity, Date endTermValidity) {
        this.id = id;
        this.name = name;
        this.briefIntroduction = briefIntroduction;
        this.money = money;
        this.startTermValidity = startTermValidity;
        this.endTermValidity = endTermValidity;
    }

    @Id
    @Column(name = "product_id", length = 16)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "product_name", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "brief_introduction", length = 500)
    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
    }

    @Column(name = "money", length = 10)
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Column(name = "start_term_validity", length = 20)
    public Date getStartTermValidity() {
        return startTermValidity;
    }

    public void setStartTermValidity(Date startTermValidity) {
        this.startTermValidity = startTermValidity;
    }

    @Column(name = "end_term_validity", length = 20)
    public Date getEndTermValidity() {
        return endTermValidity;
    }

    public void setEndTermValidity(Date endTermValidity) {
        this.endTermValidity = endTermValidity;
    }
}
