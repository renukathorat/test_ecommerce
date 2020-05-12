package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenuSelection {
	
	public WebDriver driver;
	
	 By women=By.className("sf-with-ul");
	 By summerDress=By.linkText("Summer Dresses");
	 
	 
	public MainMenuSelection(WebDriver driver2) {
		this.driver= driver2;
	}


	public  WebElement womenClick()
	 {
		WebElement a= driver.findElement(women);
		return a;
	 }
	
	public  WebElement summerDress()
	 {
		WebElement b= driver.findElement(summerDress);
		return b;
	 }
	

}
