package com.capg.AddCoupons.AddCoupons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddCouponsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddCouponsApplication.class, args);
	}

}
