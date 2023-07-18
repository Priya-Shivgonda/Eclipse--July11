package com.xworkz.java;

public class Hotel {
	String hotelName="Gokul cafe";
        int noOfEmployee;
        String location="Btm layout";
        String hotelType;
    
    Owner ref=new Owner("Santosh",50,987654329);
    Owner ref1=new Owner("Rahul",60,989797979);
    
    Hotel(String hotelName,String location)
    {
       System.out.println("Running with const");
       this.hotelName=hotelName;
       this.location=location;
    }

    void setType(String hotelType)
    {
    	System.out.println("Running instance method");
    	this.hotelType=hotelType;
    	
    }
    
    void printInfo()
    {
    	System.out.println("print the variables");
    	System.out.println("Hotel Name="+this.hotelName);
    	System.out.println("Hotel noOfEmployee ="+this.noOfEmployee);
    	System.out.println("Hotel location="+this.location);
    	System.out.println("hotelType="+this.hotelType);
    	this.ref.printOwnerInfo();
    	this.ref1.printOwnerInfo();
    }
}

