package com.exilant.day2;

import java.util.ArrayList;
import java.util.List;


public class PersonClient {
public static void main(String[] args) {
	
	List<String> li=new ArrayList<>();
	li.add("sfdf");
	li.add("sfds");
	li.add("sdfsf");
	li.add("aaaaa");
	//method refrance for displaing string list
	li.forEach(PrintConsumer::print);
	
	
	
	List<Person> persons=new ArrayList<>();
	
	persons.add(new Person(1,"lohith"));
	persons.add(new Person(2,"chand"));
	persons.add(new Person(4,"ankith"));
	persons.add(new Person(3,"tejashwini"));
	//persons.forEach(System.out::print);
	
	//persons.forEach((t)->System.out.println(t.name.toUpperCase()));
	
	
	PersonConsumer print=new PersonConsumer();
	persons.forEach(print);
	
	//method refrence
	persons.forEach(PrintConsumer::print);
	
	
	
}
}
