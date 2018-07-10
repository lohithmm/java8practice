package com.exilant.day1;

public class PriorityCustomer {
private int customerId;
private String customerName;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
@Override
public String toString() {
	return "PriorityCustomer [customerId=" + customerId + ", customerName=" + customerName + ", type=" + type + "]";
}
public PriorityCustomer(int customerId, String customerName, String type) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.type = type;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
private String type;
}
