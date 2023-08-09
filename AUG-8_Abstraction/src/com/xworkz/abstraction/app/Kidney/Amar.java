package com.xworkz.abstraction.app.Kidney;

public class Amar {
	private Kidney kidney;

	public (Kidney kidney) {
		this.kidney = kidney;
		System.out.println("Kidney arguement constructor of Manoj");
	}

	public void check() {
		if(kidney!=null) {
			System.out.println("kidney is not null");
			this.kidney.clean();
		}
		else {
			System.err.println("Kidney is null, kidney not working...");
		}
	}
}


