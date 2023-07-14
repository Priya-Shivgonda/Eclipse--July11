package com.xworkz.program;

public class PhoneRunner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PhoneRunner main method");
		Phone ref=new Phone("Realme",400);
		ref.noOfPhone(70);
		ref.type=PhoneType.Smartphones;
		ref.display();
		
		
		Phone ref1=new Phone("oppo",300);
		ref1.noOfPhone(70);
		ref1.type=PhoneType.Gaming_Phones;
		ref1.display();
		
}
}

