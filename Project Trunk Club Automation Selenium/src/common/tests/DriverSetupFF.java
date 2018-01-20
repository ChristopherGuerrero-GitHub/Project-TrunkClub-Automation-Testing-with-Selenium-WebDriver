package common.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import common.pageobjects.FAQPage;

public class DriverSetupFF {
	
	static WebDriver testDriver;
	
	@Test
	public static WebDriver setUpTestWebDriver() {
		
		// Create FireFox driver object	and string object 
		// variable for URL for Home Page.	
    	System.setProperty("webdriver.firefox","C:\\Users\\Christopher\\Documents\\WebDrivers\\FireFoxDriver\\geckodriver-v0.19.1-win64");
		WebDriver testDriverFF = new FirefoxDriver();		
		String baseUrl = "https://www.trunkclub.com/faq";
		
		// launch Fire fox and direct it to the Base HomePage 
		// URL and maximize window.
        testDriverFF.get(baseUrl);
        testDriverFF.manage().window().maximize();
        	        
        testDriver = testDriverFF;
        
        return testDriverFF;
       
						
	}
	
	@Test
	public static WebDriver getTestWebDriverFF() {
		return testDriver;
	}
	
		
	

}
