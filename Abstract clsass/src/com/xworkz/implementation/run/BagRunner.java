package com.xworkz.implementation.run;

import com.xworkz.Abstract.app.Bag;
import com.xworkz.implementation.app.AmericanTourister;
import com.xworkz.implementation.app.Imax;

public class BagRunner {

			public static void main(String[] args) {
				Bag bag=new AmericanTourister();
				bag.travelling();
				AmericanTourister ref=new AmericanTourister();
				ref.carrying();
				ref.waterProof();
				Imax imax=new Imax();
				imax.carrying();
				imax.waterProof();
			}

		}
	
