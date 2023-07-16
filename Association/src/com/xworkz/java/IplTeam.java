package com.xworkz.java;

public class IplTeam {
	String teamName;
    int  noOfTeam;
    int noOfPlayers;
    String captainName;
    
    Franchise ref=new Franchise ("Kumar","Rohit",2008);
    Franchise ref1=new Franchise("Rahul","chandu",2010);
    
    IplTeam (String teamName)
    {
       System.out.println("Running with const");
       this.teamName=teamName;
       
    }

    void setCaptain(String CaptainName)
    {
    	System.out.println("Running instance method");
    	this.captainName=CaptainName;
    	
    }
    
    void printInfo()
    {
    	System.out.println("print the variables");
    	System.out.println("teamName="+this.teamName);
    	System.out.println("noOfTeam ="+this.noOfTeam);
    	System.out.println("noOfPlayers="+this.noOfPlayers);
    	System.out.println("captainName="+this.captainName);
    	this.ref.printFranchiseInfo();
    	this.ref1.printFranchiseInfo();
    }
}

