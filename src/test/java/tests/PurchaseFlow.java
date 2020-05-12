package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObject.Loginpage;
import pageObject.MainMenuSelection;
import resources.BaseEcommerce;

public class PurchaseFlow extends BaseEcommerce{
	public WebDriver driver;
	
    @BeforeTest
	public void browserOpen() throws IOException
	{
		driver= intializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void productSelection() throws IOException, InterruptedException
	
	{   
		Loginpage l = new Loginpage(driver);
		l.getSignIn().click();
		String email= prop.getProperty("eml");
		String pwd= prop.getProperty("password");	
		l.getEmail().sendKeys(email);
		l.getpassword().sendKeys(pwd);
		l.getLogin().click();
		MainMenuSelection db = new MainMenuSelection(driver); //methods to select menu

	    //this section will select Women -->Summer Dress
		Actions act = new Actions(driver);
		WebElement a=db.womenClick();
		act.moveToElement(a).build().perform(); //hover over women option
		db.summerDress().click(); //click summer dress
		
		BuySummerDress buy = new BuySummerDress(driver); 
		driver=buy.Dress();
		AddToCart ad = new AddToCart(driver);
		driver=ad.cart();
		Checkout ct = new Checkout(driver);
		driver = ct.proceedToCheckout();
		
		
		
		
    }
	@AfterTest
	public WebDriver closewindow()
	{
		driver.quit();
		return driver;
	}

	
}
