package com.xworkz.implementation.run;

import com.xworkz.Abstract.app.Mobile;
import com.xworkz.implementation.app.Realme;
import com.xworkz.implementation.app.Samsung;

public class MobileRunner {

	
	public static void main(String[] args) {
		Mobile mobile=new Realme();
		mobile.capturePics();
		Realme ref=new Realme();
		ref.incoming();
		ref.outgoing();
		Samsung ref1=new Samsung();
		ref1.outgoing();
		ref1.incoming();
	}
}
