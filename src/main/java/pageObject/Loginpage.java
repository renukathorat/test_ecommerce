package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage 
{
	public WebDriver driver;
	By signin= By.className("login");
	By emailAddress=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='passwd']"); 
	By login=By.xpath("//button[@id='SubmitLogin']");
	


public Loginpage(WebDriver driver2) {
	this.driver = driver2;
	}

public WebElement getSignIn()
{
	return driver.findElement(signin);
	
}

public WebElement getEmail()
{
	return driver.findElement(emailAddress);
	
}
public WebElement getpassword()
{ 
	WebElement p= driver.findElement(password);
	return p ;
}

public WebElement getLogin()
{
	WebElement l= driver.findElement(login);
	return l;
	}


}