package com.Deal.DealService.controller;

import com.Deal.DealService.exception.ProductNotFound;
import com.Deal.DealService.model.Product;
import com.Deal.DealService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/deals")
public class ProductController {
    @Autowired
    private ProductService productService;

    //adding deals
    @PostMapping("/addDeal")
    public ResponseEntity<Product> addDeal(@RequestBody Product product) {

        Product res = productService.addDeals(product);

        return ResponseEntity.ok(res);
    }

    //viewing all deals
    @GetMapping("/viewDeals")
    public ResponseEntity<List<Product>> getDeals() {
        try {
            return ResponseEntity.ok(productService.getDeals());

        } catch (ProductNotFound e) {
            return ResponseEntity.notFound().build();

        }
    }

    //viewing deals by name
    @GetMapping("/viewDealsByName")
    public ResponseEntity<List<Product>> getDealsByName(@RequestParam("platformName") String platformName) {
        try {
            return ResponseEntity.ok(productService.getDealsByName(platformName));

        } catch (ProductNotFound e) {
            return ResponseEntity.notFound().build();

        }
    }

    //deleting deals by id
    @DeleteMapping("deleteDealById")
    public ResponseEntity<?> deleteDealById(@RequestParam("id") String id){
        try {
            System.out.println(id);
            productService.deleteById(id);


        }catch(ProductNotFound e){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.noContent().build();
    }
}
