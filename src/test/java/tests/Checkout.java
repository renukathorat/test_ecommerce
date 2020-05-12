package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObject.DressDescription;
import pageObject.ProcceedtToCheckout;
import resources.BaseEcommerce;

public class Checkout {
	WebDriver driver;
	
	public Checkout(WebDriver driver2) {
		this.driver=driver2;
	}
	
	
	@Test
	public WebDriver proceedToCheckout() 
	
	{   ProcceedtToCheckout pc = new ProcceedtToCheckout(driver); 
	     pc.checkoutbutton().click();
	     pc.checkoutbutton_two().click();
	     pc.checkoutbutton_three().click();
	     pc.checkbox_terms().click();
	     pc.checkoutbutton_four().click();
	     pc.checkoutbutton_five().click();
	     pc.checkoutbutton_six().click();
	     //System.out.print(pc.bck2order().getText());
	     String txt=pc.bck2order().getText();
	     if(txt.equals("Back to orders")){
	    	 System.out.println("Pass");
	     }
	     else {
	    	 System.out.println("Fail");
	     }

	    	    
		return driver;   
		
		
	}

}
