package com.exilant.day2;

import java.util.function.Consumer;

//creating own consumer class for each default method
public class PersonConsumer implements Consumer<Person> {

	@Override
	public void accept(Person t) {
		System.out.println(t.name.toUpperCase());
		
	}
	

}

//method refrance
class PrintConsumer{
	public static void print(Person p)
	{
		System.out.println("static methos->"+p.name.toUpperCase());
	}
	
	public static void print(String p)
	{
		System.out.println("static methos->"+p);
	}
}