package com.xworkz.Company;

public class Company implements HCLCompany,InfosysCompany, TCSCompany, WiproCompany{
	@Override
	public void vacancy()
	{
		System.out.println("hcl company has vacancy");
	}

	
	@Override
	public void workProcess()
	{
		System.out.println("Infosyscompany");
		
	}

	@Override
	public void  noOfEmployee()
	{
		System.out.println(" Number of employee in TCS company");
	}

	
	@Override
	public void  salary()
	{
		System.out.println("how much salary in  wipro company");
	}

	
}
