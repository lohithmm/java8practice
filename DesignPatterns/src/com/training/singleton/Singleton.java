package com.training.singleton;

import java.io.Serializable;

//eager Singleton
public class Singleton implements Serializable
{
	//because instance of class generate while class loading time only
	private static final Singleton singleInstance=new Singleton();
private Singleton()
{
	System.out.println("The constructor is called");
}


static Singleton getInstance()
{
	return singleInstance;
	
}
//this will only work when we use with FileInputStream and ObjectInputStream
//instead of read serialised object and creating new instance one more check will happen and it will check whether this object 
//present in heap or what if its present it will return same object so we can stop singleton breakage when we serialise and deserialize the object
private Object readResolve()
{
	return getInstance();
}
}
