package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Satelliete;

public class SatellieteRunner {

	
public static void main(String[] args) {
		
		System.out.println("SatellieteRunner is main method ");
		
		
		// creating instance of the encapsulated class
		
		Satelliete satelliete=new  Satelliete();
		 
		
			//setting value in the type member
		satelliete.setType("Satellite navigation");
		satelliete.setPrice(2000);
		//satelliete.setBrand("prestige");
		satelliete.setSize(10);
	    satelliete.setNoOfSatellietet(8);
		//getting value to the type member
		System.out.println("************");
		
		System.out.println(satelliete);
		
	}

}
