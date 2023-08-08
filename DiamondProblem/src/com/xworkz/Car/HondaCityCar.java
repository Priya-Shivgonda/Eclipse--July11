package com.xworkz.Car;

public interface HondaCityCar extends BMWCar  {
	
	@Override 
	void speed();
   default void moving()
   {
	   
	   System.out.println("car is moving ");
   }
}
