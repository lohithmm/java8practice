package com.exilant.day3;

public class MyTuples<A,B,C> {
private A _aa;
private B _bb;
private C _cc;
public A get_aa() {
	return _aa;
}
public void set_aa(A _aa) {
	this._aa = _aa;
}
public MyTuples(A _aa, B _bb, C _cc) {
	super();
	this._aa = _aa;
	this._bb = _bb;
	this._cc = _cc;
}
public B get_bb() {
	return _bb;
}
public void set_bb(B _bb) {
	this._bb = _bb;
}
public C get_cc() {
	return _cc;
}
public void set_cc(C _cc) {
	this._cc = _cc;
}
}
class Emp{}
class Dep{}
class SomeThing{}
class TuppleEx01{
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