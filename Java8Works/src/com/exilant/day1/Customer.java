package com.exilant.day1;

public class Customer 
{
private int custmerId;
private String customerName;
private double customerPurchance;
private String Designantion;
public Customer(int custmerId, String customerName, double customerPurchance, String designantion) {
	super();
	this.custmerId = custmerId;
	this.customerName = customerName;
	this.customerPurchance = customerPurchance;
	Designantion = designantion;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getCustomerPurchance() {
	return customerPurchance;
}
public void setCustomerPurchance(double customerPurchance) {
	this.customerPurchance = customerPurchance;
}
public String getDesignantion() {
	return Designantion;
}
public void setDesignantion(String designantion) {
	Designantion = designantion;
}

public int getCustmerId() {
	return custmerId;
}
public void setCustmerId(int custmerId) {
	this.custmerId = custmerId;
}
@Override
public String toString() {
	return "Customer [custmerId=" + custmerId + ", customerName=" + customerName + ", customerPurchance="
			+ customerPurchance + ", Designantion=" + Designantion + "]";
}

}
