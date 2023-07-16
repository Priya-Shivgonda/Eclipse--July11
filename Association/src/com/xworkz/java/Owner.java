package com.xworkz.java;

public class Owner {
	String OwnerName;
    int OwnerAge;
    long phoneNumber;

    Owner(String OwnerName, int OwnerAge,long phoneNumber)
    {
   	 this.OwnerName=OwnerName;
   	 this.OwnerAge=OwnerAge;
   	 this.phoneNumber=phoneNumber;
   	 
    }
  void printOwnerInfo()
  {
	   System.out.println("Owner name="+this.OwnerName);
	   System.out.println("Owner age="+this.OwnerAge);
	   System.out.println("phone Number="+this.phoneNumber);
	   
  }
}
