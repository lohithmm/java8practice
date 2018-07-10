package com.exilant.day2;

public class ExilantEmployee implements IEmployee,IDepartment {

	@Override
	public void worklocation() {
		System.out.println("work location is Exilant banglore branch");
		
	}

	@Override
	public void salary() {
		System.out.println("Salary is morethan 11 lack per month");
		
	}

	@Override
	public void noOfHours() {
		// TODO Auto-generated method stub
		IDepartment.super.noOfHours();
	}

}
