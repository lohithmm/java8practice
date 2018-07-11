package com.training.factory;

public interface IColor {
public void paint();
}

class Red implements IColor
{

	@Override
	public void paint() {
		System.out.println("red color");
		
	}
	
}

class Black implements IColor
{

	@Override
	public void paint() {
		System.out.println("black color");
		
	}
	
}