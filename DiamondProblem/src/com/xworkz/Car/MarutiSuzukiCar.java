package com.xworkz.Car;

public interface MarutiSuzukiCar extends BMWCar {
	@Override
	void speed();
	
    
    
    default void  testDrive() {
    	System.out.println("Default car driving in honda car");
   }
}
