package com.xworkz.Laptop;

public interface HpLaptop extends AppleLaptop {
		
	void memory();

	default void storage()
	{
		System.out.println("laptop is invoking high speed");
	}
	
}
