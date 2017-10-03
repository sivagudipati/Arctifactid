package org.MercuryTours.pages;

import java.util.ResourceBundle;

public class PassengerDetails extends PageInfo {

	ResourceBundle pageprop =ResourceBundle.getBundle("pageproperties");
	public void passengerDetails()
	
	{
		txtField(pageprop.getString("firstnamexpath"), pageprop.getString("firstnametext"));
		txtField(pageprop.getString("lastnamexpath"), pageprop.getString("lastnametext"));
		txtField(pageprop.getString("creditnumberxpath"), pageprop.getString("creditnumbertext"));
		checkboxselect(pageprop.getString("ticketlessxpath"));
		clickButton(pageprop.getString("buyflightsxpath"));	
		
	}
	
	
	
	
	
	
	
}
