package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProcceedtToCheckout {
	public WebDriver driver;
	By checkoutbutton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	By checkoutbutton_two = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
	By checkoutbutton_three = By.xpath("//*[@id='center_column']/form/p/button/span");
	By checkboxterms=By.xpath("//*[@id=\'cgv\']");
	By checkoutbutton_four=By.xpath("//*[@id=\"form\"]/p/button/span");
	By chkbutton_paybywire=By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span");
	By ordercfrm=By.xpath("//*[@id=\"cart_navigation\"]/button/span");
	By bcktoorder=By.xpath("//*[@id=\"center_column\"]/p/a");
	
	
	
	
	

	
	
	



public ProcceedtToCheckout(WebDriver driver2) {
	this.driver=driver2;
}

public WebElement checkoutbutton()
{
 WebElement ct = driver.findElement(checkoutbutton);
 return ct;

}
public WebElement checkoutbutton_two()
{
 WebElement ct_two = driver.findElement(checkoutbutton_two);
 return ct_two;

}
public WebElement checkoutbutton_three()
{
 WebElement ct_three = driver.findElement(checkoutbutton_three);
 return ct_three;

}

public WebElement checkbox_terms() {
	WebElement chk=driver.findElement(checkboxterms);
	return chk;
}

public WebElement checkoutbutton_four()
{
 WebElement ct_four = driver.findElement(checkoutbutton_four);
 return ct_four;

}

public WebElement checkoutbutton_five()
{
 WebElement ct_five = driver.findElement(chkbutton_paybywire);
 return ct_five;

}

public WebElement checkoutbutton_six()
{
 WebElement ct_six = driver.findElement(ordercfrm);
 return ct_six;

}

public WebElement bck2order() {
	WebElement bck=driver.findElement(bcktoorder);
	return bck;
}
}
