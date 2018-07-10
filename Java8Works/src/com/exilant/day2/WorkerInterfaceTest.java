package com.exilant.day2;

public class WorkerInterfaceTest {
public static void main(String[] args) {
	Runner runner=new Runner();
	
	runner.execute(new WorkerInterFace() {
		
		@Override
		public void doSomework() {
			System.out.println("hi we are doing some work in main");
			
		}
	});
	
	
	
	
	runner.execute(()->System.out.println("Hi im in lambda way in main"));
	
	runner.execute(()->{
		System.out.println("Hi im in lambda way in main multiple lins");
	
	System.out.println("you can write any buisness logic");
	}
	);
	
}
}
