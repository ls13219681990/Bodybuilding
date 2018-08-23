package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order {
    private String id;
    //产品类别
    private String productCategory;
    //消费用户
    private String memberId;
    //消费时间
    private Date consumptionDate;
    //消费方式
    private String consumptionWay;
    //消费次数
    private String consumptionNumber;
    //消费金额
    private double consumptionSum;

    public Order() {
    }

    public Order(String id, String productCategory, String memberId, Date consumptionDate, String consumptionWay, String consumptionNumber, double consumptionSum) {
        this.id = id;
        this.productCategory = productCategory;
        this.memberId = memberId;
        this.consumptionDate = consumptionDate;
        this.consumptionWay = consumptionWay;
        this.consumptionNumber = consumptionNumber;
        this.consumptionSum = consumptionSum;
    }

    @Id
    @Column(name = "order_id", length = 16)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "product_id", length = 16)
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Column(name = "member_id", length = 16)
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Column(name = "consumption_date", length = 20)
    public Date getConsumptionDate() {
        return consumptionDate;
    }

    public void setConsumptionDate(Date consumptionDate) {
        this.consumptionDate = consumptionDate;
    }

    @Column(name = "consumption_way", length = 10)
    public String getConsumptionWay() {
        return consumptionWay;
    }

    public void setConsumptionWay(String consumptionWay) {
        this.consumptionWay = consumptionWay;
    }

    @Column(name = "consumption_number", length = 10)
    public String getConsumptionNumber() {
        return consumptionNumber;
    }

    public void setConsumptionNumber(String consumptionNumber) {
        this.consumptionNumber = consumptionNumber;
    }

    @Column(name = "consumption_sum", length = 20)
    public double getConsumptionSum() {
        return consumptionSum;
    }

    public void setConsumptionSum(double consumptionSum) {
        this.consumptionSum = consumptionSum;
    }
}
