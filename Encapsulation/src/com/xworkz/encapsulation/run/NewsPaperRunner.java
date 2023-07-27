package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.NewsPaper;

public class NewsPaperRunner {

	
public static void main(String[] args) {
		
		System.out.println(" NewsPaperRunner is main method ");
		
		
		// creating instance of the encapsulated class
		
		NewsPaper newsPaper=new NewsPaper();
		 
		
			//setting value in the type member
		newsPaper.setType("Kannada");
		newsPaper.setPrice(200);
		newsPaper.setCompany("Dainik Bhaskar");
		newsPaper.setSize(3);
		newsPaper.setNoOfNewsPaper(5);
		//getting value to the type member
		System.out.println("************");
		
		System.out.println(newsPaper);
		
	}

}
