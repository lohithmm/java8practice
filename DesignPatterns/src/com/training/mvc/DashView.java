package com.training.mvc;

public class DashView {
	public void printEmployee(Employee e)
	{
		System.out.println("------------------------------------");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println("-------------------------------------");
	}
}
