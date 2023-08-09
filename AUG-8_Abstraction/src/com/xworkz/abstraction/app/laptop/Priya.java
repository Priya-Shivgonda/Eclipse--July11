package com.xworkz.abstraction.app.laptop;

public class Priya{
	
	private Laptop  laptop;

	public Priya(Laptop  laptop) {
		this.laptop=laptop;
		System.out.println("laptop argument is priya");
	}

	public void display() {
		if(laptop !=null) {
			System.out.println("laptop is not  null");
			this.laptop.display();
		}
		else {
			System.err.println("laptop is null, laptop not working");
		}
	}


}
	
	


