package com.xworkz.Laptop;

public interface DellLaptop extends  AppleLaptop {

	
	void memory();
	
	default void screenQuality()
	{
		System.out.println("laptop is invoking the screen quality");
	}
	


}
