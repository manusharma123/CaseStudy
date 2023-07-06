package com.Deal.DealService.service;

import com.Deal.DealService.exception.ProductNotFound;
import com.Deal.DealService.model.Product;
import com.Deal.DealService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addDeals(Product pro) {
        return productRepository.save(pro);
    }

    @Override
    public List<Product> getDeals() throws ProductNotFound {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getDealsByName(String platformName) throws ProductNotFound {
        return productRepository.findAllByPlatformName(platformName);
    }

    @Override
    public void deleteById(String id) throws ProductNotFound {
        productRepository.deleteById(id);
    }
}
