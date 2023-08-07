package com.xworkz.Laptop;

public class Laptop implements AppleLaptop, DellLaptop, HpLaptop, LenovoLaptop {
	
	

	@Override
	public void memory()
	{
		System.out.println("laptop memeory is good");
	}

	@Override
	public void screenQuality()
	{
		System.out.println("laptop screenQuality is good");
	}

	@Override
	public void storage()
	{
		System.out.println("laptop storage  is more");
	}
	
	@Override
	public void battery()
	{
		System.out.println("laptop battery is low");
	}
	
}

