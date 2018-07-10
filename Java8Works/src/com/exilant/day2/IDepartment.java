package com.exilant.day2;

public interface IDepartment {
void worklocation();
default void noOfHours() 
{
	System.out.println("depends on project demand he should work");
}

static void commonUtility() {
	System.out.println("All Employee have to pass Background Verification");
}
}
