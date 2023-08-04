package com.xworkz.Interfaces.app.AirPort;

public class BangloreAirportRule implements AirPortRule{

	@Override
	public void getTicket() {
		System.out.println("Ticket should be booked");
	}

	@Override
	public void getPassPort() {
		System.out.println("PassPort Should be Taken");
	}


}
