package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Grinder;

public class GrinderRunner {
	
	public static void main(String[] args) {
		
		System.out.println("GrinderRunner is main method ");
		
		
		// creating instance of the encapsulated class
		
	   	Grinder grinder=new  Grinder();
		 
		
			//setting value in the type member
		grinder.setType("juice");
		grinder.setPrice(2000);
		grinder.setBrand("prestige");
		grinder.setSize(3);
	    grinder.setNoOfGrider(5);
		//getting value to the type member
		System.out.println("************");
		
		System.out.println(grinder);
		
	}

}
