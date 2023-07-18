package com.xworkz.Inheritance;

public class BuildingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
       System.out.println("BuildingRunner main method");
       Building home=new Home("btm-layout","palace",20,true);
       home.printInfo();
       Building home1=new Home("btm-layout","palace",20,true);
       home1.printInfo();
	}
}