package com.xworkz.Inheritance;

public class Institute {


	String name;
	int noOfInstitute;
	boolean best;
	

 	public Institute (String name,int noOfInstitute ,boolean best)
	{
		System.out.println("invoking with const String name,int noOfInstitute ,boolean best of institute");
		this.name=name;
		this.noOfInstitute=noOfInstitute;
		this.best=best;
	}
   void printInfo()
   {
	   
	   System.out.println("Institute name:"+name);
       System.out.println("noOfInstitute:"+noOfInstitute);
       System.out.println("Institute is best:"+best);
       
   }
}
