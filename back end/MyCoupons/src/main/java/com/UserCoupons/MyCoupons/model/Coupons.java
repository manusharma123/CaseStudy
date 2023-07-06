package com.UserCoupons.MyCoupons.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="myCoupons")
public class Coupons {
    @Id
    private String couponId;
    private String couponName;
    private String couponType;
    private String couponDiscount;
    private String email;
    private String transactionType;
    private String transactionID;
    private String couponTC;
    private String couponCode;

    public Coupons(String couponId, String couponName, String couponType, String couponDiscount, String email, String transactionType, String transactionID, String couponTC, String couponCode) {
        this.couponId = couponId;
        this.couponName = couponName;
        this.couponType = couponType;
        this.couponDiscount = couponDiscount;
        this.email = email;
        this.transactionType = transactionType;
        this.transactionID = transactionID;
        this.couponTC = couponTC;
        this.couponCode = couponCode;
    }

    public Coupons() {
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(String couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getCouponTC() {
        return couponTC;
    }

    public void setCouponTC(String couponTC) {
        this.couponTC = couponTC;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}

