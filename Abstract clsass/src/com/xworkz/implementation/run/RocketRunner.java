package com.xworkz.implementation.run;

import com.xworkz.Abstract.app.Rocket;
import com.xworkz.implementation.app.Chandrayan;
import com.xworkz.implementation.app.Satellite;
		public class RocketRunner {

			public static void main(String[] args) {
				Rocket rocket=new Satellite();
				rocket.budget();
				Satellite ref=new Satellite();
				ref.reachToSpace();
				ref.launch();
				Chandrayan ref1=new Chandrayan();
				ref1.reachToSpace();
				ref1.launch();

			}
	}


