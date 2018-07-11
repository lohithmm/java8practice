package com.exilant.day2;

import java.awt.dnd.DragGestureRecognizer;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {
public static void main(String[] args) {
	List<Dragons> dragonslist=Stream.of(new Dragons("Errol", "USA", 15),
			new Dragons("Errol", "USA", 15),
			new Dragons("FirMAn", "USA", 33),
			new Dragons("Hasai", "France", 20),
			new Dragons("HArry", "Norway", 34),
			new Dragons("Demo", "India",40),
			new Dragons("Aus", "Austrlia", 85),
			new Dragons("Eng", "England", 15)).collect(Collectors.toList());
	
	// to find noof dragons
	
	Map<String,Long> mapDragcnt=dragonslist.stream().collect(Collectors.groupingBy(Dragons::getNames,Collectors.counting()));
	System.out.println(mapDragcnt);

	Map<String, Integer> sumOFDragans=dragonslist.stream().collect(Collectors.groupingBy(Dragons::getNames,Collectors.summingInt(Dragons::getCount)));
	
	System.out.println("report for Sum of Dragons");
	sumOFDragans.forEach((k,v)->{
		System.out.println("dragon name:"+k+",no of dragons :"+v);
	});
	
	
	//.filter(dragon->{
	//	if(dragon.getCountry().equals("USA"))return true;
	//	else return false;
	//})
  
	
	//1.TODO
	//write java 8 snippet to find the stats of the dragonlist
	//should display  sum/average/min/max/avg of dragons,
	IntSummaryStatistics s=dragonslist.stream().collect(Collectors.summarizingInt(Dragons::getCount));
	//System.out.println(dragonslist.stream().collect(Collectors.averagingInt(Dragons::getCount)).longValue());
	System.out.println(s.getAverage());
	System.out.println(s.getMax());
	System.out.println(s.getMin());
	System.out.println(s.getSum());
	
	
	//2.TODO
	//find dragons by country and keep the names of dragons
	//of difrent countries in the list/set
	dragonslist.stream().collect(Collectors.groupingBy(Dragons::getCountry,Collectors.mapping(Dragons::getNames, Collectors.toList()))).forEach((k,v)->System.out.println(k+"-"+v));

	
	
}
}
