package com.training.singleton;

public class SingletonClient01 {
public static void main(String[] args) {
	System.out.println(Singleton.getInstance().hashCode());
	System.out.println(Singleton.getInstance().hashCode());
	System.out.println(Singleton.getInstance().hashCode());
}
}
