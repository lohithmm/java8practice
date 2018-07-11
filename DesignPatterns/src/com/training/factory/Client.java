package com.training.factory;

public class Client {
public static void main(String[] args) {
	AbstractFactory vehicleFactory=FactoriesProducer.getFactory("vehicle");
	AbstractFactory colorFactory=FactoriesProducer.getFactory("color");
	IColor color=colorFactory.getColor("black");
	IVehicle fordCar=vehicleFactory.getVehicle("car");
	fordCar.move();
	fordCar.speed(100);
	fordCar.paint(color);
	
}
}
