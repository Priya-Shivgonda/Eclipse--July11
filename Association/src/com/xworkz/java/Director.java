package com.xworkz.java;

public class Director {
     String directorName;
     int directorAge;
     String email;
     
     Director(String directorName, int directorAge, String email)
     {
    	 this.directorName=directorName;
    	 this.directorAge=directorAge;
    	 this.email=email;
    	 
     }
   void printDirectorInfo()
   {
	   System.out.println("Director name="+this.directorName);
	   System.out.println("Director age="+this.directorAge);
	   System.out.println("Director email="+this.email);
	   
   }
}
