package com.training.factory;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class Car {
public static Car getCar(CarName carName)
{
	if(carName==carName.BMW) return  new BWM();
	else if(carName==carName.AUDI) return  new Audi();
	if(carName==carName.MARUTHI) return  new Maruthi();
	else return null;
	
}
public abstract void drive();
}
