package com.xworkz.coolDrink;

public class CoolDrinkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BTMCoolDrink bcd=new  BTMCoolDrink();
		bcd.energy();
		bcd.stamina();
		bcd.cool();
		
		CokeCoolDrink ccd=new  BTMCoolDrink();
		ccd.stamina();
		ccd.cool();
		
		 PepsiCoolDrink pcd=new BTMCoolDrink();
		 pcd.cool();
		 pcd.energy();
	     
	}

}
