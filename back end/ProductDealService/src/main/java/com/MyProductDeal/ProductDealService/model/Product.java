package com.MyProductDeal.ProductDealService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("myProductDeal")
public class Product {

    @Id
    private String id;
    private String platformName;
    private String dealCode;
    private String email;
    private String transactionType;
    private String transactionId;

    public Product(String id, String platformName, String dealCode, String email, String transactionType, String transactionId) {
        this.id = id;
        this.platformName = platformName;
        this.dealCode = dealCode;
        this.email = email;
        this.transactionType = transactionType;
        this.transactionId = transactionId;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", platformName='" + platformName + '\'' +
                ", dealCode='" + dealCode + '\'' +
                ", email='" + email + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getDealCode() {
        return dealCode;
    }

    public void setDealCode(String dealCode) {
        this.dealCode = dealCode;
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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
