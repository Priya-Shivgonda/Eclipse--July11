package com.xworkz.Company;

public interface InfosysCompany extends  HCLCompany {
 @Override
 void vacancy();
 
 default void workprocess()
 {
	 System.out.println("invoking work process");
 }
 
}
