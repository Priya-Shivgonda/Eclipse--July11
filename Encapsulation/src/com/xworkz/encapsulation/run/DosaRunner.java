package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Dosa;

public class DosaRunner {
	public static void main(String[] args) {
			
			System.out.println("DosaRunner is main method ");
			
			
			// creating instance of the encapsulated class
			
			Dosa dosa=new Dosa();
			
				//setting value in the type member
			dosa.setType("masala");
			dosa.setPrice(200);
			dosa.setQuantity(2);
			dosa.setSize(3);
			dosa.setNoOfDosa(4);
			
			//getting value to the type member
			System.out.println(dosa.getType() + "" + dosa.getPrice() + "" + dosa.getQunatity() + "" + dosa.getSize() +  "" +dosa.getNoOfDosa());
			
			
		}

	}


