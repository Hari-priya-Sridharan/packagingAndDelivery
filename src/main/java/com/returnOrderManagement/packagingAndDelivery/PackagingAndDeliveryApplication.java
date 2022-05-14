package com.returnOrderManagement.packagingAndDelivery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PackagingAndDeliveryApplication {
	private static final Logger log = LoggerFactory.getLogger(PackagingAndDeliveryApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PackagingAndDeliveryApplication.class, args);
		PackagingAndDeliveryConfig packagingAndDeliveryConfig = new PackagingAndDeliveryConfig();
		packagingAndDeliveryConfig.setPredefinedCost();
		System.out.println("Application Started");
		log.info("Hi there");	
	}

}
