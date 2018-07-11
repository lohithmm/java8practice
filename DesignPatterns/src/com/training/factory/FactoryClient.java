package com.training.factory;

public class FactoryClient {
public static void main(String[] args) {
	Car car=Car.getCar(CarName.BMW);
	car.drive();
	
}
}
