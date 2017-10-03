package org.MercuryTours.pages;

import java.util.ResourceBundle;

public class SignInDetails extends PageInfo {

	ResourceBundle pageprop =ResourceBundle.getBundle("pageproperties");
	public void  signIn()
	{
		//Enter login details and click login/continue
		txtField(pageprop.getString("usernamexpath"), pageprop.getString("usernametext"));
		txtField(pageprop.getString("pwdxpath"), pageprop.getString("pwdtext"));
		clickButton(pageprop.getString("signinxpath"));

	}
}
