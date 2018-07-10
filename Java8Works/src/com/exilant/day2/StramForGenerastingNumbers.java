package com.exilant.day2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StramForGenerastingNumbers {
public static void main(String[] args) {
	
	Stream.iterate(10,i->i+1).limit(10).sorted().forEach(System.out::println);
	
	
	IntStream ig =IntStream.range(1, 20).sorted();
	ig.forEach(System.out::println);
}
}
