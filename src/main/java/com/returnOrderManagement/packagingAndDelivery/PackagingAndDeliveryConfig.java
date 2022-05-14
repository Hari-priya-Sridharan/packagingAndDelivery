package com.returnOrderManagement.packagingAndDelivery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
/* INFO-
 * Purpose: 
 * The purpose of this class is to set predefined values to the cost of each item. 
 * The default values are added to the config.properties file
 * 
 * Function :
 * Sets the value of variables in packageAndDelivery.java class using setters.
 * 
 * Calls: 
 * Setters from packageAndDelivery.java
 */
//=============================Imports======================//
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//=======================Class Definition====================//
@Configuration
@PropertySource("classpath:config.properties")
public class PackagingAndDeliveryConfig {
	
	@Value("${integral.pakcage.cost:100}")
	private int integralItemPackageCost;
	
	@Value("${accessory.package.cost:50}")
	private int accessoryPackageCost;
	
	@Value("${sheath.packacge.cost:50}")
	private int sheathPackageCost;
	
	@Value("${integral.delivery.cost:200}")
	private int integralItemDeliveryCost;
	
	@Value("${accessory.delivery.cost:100}")
	private int accessoryDeliveryCost;

	private static final Logger log = LoggerFactory.getLogger(PackagingAndDeliveryController.class);
	//------------Set pre-defined values to packageAndDelivery object----------//
	public PackagingAndDelivery setPredefinedCost() {
		
		//*******Create packageAndDelivery object*******//
		
		PackagingAndDelivery pd=new PackagingAndDelivery();
		//*******calling setter to set the cost*******/
		pd.setAccessoryDeliveryCost(accessoryDeliveryCost);
		pd.setAccessoryPackageCost(accessoryPackageCost);
		pd.setIntegralItemDeliveryCost(integralItemDeliveryCost);
		pd.setIntegralItemPackageCost(integralItemPackageCost);
		pd.setSheathPackageCost(sheathPackageCost);
		log.info("accessoryDeliveryCost={}",pd.getAccessoryDeliveryCost());
		log.info("accessoryPackageCost={}",pd.getAccessoryPackageCost());
		log.info("integralItemDeliveryCost={}",pd.getIntegralItemDeliveryCost());
		log.info("integralItemPackageCost={}",pd.getIntegralItemPackageCost());
		log.info("sheathPackageCost={}",pd.getSheathPackageCost());
		return pd;
		
	}
	
}
