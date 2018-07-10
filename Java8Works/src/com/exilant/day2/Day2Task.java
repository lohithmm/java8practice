package com.exilant.day2;

public class Day2Task {
public static void main(String[] args) {
	ComparingStrings largestword=(str1,str2)->{
		return (str1.length()>str2.length())?str1:str2;
	};
	
	ComparingStrings smalestword=(str1,str2)->{
		if(str1.length()>str2.length())return str2;
		else return str1;
	};
	
	
	CompareStringsRunner r1=new CompareStringsRunner();
System.out.println(r1.executeComparision(largestword,"sd","gdfgdgdf"));	
System.out.println(r1.executeComparision(smalestword,"sd","gdfgdgdf"));	
	
}
}
