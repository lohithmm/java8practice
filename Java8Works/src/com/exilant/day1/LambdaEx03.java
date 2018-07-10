package com.exilant.day1;
//this programs to show simple working of functional interface

//interface with exactly one method is called functional Interface
@FunctionalInterface
interface MathOperation{
	int operation(int num1,int num2);
}


public class LambdaEx03 {
	
	public static int operate(int num1,int num2,MathOperation math)
	{
		return math.operation(num1, num2);
		
	}
	
public static void main(String[] args) 
{
MathOperation add=(num1,num2)->num1+num2;
MathOperation sub=(num1,num2)->num1-num2;
MathOperation mul=(num1,num2)->num1*num2;

System.out.println(operate(4, 2, add));
System.out.println(operate(4, 2, sub));
System.out.println(operate(4, 2, mul));


}
}
