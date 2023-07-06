package com.MyProductDeal.ProductDealService.service;

import com.MyProductDeal.ProductDealService.exception.ProductNotFound;
import com.MyProductDeal.ProductDealService.model.Product;

import java.util.List;

public interface MyDealService {


    List<Product> getMyProduct()throws ProductNotFound;

    public Product addMyDeals(Product product);
    public void deleteById(String id) throws ProductNotFound;
    List<Product> getMyDealsByEmail(String email);
}
