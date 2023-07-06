package com.Deal.DealService.service;

import com.Deal.DealService.exception.ProductNotFound;
import com.Deal.DealService.model.Product;

import java.util.List;

public interface ProductService {

    public Product addDeals(Product product);

    public List<Product> getDeals()throws ProductNotFound;

    public List<Product> getDealsByName(String platformName)throws ProductNotFound;

    public void deleteById(String id)throws ProductNotFound;
}
