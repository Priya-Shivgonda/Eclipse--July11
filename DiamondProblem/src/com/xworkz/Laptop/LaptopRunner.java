package com.xworkz.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Laptop laptop=new Laptop();
		laptop.memory();
		laptop.screenQuality();
		laptop.storage();
		laptop.battery();
		
		
		
		AppleLaptop al=new  Laptop();
		al.memory();
		
		DellLaptop dl=new  Laptop();
		dl.memory();
		dl.screenQuality();
		
		HpLaptop hl=new  Laptop();
		hl.memory();
		hl.screenQuality();
		hl.storage();
		
		LenovoLaptop  lenovolaptop=new  Laptop();
		lenovolaptop.memory();
		lenovolaptop.screenQuality();
		lenovolaptop.storage();
		lenovolaptop.battery();
		
		
		
	}

}


