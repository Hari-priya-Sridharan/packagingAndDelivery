package com.returnOrderManagement.packagingAndDelivery;

import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/GetPackagingDeliveryCharge")
public class PackagingAndDeliveryController {
	private packageAndDeliveryService packageAndDeliveryService = new packageAndDeliveryService();
	@GetMapping
	public void getPackagingDeliveryCharge(@RequestBody packageAndDeliveryRequest packageAndDeliveryRequest) {
		packageAndDeliveryService.calculatePackagingDeliveryCharge(packageAndDeliveryRequest);
	}
}
