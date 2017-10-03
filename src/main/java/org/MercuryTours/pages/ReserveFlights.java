package org.MercuryTours.pages;

import java.util.ResourceBundle;

public class ReserveFlights extends PageInfo {
	
	ResourceBundle pageprop =ResourceBundle.getBundle("pageproperties");
	public void reserveFlight()
	{
		clickButton(pageprop.getString("reserveflightsxpath"));
	}

}
