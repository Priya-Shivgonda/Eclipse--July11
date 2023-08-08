package com.xworkz.Company;

public interface HCLCompany {

	void vacancy();
	
	default void printvacancy()
	{
		System.out.println("hcl company vacancy");
	}
}
