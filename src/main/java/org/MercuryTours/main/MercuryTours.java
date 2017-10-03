package org.MercuryTours.main;

import java.util.ResourceBundle;

import org.MercuryTours.pages.FlightDetails;
import org.MercuryTours.pages.PageInfo;
import org.MercuryTours.pages.PassengerDetails;
import org.MercuryTours.pages.ReserveFlights;
import org.MercuryTours.pages.SignInDetails;
public class MercuryTours {

	public static void main(String[] args) {
		ResourceBundle pageprop =ResourceBundle.getBundle("pageproperties");
		//Sign in the Login Page
		SignInDetails signIn = new SignInDetails();
		signIn.signIn();
		
		//Enter the required Flight Details
		FlightDetails fd = new FlightDetails();
		fd.enterFlightDetails();
		
		//Click on Reserve flight button
		ReserveFlights rf = new ReserveFlights();
		rf.reserveFlight();
		
		//Enter passenger details, creditcard details and checkout
		PassengerDetails pd = new PassengerDetails();
		pd.passengerDetails();
		
	}
	/*public static void main1(String a[])
	{
		ResourceBundle pageprop =ResourceBundle.getBundle("pageproperties");
		PageInfo utilities = new PageInfo();//pageprop.getString("url"), pageprop.getString("waitingtime"),pageprop.getString("browser"));
		
signin details
		utilities.txtField(pageprop.getString("usernamexpath"), pageprop.getString("usernametext"));
		utilities.txtField(pageprop.getString("pwdxpath"), pageprop.getString("pwdtext"));
		utilities.clickButton(pageprop.getString("signinxpath"));

Flight Details
		
		utilities.radioButton(pageprop.getString("findflightxpath"));
		utilities.dropdown(pageprop.getString("fromportxpath"), pageprop.getString("fromporttext"));
		utilities.dropdown(pageprop.getString("frommonthxpath"), pageprop.getString("frommonthtext"));
		utilities.dropdown(pageprop.getString("fromdayxpath"), pageprop.getString("fromdaytext"));
		utilities.dropdown(pageprop.getString("toportxpath"), pageprop.getString("toporttext"));
		utilities.radioButton(pageprop.getString("serviceclassxpath"));
		utilities.clickButton(pageprop.getString("findflightsxpath"));
		
 Reserve Flights
		
		utilities.clickButton(pageprop.getString("reserveflightsxpath"));
		
 passenger details 
		
		utilities.txtField(pageprop.getString("firstnamexpath"), pageprop.getString("firstnametext"));
		utilities.txtField(pageprop.getString("lastnamexpath"), pageprop.getString("lastnametext"));
		utilities.txtField(pageprop.getString("creditnumberxpath"), pageprop.getString("creditnumbertext"));
		utilities.checkboxselect(pageprop.getString("ticketlessxpath"));
		utilities.clickButton(pageprop.getString("buyflightsxpath"));
	}*/
}
