package com.exilant.day3;


class Emp{}
class Dep{}
class SomeThing{}
public class TupleEx01 {
	
		static MyTuples<String,Integer,Double> newTuple(){
			return new MyTuples<String, Integer, Double>("dfdsfdds",12, 5554.3);
		}
		
		static MyTuples<Emp,Dep,SomeThing> newCustomerTuple(){
			return new MyTuples<Emp,Dep,SomeThing>(new Emp(),new Dep(), new SomeThing());
		}
		
		public static void main(String[] args) {
			MyTuples<String,Integer,Double> temp1=newTuple();
			System.out.println("String value::"+temp1.get_aa());
			System.out.println("Integer value::"+temp1.get_bb());
			System.out.println("Double value::"+temp1.get_cc());
		}
	}

