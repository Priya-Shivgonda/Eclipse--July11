package com.xworkz.Car;

public interface BMWCar {
	
	void speed();
	default void drive()
	{
		System.out.println("car is driving");
	}

}
