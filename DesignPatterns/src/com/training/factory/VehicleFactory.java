package com.training.factory;

public class VehicleFactory extends AbstractFactory
{

	@Override
	public IVehicle getVehicle(String vehicle) {
		if(vehicle.equals("car")) return new Car1();
		else if (vehicle.equals("truck")) return new Truck();
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
