package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonClient03 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Singleton singletonI1=Singleton.getInstance();
	Singleton singletonI2=null;
	Singleton singletonI3=null;
	
	Constructor[] constructors=Singleton.class.getDeclaredConstructors();
	
	for (Constructor constructor : constructors) {
		constructor.setAccessible(true);
		singletonI2=(Singleton) constructor.newInstance();
		singletonI3=(Singleton) constructor.newInstance();
		break;
	}
	
	System.out.println(singletonI1);
	System.out.println(singletonI2);
	System.out.println(singletonI3);
}
}
