package com.xworkz.java;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HotelRunner main method");
		Hotel ref=new Hotel("Mandya","btm layout");
        ref.setType("Veg");
        ref.noOfEmployee=30;
        ref.printInfo();
        
        Hotel ref1=new Hotel("Anmul","Bidar");
        ref1.setType("Non-veg");
        ref1.noOfEmployee=40;
        ref1.printInfo();
        
     }
               
}


	