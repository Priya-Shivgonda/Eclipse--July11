package com.xworkz.coolDrink;

public class BTMCoolDrink implements PepsiCoolDrink,CokeCoolDrink {
	@Override
	public void energy()
	{
	System.out.println("Cool drink gives you energy");	

	}
	
  @Override
	public void cool()
 
	{
	System.out.println("Cool drink is  cool");	

	}

	
	@Override
	public void stamina()
	{
	System.out.println("Cool drink give you stamina");	
	}

}
