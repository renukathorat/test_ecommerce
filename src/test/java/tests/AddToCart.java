package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObject.DressDescription;

public class AddToCart {
	WebDriver driver;
	
	public AddToCart(WebDriver driver2) {
		this.driver=driver2;
	}
	
	
	@Test
	public WebDriver cart() throws InterruptedException
	{ 
		DressDescription dd = new DressDescription(driver);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		

		for(int i=1;i<6;i++)
		{   //driver.navigate().refresh();
			WebElement qu=dd.quantitySelection();
			qu.click();
			//js.executeScript("arguments[0].click();", qu);
			//Thread.sleep(2000);
			//qu.click();
		}
		WebElement szdropdown=dd.sizeSelection();
		Select size = new Select(szdropdown);
		size.selectByValue("3");
		dd.colorSelection().click();
		dd.addButton().click();
		return driver;
		
		
	}

}
