package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LamdaBasic01 {
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(10,20,30,40,50,60);
    int sum=0;
	System.out.println("--------- before jdk 1.5 ---------------");
	// <jdk1.5
	for (int i = 0; i < numbers.size(); i++) {
		sum+=numbers.get(i);
		//System.out.println(numbers.get(i));
	}
	System.out.println(sum);
	System.out.println("----------- post jdk 1.5-----------------");
	//till jdk 1.7 
	for (Integer integer : numbers) {
		System.out.println(integer);
	}
	//with consumer  
	System.out.println("-----------with consumer");
	numbers.forEach(new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
			System.out.println(t);
			
		}
	});
	
	
	//from jdk1.8 with lambda
	System.out.println("----------------lambda expression---------");
	
	System.out.println("-----------------in lambda way 01---------");
	numbers.forEach((Integer temp)->System.out.println(temp));
	
	
	System.out.println("-----------------in lambda way 02---------");
	numbers.forEach(System.out::println); //function refrance
	
	System.out.println("mappers and reducer::=>"+numbers.stream().map(e->e*2).reduce((res,e)->res+e));
	
}
}
