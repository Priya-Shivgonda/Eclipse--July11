package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Calculator;

public class CalculatorRunner {

	
		public static void main(String[] args) {
				
				System.out.println("CaculatorRunner is main method ");
				
				
				// creating instance of the encapsulated class
				
				 Calculator  calculator=new  Calculator();
				 
				
					//setting value in the type member
				 calculator.setType("cisco");
				 calculator.setPrice(200);
				 calculator.setBrand("Flair");
				 calculator.setSize(3);
				 calculator.setNoOfCaculator(4);
				
				//getting value to the type member
				System.out.println("************");
				
				System.out.println(calculator);
				
			}

		}
