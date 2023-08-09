package com.xworkz.abstraction.app.smartwatch;

public class Babitha {
	
	private SmartWatch smartWatch;

	public Babitha(SmartWatch smartWatch) {
		this.smartWatch = smartWatch;
		System.out.println("smart watch arguement in Suraj");
	}

	public void getshowTime() {
		if(smartWatch != null) {
			System.out.println("Watch is not null");
			this.smartWatch.showTime();
		}
		else {
			System.err.println("watch is null, watch not working");
		}
	}


}
	
	