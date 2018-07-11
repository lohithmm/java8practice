package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonClient04 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Singleton singleton=Singleton.getInstance();
	ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Sample.ser"));
	o.writeObject(singleton);
	
	System.out.println("Object saved with hashcode "+singleton);
	o.close();
	
	ObjectInputStream oi=new ObjectInputStream(new FileInputStream("Sample.ser"));
	singleton=(Singleton) oi.readObject();
	System.out.println("Object retrived with hashcode "+singleton);
	oi.close();
	
}
}
