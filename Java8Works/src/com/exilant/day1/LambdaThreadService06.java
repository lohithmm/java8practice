package com.exilant.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadService06 {
public static void main(String[] args) throws InterruptedException {
	ExecutorService executorService=Executors.newSingleThreadExecutor();
	executorService.execute(()->System.out.println("hi this isnsj"));
	System.out.println(executorService.isShutdown());
	executorService.shutdown();
	System.out.println(executorService.isShutdown());
	
	System.out.println("--------------callables  work--------------------");
    ExecutorService executorService2=Executors.newSingleThreadExecutor();
    Callable<String> c=new Callable<String>() {

		@Override
		public String call() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
    	
	};
    List<Future<String>> result=executorService2.invokeAll(initializeCallable());
	result.forEach((e)->{
		try {
			System.out.println(e.get());
		} catch (InterruptedException | ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	executorService2.shutdown();
	
}

//this method will create set of callable (each callable is 1 thread)
public static  Set<Callable<String>> initializeCallable()
{
	Set<Callable<String>> callables=new HashSet<>();
	
	callables.add(()->"1st callable");
	callables.add(()->"2nd callable");
	callables.add(()->"3rd callable");
	callables.add(()->"4th callable");
	callables.add(()->"5th callable");
	callables.add(()->"6th callable");
	callables.add(()->"7th callable");
	
	callables.add(()->"complex called buisness logic");
	
	return callables;
	
}
}