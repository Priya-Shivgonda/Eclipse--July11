package com.xworkz.program;

public class TheatreRunner {
	
	public static void maine(String[] args) {
		
		System.out.println("TheaterTunner main method");
		Theatre ref=new Theatre("The Spotlight Theatre", "Bangalore");
		ref.location="Bagalore";
		ref.type=TypeOfTheatre.AC;
		ref.display();
		
		
		
		Theatre ref1=new Theatre("The Phoenix Theater", "Bangalore");
		ref1.location="Bagalore";
		ref1.type=TypeOfTheatre.AC;
		ref1.display();
		
	}

}
