package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressDescription {
	public WebDriver driver;
	By quantity = By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span");
	By size = By.xpath("//*[@id=\"group_1\"]");
	By color = By.xpath("//*[@id=\"color_13\"]");
	By button = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By cart = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b");
	
	



public DressDescription(WebDriver driver2) {
	this.driver=driver2;
}



public WebElement quantitySelection()
{   
	WebElement qu=driver.findElement(quantity);
	return qu;

  
}
public WebElement sizeSelection()
{   
	WebElement sz=driver.findElement(size);
	return sz;

  
}
public WebElement colorSelection()
{   
	WebElement cr=driver.findElement(color);
	return cr;

  
}
public WebElement addButton()
{   
	WebElement bt=driver.findElement(button);
	return bt;

  
}
}