package com.xworkz.Car;

public class CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car=new Car();
		car.moving();
		car.noOfCars();
		car.speed();
		car.remoteKey();
		
		BMWCar bc=new Car();
		bc.speed();
		
		
		HondaCityCar hcc=new Car();
	    hcc.speed();
	    hcc.moving();
	    
	    
	    MahindraCar mc=new Car();
		mc.moving();
		mc.speed();
		mc.remoteKey();
	    

		MarutiSuzukiCar msc=new Car();
		msc.moving();
		msc.noOfCars();
		msc.speed();
		msc.remoteKey();
	}

}
