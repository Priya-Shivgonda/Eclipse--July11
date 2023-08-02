package com.xworkz.implementation.app;

import com.xworkz.Abstract.app.Car;

public class BMW extends Car{
	@Override
	 public void run()
	{
		System.out.println("Bmw car is running");
	}
	
   @Override 
   public void speed()
   {
	   System.out.println("BMW has full speed");
   }
	

}
