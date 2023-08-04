package com.xworkz.Implements.Runner;

import com.xworkz.Interfaces.app.AirPort.BangloreAirportRule;
import com.xworkz.Interfaces.app.Bank.SBIBankRule;
import com.xworkz.Interfaces.app.Company.SoftwareCompanyRule;
import com.xworkz.Interfaces.app.Home.MyHomeRule;
import com.xworkz.Interfaces.app.Hospital.CityHospitalRule;
import com.xworkz.Interfaces.app.Hostel.CollegeHostelRule;
import com.xworkz.Interfaces.app.Hostel.HostelRule;
import com.xworkz.Interfaces.app.Hotel.NonVegHotelRule;
import com.xworkz.Interfaces.app.Metro.BangloreMetroRule;
import com.xworkz.Interfaces.app.Metro.MetroRule;
import com.xworkz.Interfaces.app.Pub.HighfyPubRule;
import com.xworkz.Interfaces.app.Saloon.DesiSaloonRule;
import com.xworkz.Interfaces.app.Theatre.LocalTheatreRule;
import com.xworkz.Interfaces.app.VTU.CollegeVTURule;
import com.xworkz.Interfaces.appArmy.GeneralArmyRule;

public class AllRunner {
	
	private static final String AirportRule = null;

	public static void main(String[] args) {

		System.out.println("**ArmyRule**");
		GeneralArmyRule generalArmyRule = new GeneralArmyRule();
		generalArmyRule.getHairCut();
		generalArmyRule.getUniform();
		System.out.println("Wake Up At :"+generalArmyRule.WAKE_UP_AT);

		System.out.println("******************************");

		System.out.println("**SaloonRule**");
		DesiSaloonRule desiSaloonRule = new DesiSaloonRule();
		desiSaloonRule.waitForYourTurn();
		desiSaloonRule.dontMove();
		System.out.println("Price is :"+desiSaloonRule.PRICE);

		System.out.println("******************************");

		System.out.println("**HostelRule**");
		HostelRule hostelRule = new CollegeHostelRule();
		System.out.println("Hostel Name is :"+hostelRule.HOSTEL_NAME);
		hostelRule.closingTime();
		hostelRule.getFee();

		System.out.println("*******************************");

		System.out.println("**Hospital Rule**");
		CityHospitalRule cityHospitalRule = new CityHospitalRule();
		System.out.println("Hospital Open Time is :"+cityHospitalRule.OPEN_TIME);
		cityHospitalRule.getMask();
		cityHospitalRule.getMedicine();

		System.out.println("*******************************");

		System.out.println("**Metro Rules**");
		BangloreMetroRule bangloreMetroRule = new BangloreMetroRule();
		MetroRule.getStation();
		bangloreMetroRule.getTicket();
		bangloreMetroRule.getPlatform();

		System.out.println("********************************");

		System.out.println("**Hotel Rule**");
		NonVegHotelRule nonVegHotelRule = new NonVegHotelRule();
		System.out.println("Hotel Type is :"+NonVegHotelRule.HOTEL_TYPE);
		nonVegHotelRule.getFood();
		nonVegHotelRule.payBill();

		System.out.println("*********************************");

		System.out.println("**Airport Rule**");
		BangloreAirportRule bangloreAirportRule = new BangloreAirportRule();
		System.out.println("Airport Loction is :"+BangloreAirportRule.LOCATION);
		bangloreAirportRule.getPassPort();
		bangloreAirportRule.getTicket();

		System.out.println("*********************************");

		System.out.println("**Theatre Rule**");

		LocalTheatreRule localTheatreRule = new LocalTheatreRule();
		System.out.println("Movie name is :"+LocalTheatreRule.MOVIE_NAME);
		localTheatreRule.getOnTime();
		localTheatreRule.getTicket();

		System.out.println("*********************************");

		System.out.println("**Home Rule**");
		MyHomeRule myHomeRule = new MyHomeRule();
		System.out.println("Rule Maker is :"+MyHomeRule.RULE_MAKER);
		myHomeRule.getHomeBefore();
		myHomeRule.dontUseBadWords();

		System.out.println("**********************************");

		System.out.println("**Company Rule**");
		SoftwareCompanyRule softwareCompanyRule = new SoftwareCompanyRule();
		System.out.println("Work Start Time is :"+SoftwareCompanyRule.WORK_START_TIME);
		softwareCompanyRule.getEmployeId();
		softwareCompanyRule.getFormal();

		System.out.println("**********************************");

		System.out.println("**Pub Rule**");
		HighfyPubRule highfyPubRule = new HighfyPubRule();
		System.out.println("Pub opens at :"+HighfyPubRule.OPEN_TIME);
		highfyPubRule.getPartner();
		highfyPubRule.dontFight();

		System.out.println("**********************************");

		System.out.println("**VTU Rule**");
		CollegeHostelRule collegeVTURule = new CollegeHostelRule();
		
		
		System.out.println("***********************************");

		System.out.println("**Bank Rule**");
		SBIBankRule sbiBankRule = new SBIBankRule();
		System.out.println("Bank Name :"+SBIBankRule.BANK_NAME);
		sbiBankRule.getPassbook();
		sbiBankRule.getWait();

	}

	
}

