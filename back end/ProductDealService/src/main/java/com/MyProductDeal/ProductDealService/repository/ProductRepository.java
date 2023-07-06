package com.MyProductDeal.ProductDealService.repository;


import com.MyProductDeal.ProductDealService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {

    List<Product> getAllDealsByEmail(String email);
}
