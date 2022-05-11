package com.returnOrderManagement.packagingAndDelivery;
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
	
	@Value("${integral.pakcage.cost:${integral.pakcage.cost.default}}")
	private int integralItemPackageCost;
	
	@Value("${accessory.package.cost:$accessory.package.cost.default}}")
	private int accessoryPackageCost;
	
	@Value("${sheath.packacge.cost:${sheath.packacge.cost.default}}")
	private int sheathPackageCost;
	
	@Value("${integral.delivery.cost:${integral.delivery.cost.default}}")
	private int integralItemDeliveryCost;
	
	@Value("${accessory.delivery.cost:${accessory.delivery.cost.default}}")
	private int accessoryDeliveryCost;

	//------------Set pre-defined values to packageAndDelivery object----------//
	public packagingAndDelivery setPredefinedCost() {
		
		//*******Create packageAndDelivery object*******//
		
		packagingAndDelivery pd=new packagingAndDelivery();
		
		//*******calling setter to set the cost*******//
		
		pd.setAccessoryDeliveryCost(accessoryDeliveryCost);
		pd.setAccessoryPackageCost(accessoryPackageCost);
		pd.setIntegralItemDeliveryCost(integralItemDeliveryCost);
		pd.setIntegralItemPackageCost(integralItemPackageCost);
		pd.setSheathPackageCost(sheathPackageCost);
		return pd;
	}
	
}
