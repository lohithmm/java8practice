package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort05 
{
public static void main(String[] args)
{
	List<Customer> customers = Arrays.asList(new Customer(101, "aa", 500, "Engineer"),
			new Customer(102, "Allarakha", 6000, "Developer"), new Customer(103, "pooja", 3005, "lead"),
			new Customer(104, "Anuj", 2000, "Engineer"), new Customer(105, "Tanmayee", 6007, "Developer"),
			new Customer(106, "lohith", 8000, "CEO"));
	
	System.out.println("-------------Before Sort-------------------");
	customers.forEach(System.out::println);
	System.out.println("-------------After Sort-------------------");
	customers.sort((Customer c1,Customer c2)->(int)(c2.getCustomerPurchance()-c1.getCustomerPurchance())); 
	customers.forEach(System.out::println);
	Comparator<Customer> sortbyName=(Customer c1,Customer c2)->c1.getCustomerName().toLowerCase().compareTo(c2.getCustomerName().toLowerCase());
	
	System.out.println("-------------After Sorting by name-------------------");
	System.out.println("-------------Ascending order-------------------------");
	customers.sort(sortbyName);
	customers.forEach(System.out::println);
	
	System.out.println("-------------Descending order-------------------------");
	customers.sort(sortbyName.reversed());
	customers.forEach(System.out::println);

}
}
