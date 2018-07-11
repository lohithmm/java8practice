package com.training.singleton;
//lasy singleton
public class Company {
	//because instance willl generate when we call getinstance method
private Company() {
	System.out.println("Constructor called");
}
public static Company getInstance(Company company)
{
	if(company==null)return new Company();
	return company;
}
}

class Emp{
	int empId;
	String empName;
	Company company;
}

