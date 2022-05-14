package com.returnOrderManagement.packagingAndDelivery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/*INFO 
 * 
 * Purpose :
 * The end points of this micro service is set in this controller class
 */
@Slf4j
@RestController
//@RequestMapping("/GetPackagingDeliveryCharge")
public class PackagingAndDeliveryController {
	@Autowired
	PackagingAndDeliveryService packagingAndDeliveryService;
//	private PackagingAndDeliveryService packagingAndDeliveryService = new PackagingAndDeliveryService();
	private static final Logger log = LoggerFactory.getLogger(PackagingAndDeliveryController.class);
	@RequestMapping("/")
	public String display() {

		log.error("OOPS");
		return "Hello";
	}
	@GetMapping("GetPackagingDeliveryCharge")
	public int getPackagingDeliveryCharge(@RequestBody PackagingAndDeliveryRequest packagingAndDeliveryRequest) {
		
		log.info("Packaging and Delivery charge is being calculated for {}", packagingAndDeliveryRequest);
		int charges=packagingAndDeliveryService.calculatePackagingDeliveryCharge(packagingAndDeliveryRequest);
		System.out.println(charges);
		System.out.println("Controller");
		log.info("The package and delivery chargees has been calculate to be {}",charges);
		return charges;
		
	}
	
	
}
