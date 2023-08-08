package com.xworkz.coolDrink;

public interface CokeCoolDrink extends CoolDrink{
	
@Override
	void cool(); 

	default void stamina()
	{
		System.out.println("invoking the stamina");
	}
}
	


