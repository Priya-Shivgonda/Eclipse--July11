package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.laptop.Dell;
import com.xworkz.abstraction.app.laptop.Laptop;
import com.xworkz.abstraction.app.laptop.Priya;

public class LaptopRunner {

		public static void main(String[] args) {
			System.out.println("Running main in laptop Runner\n");

			Laptop laptop = new Dell();

			Priya  priya = new Priya(laptop);
			priya.display();
		}
}


	