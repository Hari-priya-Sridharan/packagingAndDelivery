/**
 * 
 */
package com.returnOrderManagement.packagingAndDelivery;

/**
 * @author 842186
 *
 */
public class PackagingAndDeliveryRequest {
	private String componentType;
	private int count;
	public String getComponentType() {
		return componentType;
	}
	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
