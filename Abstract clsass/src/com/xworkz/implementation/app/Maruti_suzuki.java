package com.xworkz.implementation.app;

import com.xworkz.Abstract.app.Car;

public class Maruti_suzuki extends Car {
	
	@Override
	public void  run()
	{
		System.out.println("Car is running");
	}	

	@Override
	public void speed() 
	{
		System.out.println("maruti_suzuki has high speed");
	}
}
