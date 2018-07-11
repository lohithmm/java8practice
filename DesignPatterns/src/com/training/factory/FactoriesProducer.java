package com.training.factory;

public class FactoriesProducer {

	public static AbstractFactory getFactory(String factoryName)
	{
		if(factoryName.equals("vehicle")) return new VehicleFactory();
		else if (factoryName.equals("color")) return new ColorFactory();
		return null;
		
	}
}
