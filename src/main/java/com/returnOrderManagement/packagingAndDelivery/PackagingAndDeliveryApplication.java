package com.returnOrderManagement.packagingAndDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PackagingAndDeliveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(PackagingAndDeliveryApplication.class, args);
		PackagingAndDeliveryConfig packagingAndDeliveryConfig = new PackagingAndDeliveryConfig();
		packagingAndDeliveryConfig.setPredefinedCost();
			
	}

}
