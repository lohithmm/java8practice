package com.exilant.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {
public static void main(String[] args) {
	Predicate<Integer> greaterThan=i->i>10;
	Predicate<Integer> lesserThan=i->i<10;
	
	System.out.println(greaterThan.test(12));
	
	
	List<Integer> integerList=Arrays.asList(12,23,34,45,-33,-10,2,77);
	
	filteredList(integerList,greaterThan).forEach(System.out::println);
	
	
}
public static List<Integer> filteredList(List<Integer> list,Predicate<Integer> predicate)
{
	List<Integer> filteredList=new ArrayList<>();
	/* list.stream().map(t->{
		if(predicate.test(t)) { filteredList.add(t);return t;}
		else return null;
	}).collect(Collectors.toList());*/
	
	 for (Integer t : list) {
		 if(predicate.test(t))filteredList.add(t);
	}
	 
	return filteredList;
	
}
}
