package com.xworkz.java;

public class Movie {
	String movieName;
    int  ticketPrice;
    String heroName;
    String theatreName;
    
    Director ref=new Director("Kumar",50,"kumar@gmail.com");
    Director ref1=new Director("Rahul",60,"rahul@gmail.com");
    
    Movie(String movieName)
    {
       System.out.println("Running with const");
       this.movieName=movieName;
       
    }

    void setHero(String heroName)
    {
    	System.out.println("Running instance method");
    	this.heroName=heroName;
    	
    }
    
    void printInfo()
    {
    	System.out.println("print the variables");
    	System.out.println("Movie Name="+this.movieName);
    	System.out.println("ticket price ="+this.ticketPrice);
    	System.out.println(" hero Name="+this.heroName);
    	System.out.println("theatreName="+this.theatreName);
    	this.ref.printDirectorInfo();
    	this.ref1.printDirectorInfo();
    }
}
