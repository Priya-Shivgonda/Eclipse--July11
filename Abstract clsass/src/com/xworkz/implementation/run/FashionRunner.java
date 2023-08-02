package com.xworkz.implementation.run;

import com.xworkz.Abstract.app.Fashion;
import com.xworkz.implementation.app.Beautician;
import com.xworkz.implementation.app.Designer;

public class FashionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fashion  fashion =new Beautician();
		fashion.hairstyle();
		Beautician  ref=new Beautician();
		ref.dressing();
		ref.makeup();
     	Designer ref1= new Designer();
     	ref1.dressing();
		ref1.makeup();
	}
		
		
		
	}

