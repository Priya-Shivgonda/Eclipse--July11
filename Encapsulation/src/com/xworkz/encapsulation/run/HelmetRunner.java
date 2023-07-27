package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Helmet;

public class HelmetRunner {

	
	
public static void main(String[] args) {
		
		System.out.println("helmetRunner is main method ");
		
		
		// creating instance of the encapsulated class
		
		Helmet helmet=new  Helmet();
		 
		
			//setting value in the type member
		 helmet.setType("Modular helmets");
		 helmet.setPrice(2000);
		 helmet.setBrand("Arai Helmet Limited");
		 helmet.setSize(5);
		 helmet.setNoOfHelmet(20);
		//getting value to the type member
		System.out.println("************");
		
		System.out.println( helmet);
	}

}

