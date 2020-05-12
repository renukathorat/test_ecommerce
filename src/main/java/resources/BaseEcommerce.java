package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseEcommerce {
	public WebDriver driver;
	public Properties prop;
    public String browserName;
	
	public WebDriver intializeDriver() throws IOException {
		
        
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/renuka/eclipse-workspace/Ecommerce/src/main/java/resources/values.properties");
		prop.load(fis);
		browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		
		  if(browserName.equals("chrome"))
		  { 
			  //ChromeDriverManager.getInstance().setup();
			  System.setProperty("webdriver.chrome.driver","/Users/renuka/chromedriver" );
		      driver = new ChromeDriver();
		  } 
		 
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  return driver;
		 
		
		
	
	}

}
