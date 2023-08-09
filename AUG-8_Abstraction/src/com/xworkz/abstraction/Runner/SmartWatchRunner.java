package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.smartwatch.Babitha;
import com.xworkz.abstraction.app.smartwatch.BoatSmartWatch;
import com.xworkz.abstraction.app.smartwatch.SmartWatch;

public class SmartWatchRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Smart watch Runner\n");

		SmartWatch smartWatch = new BoatSmartWatch();

		Babitha babitha = new Babitha(smartWatch);
		babitha.getshowTime();

	}

}