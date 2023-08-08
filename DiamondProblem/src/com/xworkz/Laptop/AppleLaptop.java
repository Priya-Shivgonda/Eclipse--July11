package com.xworkz.Laptop;

public interface AppleLaptop {
	void memory();

	default void speed()
	{
		System.out.println("laptop is invoking high speed");
	}
	

}
