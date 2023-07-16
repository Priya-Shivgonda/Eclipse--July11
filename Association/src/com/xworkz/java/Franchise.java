package com.xworkz.java;

public class Franchise {
	String Name;
    String OwnerName;
    int establishedIn;
    
    Franchise(String Name, String OwnerName, int establishedIn)
    {
   	 this.Name=Name;
   	 this.OwnerName=OwnerName;
   	 this.establishedIn=establishedIn;
   	 
    }
    void printFranchiseInfo()
   {
	   System.out.println("Name="+this.Name);
	   System.out.println("OwnerName="+this.OwnerName);
	   System.out.println("establishedIn="+this.establishedIn);
	   
  }
}

