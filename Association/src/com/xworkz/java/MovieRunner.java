package com.xworkz.java;

public class MovieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
        	System.out.println("MovieRunner main method");
            Movie ref=new Movie("KGF");
            ref.setHero("Yesh");
            ref.theatreName="Gopalan";
            ref.printInfo();
            
            Movie ref1=new Movie("Kranti");
            ref1.setHero("Darshan");
            ref1.theatreName="Multiplex";
            ref1.printInfo();
            
         }
                   
	}
