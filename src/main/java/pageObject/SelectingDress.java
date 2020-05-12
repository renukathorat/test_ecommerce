package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectingDress 
{
	public WebDriver driver;
	String imgnumber = "1";
	By PrintedChiffonDress= By.xpath ("//*[@id=\"center_column\"]/ul/li["+imgnumber+"]/div/div[1]/div/a[2]");
	By more= By.xpath ("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[2]/span");
	
			

public SelectingDress(WebDriver driver2) {
	this.driver = driver2;
	}



public WebElement buyprintedChiffondress()
{
	WebElement dr = driver.findElement(PrintedChiffonDress);
	return dr;
	
}

public WebElement clickMore()
{
	WebElement mr = driver.findElement(more);
	return mr;
	
} 



}