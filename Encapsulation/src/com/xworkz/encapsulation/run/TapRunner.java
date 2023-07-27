package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Tap;

public class TapRunner {

	
public static void main(String[] args) {
		
		System.out.println("TapRunner is main method ");
		
		
		// creating instance of the encapsulated class
		
		Tap tap =new  Tap();
		 
		
			//setting value in the type member
		tap.setType("Wall Mounted Taps");
		tap.setPrice(2000);
		tap.setBrand("Hindware");
		tap.setSize(6);
		tap.setNoOfTap(21);
		//getting value to the type member
		System.out.println("************");
		
		System.out.println(tap);
		
	}

}
