package org.MercuryTours.main;

import java.util.ResourceBundle;

import org.MercuryTours.pages.CommonUtil;
public class MercuryTours {

	public static void main(String[] args) {
		
		ResourceBundle pageprop =ResourceBundle.getBundle("pageproperties");
		CommonUtil utilities = new CommonUtil(pageprop.getString("url"), pageprop.getString("waitingtime"),pageprop.getString("browser"));
		
/*signin details*/
		utilities.txtField(pageprop.getString("usernamexpath"), pageprop.getString("usernametext"));
		utilities.txtField(pageprop.getString("pwdxpath"), pageprop.getString("pwdtext"));
		utilities.clickButton(pageprop.getString("signinxpath"));

/*Flight Details*/
		
		utilities.radioButton(pageprop.getString("findflightxpath"));
		utilities.dropdown(pageprop.getString("fromportxpath"), pageprop.getString("fromporttext"));
		utilities.dropdown(pageprop.getString("frommonthxpath"), pageprop.getString("frommonthtext"));
		utilities.dropdown(pageprop.getString("fromdayxpath"), pageprop.getString("fromdaytext"));
		utilities.dropdown(pageprop.getString("toportxpath"), pageprop.getString("toporttext"));
		utilities.radioButton(pageprop.getString("serviceclassxpath"));
		utilities.clickButton(pageprop.getString("findflightsxpath"));
		
/* Reserve Flights*/
		
		utilities.clickButton(pageprop.getString("reserveflightsxpath"));
		
/* passenger details */
		
		utilities.txtField(pageprop.getString("firstnamexpath"), pageprop.getString("firstnametext"));
		utilities.txtField(pageprop.getString("lastnamexpath"), pageprop.getString("lastnametext"));
		utilities.txtField(pageprop.getString("creditnumberxpath"), pageprop.getString("creditnumbertext"));
		utilities.checkboxselect(pageprop.getString("ticketlessxpath"));
		utilities.clickButton(pageprop.getString("buyflightsxpath"));
	}
}
