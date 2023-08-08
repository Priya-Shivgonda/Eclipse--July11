package com.xworkz.coolDrink;

public interface PepsiCoolDrink extends CoolDrink {
	@Override

	void cool();

	default void fresh()
	{
		System.out.println("invoking the fresh");
	}


}

