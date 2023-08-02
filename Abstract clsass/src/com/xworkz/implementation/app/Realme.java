package com.xworkz.implementation.app;

import com.xworkz.Abstract.app.Mobile;

public class Realme extends Mobile{

	@Override
	public void incoming() {
		System.out.println("Realme has incoming calls");

	}

	@Override
	public void outgoing() {
		System.out.println("Realme has ougoing calls");

	}

}
	

