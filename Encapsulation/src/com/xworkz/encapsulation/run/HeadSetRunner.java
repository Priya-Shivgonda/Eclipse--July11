package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.HeadSet;

public class HeadSetRunner {
	
public static void main(String[] args) {
		
		System.out.println("HeadsetRunner is main method ");
		
		
		// creating instance of the encapsulated class
		
		HeadSet headSet=new  HeadSet();
		 
		
			//setting value in the type member
		headSet.setType("clip on head set");
		headSet.setPrice(2000);
		headSet.setBrand("boat");
		headSet.setSize(3);
		headSet.setNoOfHeadSet(5);
		//getting value to the type member
		System.out.println("************");
		
		System.out.println(headSet);
		
	}

}