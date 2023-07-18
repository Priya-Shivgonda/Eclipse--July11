package com.xworkz.Inheritance;

public class Xworkz extends Institute{
 
	Xworkz(String name,int noOfInstitute,boolean best)
    {
  	  super(name,noOfInstitute,best);
  	  System.out.println("invoking with const String name,int noOfInstitute,boolean best of institute");
  	  
    	this.name=name;
	    this.noOfInstitute=noOfInstitute;
	    this.best=best;
      
  	 
    }
}

