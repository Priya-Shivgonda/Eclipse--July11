package com.Xworkz.Java;

public class Tv {
	static String name;
	 int  price;
	 
	 static void displayStatic()
		{	
		 name="Lcd";
		}
        Tv (int price)
		{
			this.price=price;

		}
		void display()
		{
			System.out.println("name of Tv ="+Tv.name);
			System.out.println("price of Tv ="+this.price);
		}
	}



