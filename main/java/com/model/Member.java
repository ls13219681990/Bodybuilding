package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "member")
public class Member {
    private String id;
    private String name;
    private Date registerTime;
    private int phone;
    private String password;
    //剩余金额
    private double remainingSum;
    //消费次数
    private int consumptionNumber;
    //剩余次数
    private int surplusNumber;

    public Member(String id, String name, Date registerTime, int phone, String password, double remainingSum, int consumptionNumber, int surplusNumber) {
        this.id = id;
        this.name = name;
        this.registerTime = registerTime;
        this.phone = phone;
        this.password = password;
        this.remainingSum = remainingSum;
        this.consumptionNumber = consumptionNumber;
        this.surplusNumber = surplusNumber;
    }

    public Member() {
    }

    @Id
    @Column(name = "member_id", length = 16)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "member_name", length = 16)
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

    @Column(name = "remaining_sum", length = 18)
    public double getRemainingSum() {
        return remainingSum;
    }

    public void setRemainingSum(double remainingSum) {
        this.remainingSum = remainingSum;
    }

    @Column(name = "consumption_number", length = 10)
    public int getConsumptionNumber() {
        return consumptionNumber;
    }

    public void setConsumptionNumber(int consumptionNumber) {
        this.consumptionNumber = consumptionNumber;
    }

    @Column(name = "surplus_number", length = 10)
    public int getSurplusNumber() {
        return surplusNumber;
    }

    public void setSurplusNumber(int surplusNumber) {
        this.surplusNumber = surplusNumber;
    }
}
