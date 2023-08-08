package com.xworkz.coolDrink;

public interface CoolDrink {
	void cool();

	
	default void energy()
	{
		System.out.println("invoking the energy");
	}
}
