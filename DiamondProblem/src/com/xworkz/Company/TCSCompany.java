package com.xworkz.Company;

public interface TCSCompany extends HCLCompany {
	@Override
	 void vacancy();
	 
	 
	 default void noOfEmployee()
		{
			System.out.println("hcl company vacancy");
		}
}
