package com.xworkz.Company;

public class CompanyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Company company=new Company();
		company.vacancy();
		company.noOfEmployee();
		company.workprocess();
		
		
		HCLCompany hclcompany=new Company();
		hclcompany.vacancy();
		
		
		InfosysCompany infosyscompany=new Company();
		infosyscompany.vacancy();
		infosyscompany.workprocess();
		
		
		TCSCompany tcompany=new Company();
		tcompany.vacancy();
		tcompany.noOfEmployee();
		

		
		
		
		
		
	}

}


