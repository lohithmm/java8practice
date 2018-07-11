package com.training.factory;

public class ColorFactory extends AbstractFactory {

	@Override
	public IVehicle getVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		if(color.equals("Red")) return new Red();
		else if (color.equals("black")) return new Black();
return null;
}
}
