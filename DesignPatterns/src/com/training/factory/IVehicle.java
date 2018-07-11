package com.training.factory;

public interface IVehicle {
void move();
void speed(int maxspeed);
void paint(IColor color);
}

class Car1 implements IVehicle
{

	@Override
	public void move() {
		System.out.println("car is moving");
		
	}

	@Override
	public void speed(int maxspeed) {
		System.out.println("max speed of car is"+maxspeed);
		
	}

	@Override
	public void paint(IColor color) {
		color.paint();
		
	}
	
}

class Truck implements IVehicle{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speed(int maxspeed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paint(IColor color) {
		// TODO Auto-generated method stub
		
	}
	
}