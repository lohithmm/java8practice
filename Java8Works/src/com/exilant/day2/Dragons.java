package com.exilant.day2;

public class Dragons 
{
private String names;
private String Country;
private int count;
public Dragons(String names, String country, int count) {
	super();
	this.names = names;
	Country = country;
	this.count = count;
}
public String getNames() {
	return names;
}
public void setNames(String names) {
	this.names = names;
}
@Override
public String toString() {
	return "Dragons [names=" + names + ", Country=" + Country + ", count=" + count + "]";
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}

}
