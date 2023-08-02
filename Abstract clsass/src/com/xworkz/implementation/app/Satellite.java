package com.xworkz.implementation.app;

import com.xworkz.Abstract.app.Rocket;

public class Satellite extends Rocket{

		@Override
		public void launch() {
			System.out.println("Launchig the rocket");

		}

		@Override
		public void reachToSpace() {
			System.out.println("Rocket reached to space");

		}


	}


