package com.xworkz.Car;

public class Car implements BMWCar,HondaCityCar, MahindraCar,MarutiSuzukiCar {
	
	
	@Override
	public void speed()
	{
		System.out.println("BMW car has high speed");
	}

	

	@Override
	public void moving()
	{
		System.out.println("HondaCity car is  moving in high speed");
	}

	@Override
	public void  remoteKey()
	{
		System.out.println("HondaCity car is  moving in high speed");
	}
	

	@Override
	public void noOfCars()
	{
		System.out.println(" number of cars of Maruti suzuki");
	}
}
