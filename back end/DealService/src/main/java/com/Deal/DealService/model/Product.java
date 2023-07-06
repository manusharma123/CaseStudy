package com.Deal.DealService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("addProductDeal")
public class Product {

    @Id
    private String id;
    private String platformName;
    private String dealName;
    private String dealType;
    private String dealCode;
    private int price;

    public Product() {
    }

    public Product(String id, String platformName, String dealName, String dealType, String dealCode, int price) {
        this.id = id;
        this.platformName = platformName;
        this.dealName = dealName;
        this.dealType = dealType;
        this.dealCode = dealCode;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", platformName='" + platformName + '\'' +
                ", dealName='" + dealName + '\'' +
                ", dealType='" + dealType + '\'' +
                ", dealCode='" + dealCode + '\'' +
                ", price=" + price +
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

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getDealCode() {
        return dealCode;
    }

    public void setDealCode(String dealCode) {
        this.dealCode = dealCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
