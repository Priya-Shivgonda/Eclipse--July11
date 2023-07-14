package com.xworkz.program;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ResortRunner main method");
		Resort ref=new Resort("VINTAGE","Prabhu");
		ref.ownerName="Rahul";
		ref.roomType=TypeOfResort.Beach_Resort;
		ref.display();
		
		Resort ref1=new Resort("Wonderla Reort","Prabhu");
		ref1.ownerName="Ramesh";
		ref1.roomType=TypeOfResort.Family_Resort;
	    ref1.display();

	}

	}

