package com.xworkz.java;

public class IplTeamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MovieRunner main method");
		IplTeam ref=new IplTeam("RCB");
        ref.setCaptain("C.K.Nayudu");
        ref.noOfTeam=30;
        ref.printInfo();
        
        IplTeam ref1=new IplTeam("Chennai super Kings");
        ref1.setCaptain("Virat Khohil");
        ref1.noOfTeam=20;
        ref1.printInfo();
        
     }
               
}
