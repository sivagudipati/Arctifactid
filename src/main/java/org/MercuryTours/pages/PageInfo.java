package org.MercuryTours.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageInfo {
	
	static WebDriver driver = null;
	static WebDriverWait wait = null;
	ResourceBundle pageprop =ResourceBundle.getBundle("pageproperties");
//public CommonUtil (String URL, String waitingtime, String browser){
	public PageInfo()
	{
		if(driver == null)
		{
		String URL = pageprop.getString("url");
		String waitingtime = pageprop.getString("waitingtime");
		String browser = pageprop.getString("browser");
	if (browser.equalsIgnoreCase("chrome"))
	{
		driver= new ChromeDriver();
	}
	
	else if (browser.equalsIgnoreCase("internetExplorer"))
	{
		driver = new InternetExplorerDriver();
	}
	else if (browser.equalsIgnoreCase("FireFox"))
	{
		System.setProperty("webdriver.gecko.driver", pageprop.getString("browserdriver"));
		driver = new FirefoxDriver();
	}
	
	else 
	{
		//No browsers selected, take the default browser
		System.setProperty("webdriver.gecko.driver", pageprop.getString("browserdriver"));
		driver = new FirefoxDriver();
		System.out.println("no other browser selected, Firefox initiated");
	}

	wait = new WebDriverWait(driver, Integer.parseInt(waitingtime));
	driver.get(URL);
		}
	}

public void txtField(String xpath, String text)
{
	WebElement element = driver.findElement(By.xpath(xpath));
	element.sendKeys(text);
	
}

public void clickButton (String xpath)
{
	WebElement element = driver.findElement(By.xpath(xpath));
	element.click();
}

public void radioButton (String xpath)

{
	
	WebElement element = driver.findElement(By.xpath(xpath));
	element.click();
}


public void dropdown (String xpath, String value)
{
	
	Select ddm = new Select (driver.findElement(By.xpath(xpath)));
	ddm.selectByValue(value);
}

public void checkboxselect (String xpath)

{
	WebElement element = driver.findElement(By.xpath(xpath));
	element.click();
}

}


