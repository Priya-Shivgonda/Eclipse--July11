package com.xworkz.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Laptop laptop=new Laptop();
		laptop.memory();
		laptop.screenQuality();
		laptop.storage();
		
		
		
		
		AppleLaptop al=new  Laptop();
		al.memory();
		
		DellLaptop dl=new  Laptop();
		dl.memory();
		dl.screenQuality();
		
		HpLaptop hl=new  Laptop();
		hl.memory();	
		hl.storage();
		
		
		
	}

}


