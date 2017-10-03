package org.MercuryTours.pages;

import java.util.ResourceBundle;

public class FlightDetails extends PageInfo {
	
ResourceBundle pageprop =ResourceBundle.getBundle("pageproperties");
	public void enterFlightDetails()
	{
		radioButton(pageprop.getString("findflightxpath"));
		dropdown(pageprop.getString("fromportxpath"), pageprop.getString("fromporttext"));
		dropdown(pageprop.getString("frommonthxpath"), pageprop.getString("frommonthtext"));
		dropdown(pageprop.getString("fromdayxpath"), pageprop.getString("fromdaytext"));
		dropdown(pageprop.getString("toportxpath"), pageprop.getString("toporttext"));
		radioButton(pageprop.getString("serviceclassxpath"));
		clickButton(pageprop.getString("findflightsxpath"));
	}

}
