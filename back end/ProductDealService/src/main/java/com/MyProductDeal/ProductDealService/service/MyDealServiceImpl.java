package com.MyProductDeal.ProductDealService.service;

import com.MyProductDeal.ProductDealService.exception.ProductNotFound;
import com.MyProductDeal.ProductDealService.model.Product;
import com.MyProductDeal.ProductDealService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyDealServiceImpl implements MyDealService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getMyProduct() throws ProductNotFound {
        return this.productRepository.findAll();
    }

    @Override
    public Product addMyDeals(Product product) {
        Product pro= this.productRepository.save(product);

        return pro;
    }

    @Override
    public void deleteById(String id)throws ProductNotFound {

        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getMyDealsByEmail(String email) {
        return productRepository.getAllDealsByEmail(email);
    }
}
