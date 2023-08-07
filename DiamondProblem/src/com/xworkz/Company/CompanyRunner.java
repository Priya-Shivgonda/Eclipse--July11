package com.xworkz.Company;

public class CompanyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Company company=new Company();
		company.vacancy();
		company.noOfEmployee();
		company.salary();
		company.workProcess();
		
		
		HCLCompany hclcompany=new Company();
		hclcompany.vacancy();
		
		
		InfosysCompany infosyscompany=new Company();
		infosyscompany.vacancy();
		infosyscompany.workProcess();
		
		
		TCSCompany tcompany=new Company();
		tcompany.vacancy();
		tcompany.noOfEmployee();
		
		tcompany.workProcess();
		
		
		WiproCompany wcompany=new Company();
		wcompany.vacancy();
		wcompany.noOfEmployee();
		wcompany.salary();
		wcompany.workProcess();
		
		
		
		
	}

}


