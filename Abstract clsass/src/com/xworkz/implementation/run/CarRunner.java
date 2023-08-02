package com.xworkz.implementation.run;

import com.xworkz.Abstract.app.Car;
import com.xworkz.implementation.app.BMW;
import com.xworkz.implementation.app.Maruti_suzuki;

public class CarRunner {

	
	public static void main(String[] args)
	{
		
		Car bmw=new BMW();
		bmw.speed();
		BMW bmw1=new BMW();
		bmw1.run();
		bmw1.speed();
		Maruti_suzuki ref=new Maruti_suzuki();
		ref.run();
		ref.speed();

		
	}
}