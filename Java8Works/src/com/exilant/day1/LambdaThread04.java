package com.exilant.day1;

public class LambdaThread04 {
	
	
	
public static void main(String[] args) {
	Runnable r1=()->System.out.println("dfffffffffffr1");
	Runnable r2=()->System.out.println("dfffffffffffr2");

	Runnable r3=()->System.out.println("dfffffffffffr3");

	//r.run();
	Thread t=new Thread(r3);
	t.start();
	
	//creating thread using lambda expression
	new Thread(()-> {
		System.out.println("lambda............");
	}).start();
	
	
}
}
