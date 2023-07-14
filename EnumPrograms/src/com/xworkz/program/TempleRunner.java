package com.xworkz.program;

public class TempleRunner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TempleRunner main method");
		Temple ref=new Temple("venkateshwar","Btm");
		ref.time(5);
		ref.type=TypeOfTemple.Hindu_Temple;
		ref.display();
		
		Temple ref1=new Temple("venkateshwar","Btm");
		ref1.time(5);
		ref1.type=TypeOfTemple.Hindu_Temple;
		ref1.display();
		
		
	}
}

