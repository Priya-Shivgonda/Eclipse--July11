package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.waterPurifier.AuroWaterPurifier;
import com.xworkz.abstraction.app.waterPurifier.Ravi;
import com.xworkz.abstraction.app.waterPurifier.WaterPurifier;

public class WaterPurifierRunner {

		public static void main(String[] args) {
			System.out.println("Running main in Water Purifier Runner\n");

			WaterPurifier purifier = new AuroWaterPurifier();

			Ravi ravi = new Ravi(purifier);
			ravi.getPurify();

		}

}
