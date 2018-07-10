package com.exilant.day2;

public interface IEmployee {
void salary();
default void noOfHours() {
	System.out.println("Employee should work for 8 hrs");
}
}
