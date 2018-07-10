package com.exilant.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmplyeesTest {
public static void main(String[] args) {

			List<Employee> employeesList=new ArrayList<>();
	employeesList.add(new Employee(1, "abc", 12300, "SW"));
	employeesList.add(new Employee(2, "abcd", 12400, "Fin"));
	employeesList.add(new Employee(3, "abce", 1200, "Claims"));
	employeesList.add(new Employee(4, "abcf", 1900, "Preauth"));
	employeesList.add(new Employee(5, "abcg", 1600, "SW"));
	employeesList.add(new Employee(6, "abch", 1500, "SW"));
	
	
	Predicate<Employee> salGreater=(e)->e.salary>1500;
	Predicate<Employee> department=(e)->e.department.equals("SW");
	System.out.println("employees based on salary greater than 1500");
	filteredList(employeesList, salGreater).forEach(System.out::println);
	System.out.println("-------------------------------------");
	System.out.println("employees based on department who ever blongs to SW");
	filteredList(employeesList, department).forEach(System.out::println);

}

public static List<Employee> filteredList(List<Employee> list,Predicate<Employee> predicate)
{
	/*List<Employee> filteredList=new ArrayList<>();
	 list.stream().map(t->{
		if(predicate.test(t)) { filteredList.add(t);return t;}  // using maps
		else return null;
	}).collect(Collectors.toList());*/
	
	 return list.stream().filter(predicate).collect(Collectors.toList()); // using predicate
	 
	/* for (Employee t : list) {
		 if(predicate.test(t))filteredList.add(t); //using foreach loop
	}*/
	 
	//return filteredList;
	
}
}
