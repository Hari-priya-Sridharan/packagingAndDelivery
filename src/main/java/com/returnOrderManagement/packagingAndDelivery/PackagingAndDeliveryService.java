/**
 * 
 */
package com.returnOrderManagement.packagingAndDelivery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 842186
 *
 */
@Slf4j
public class PackagingAndDeliveryService {
	
	private PackagingAndDelivery packagingAndDelivery= new PackagingAndDelivery();
	private static final Logger log = LoggerFactory.getLogger(PackagingAndDeliveryService.class);
	
	public int calculatePackagingDeliveryCharge(PackagingAndDeliveryRequest packagingAndDeliveryRequest) {
		// TODO Auto-generated method stub
		String componentType=packagingAndDeliveryRequest.getComponentType();
		int count=packagingAndDeliveryRequest.getCount();
		
		int packageCost=0;
		int deliveryCost=0;
		int totalCost=0;
		
		switch(componentType) {
		  case "Integral item":
			  packageCost=packagingAndDelivery.getIntegralItemPackageCost();
			  deliveryCost=packagingAndDelivery.getAccessoryDeliveryCost();
		    break;
		  case "Accessory":
			  packageCost=packagingAndDelivery.getAccessoryPackageCost();
			  deliveryCost=packagingAndDelivery.getIntegralItemDeliveryCost();
		    break;
		  case "Protective sheath":
			  packageCost+=packagingAndDelivery.getSheathPackageCost();
			  break;
		}
		log.info("Service : Package cost is calculated to be {} ", packageCost);
		log.info("Service : Delivery cost is calculated to be {} ", deliveryCost);
		totalCost=(packageCost+deliveryCost)*count;
		log.info("Service : Total cost is calculated to be {} ", totalCost);
		
		return totalCost;
	}

}
