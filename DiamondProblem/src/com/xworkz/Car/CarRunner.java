package com.xworkz.Car;

public class CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car=new Car();
		car.moving();
		car.testDrive();
		car.speed();
		car.drive();
		
		BMWCar bc=new Car();
		bc.speed();
		

		HondaCityCar hcc=new Car();
	    hcc.speed();
	    hcc.moving();
	    
	    
	    MarutiSuzukiCar mc=new Car();
		mc.speed();
		mc.testDrive();
	    

		
	}

}
