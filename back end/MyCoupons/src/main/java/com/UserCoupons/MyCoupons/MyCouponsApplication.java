package com.UserCoupons.MyCoupons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyCouponsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCouponsApplication.class, args);
	}

}
