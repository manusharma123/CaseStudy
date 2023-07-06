package com.MyProductDeal.ProductDealService.controller;

import com.MyProductDeal.ProductDealService.exception.ProductNotFound;
import com.MyProductDeal.ProductDealService.model.Product;
import com.MyProductDeal.ProductDealService.service.MyDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin("http://localhost:4200")
@RequestMapping("/Mydeals")
public class MyDealController {

    @Autowired
    private MyDealService myDealService;

    //getting all the deals
    @GetMapping("/viewMyDeals")
    public ResponseEntity<List<Product>> getMyDeals() {
        try {
            return ResponseEntity.ok(myDealService.getMyProduct());

        } catch (ProductNotFound e) {
            return ResponseEntity.notFound().build();

        }
    }

    //add the deals
    @PostMapping("/addMyDeals")
    public ResponseEntity<Product> addDeal(@RequestBody Product product) {

        Product res = myDealService.addMyDeals(product);

        return ResponseEntity.ok(res);
    }

    //getting user Deal by Email
    @GetMapping("/viewByEmail")
    public ResponseEntity<?> getDealsByEmail(@RequestParam("email") String email)
    {
        List<Product> coupon= myDealService.getMyDealsByEmail(email);
        if(coupon.isEmpty()){
            System.out.println("no coupon bought yet");
        }
        return ResponseEntity.ok(coupon);

    }

    //Deleting Deal by user Id
    @DeleteMapping("deleteDealById")
    public ResponseEntity<?> deleteDealById(@RequestParam("id") String id){
        try {
            System.out.println(id);
            myDealService.deleteById(id);


        }catch(ProductNotFound e){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.noContent().build();
    }

}
