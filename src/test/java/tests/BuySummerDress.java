package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.Loginpage;
import pageObject.SelectingDress;
import resources.BaseEcommerce;

public class BuySummerDress extends BaseEcommerce
{
	public WebDriver driver;

	
	public BuySummerDress(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver= driver2;
	}

	@Test
	public WebDriver Dress() throws IOException, InterruptedException
	{    
		SelectingDress sm = new SelectingDress(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement dr;
		dr=sm.buyprintedChiffondress();
	    js.executeScript("arguments[0].click();", dr);
	    return driver;
	
		
		
	}

	
	


}



