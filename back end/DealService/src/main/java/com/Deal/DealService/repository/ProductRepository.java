package com.Deal.DealService.repository;

import com.Deal.DealService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {

    List<Product> findAllByPlatformName( String platformName);
}
