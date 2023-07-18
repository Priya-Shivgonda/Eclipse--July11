package com.xworkz.Inheritance;

public class LivingThingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LivingThingsRunner is main method");
	    LivingThing plant=new LivingThing();
		plant.printInfo();
		
	    LivingThing plant1=new LivingThing("rose",30,"plant");
	    plant1.printInfo();
	}

}
