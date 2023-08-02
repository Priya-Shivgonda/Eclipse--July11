package com.xworkz.implementation.app;

import com.xworkz.Abstract.app.Mobile;

public class Samsung extends Mobile {

	@Override
	public void incoming() {
		System.out.println("Samsung has incoming calls");

	}

	@Override
	public void outgoing() {
		System.out.println("Samsung has outgoing calls");

	}

}
