package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Loginpage;
import resources.BaseEcommerce;

public class HomePage extends BaseEcommerce{
	
	 


	@BeforeTest
	public void initialize() throws IOException
	{
	driver =intializeDriver(); 
	driver.get(prop.getProperty("url"));
	}
		
	
	@Test
	public void homepagelogin() throws IOException {
		Loginpage l = new Loginpage(driver);
		l.getSignIn().click();
		String email= prop.getProperty("eml");
		String pwd= prop.getProperty("password");	
		l.getEmail().sendKeys(email);
		l.getpassword().sendKeys(pwd);
		l.getLogin().click();
		 

}
	@AfterTest
	public void closewindow()
	{
		driver.close();
		driver=null;
		
	}
}
