package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//to show  working of map and filter based on the customer
public class StreamMapEx02 {
	public static void main(String[] args) 
	{
		List<Customer> customers = Arrays.asList(new Customer(101, "a", 500, "Engineer"),
				new Customer(102, "Allarakha", 6000, "Developer"), new Customer(103, "pooja", 3005, "lead"),
				new Customer(104, "Anuj", 2000, "Engineer"), new Customer(105, "Tanmayee", 6007, "Developer"),
				new Customer(106, "lohith", 8000, "CEO"));

		List<PriorityCustomer> priorityCustomers = new ArrayList<>();

		// java 7 way
		for (Customer customer : customers) 
		{
			if (customer.getCustomerPurchance() >= 500)
				priorityCustomers
						.add(new PriorityCustomer(customer.getCustmerId(), customer.getCustomerName(), "Gold"));

		}
		// System.out.println();
		filterCustomers(customers).forEach(System.out::println);
		// java 8 way

		// System.out.println(customers.stream().map(e->e.getCustomerPurchance()*2).reduce((res,e)->res+=e.g));

	}

	public static List<PriorityCustomer> filterCustomer1(List<Customer> customers) 
	{

		List<PriorityCustomer> priorityCustomers = customers.stream().map(temp -> {
			if (temp.getCustomerPurchance() > 500) {
				return new PriorityCustomer(temp.getCustmerId(), temp.getCustomerName(), "Gold");
			}
			return null;
		}).collect(Collectors.toList());

		return priorityCustomers;
	}

	public static List<PriorityCustomer> filterCustomer2(List<Customer> customers) 
	{

		return customers.stream().filter(temp -> temp.getCustomerPurchance() > 500).map(temp -> {
			return new PriorityCustomer(temp.getCustmerId(), temp.getCustomerName(), "Gold");
		}).collect(Collectors.toList());
		// return priorityCustomers;

	}
	
	public static List<PriorityCustomer> filterCustomers(List<Customer> customers) 
	{

		List<PriorityCustomer> priorityCustomers = customers.stream().map(temp -> {
			if (temp.getCustomerPurchance() > 500) {
				return new PriorityCustomer(temp.getCustmerId(), temp.getCustomerName(), 
						
						temp.getCustomerPurchance()>0 &&
						temp.getCustomerPurchance()<3000?"silver":
							temp.getCustomerPurchance()>3000&&temp.getCustomerPurchance()<5000?"Gold":"Platinum");
			}
			return null;
		}).collect(Collectors.toList());

		return priorityCustomers;
	}
	
	

}
