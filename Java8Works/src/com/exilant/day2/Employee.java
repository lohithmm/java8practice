package com.exilant.day2;

public class Employee {
int id;
public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
}
String name;
double salary;
String department;
}
