package com.training.composite;

import java.util.ArrayList;
import java.util.List;

public class Customer {
private int id;
private String name;
public List<Customer> refrnaces;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + "]";
}
public Customer(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	this.refrnaces=new ArrayList<>();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public void addRefrance(Customer customer)
{
	refrnaces.add(customer);
}
public void removeRefrance(Customer customer)
{
	refrnaces.remove(customer);
}
}
