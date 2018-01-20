package common.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import common.pageobjects.FAQPage;

/* ****************************************************************************

	Title: Project TrunkClub Automation Testing with Selenium WebDriver          
																			  
	Creator: Christopher Guerrero											 
																			  
	Date: 01/12/2018														 
																			  
	Purpose: 
	To create automation testing for TrunkClub FAQ website. Used Page
	Object Model pattern design. 
	
	Created a page object named: FAQPage java class located in the 
	package .common.pageobjects. This page object will contain
	the website's WebElements data members and methods for 
	retrieving the WebElements for each of the 24 Test cases purpose.
																			  
	Used Selenium IDE to create 24 Test cases that were saved
	into a Excel spreadsheet named: TestCasesTrunkClub. The 24
	Test cases will each test a different part of the FAQ website
	overall. The goal of the Test cases consist of testing the Main
	header operation, each expansion/collapsing of header options, 
	all the embedded links contained with each of the expanded/collapsed
	header menu options,and also the links at the footer of the website.
	
	Recreated each of the 24 test cases into Java with Selenium WebDriver
	and saved them into the	following java package location: .common.tests
											  
																  	
	Created FireFox Driver:	 testDriverFF					  
																			  
	Input:	N/A																 
																			  
	Output:	
	Testing navigation, links, and operation of the FAQ TrunkClub website 		  
			
* ****************************************************************************/


public class CustomFAQMenuOptions {
	
		@Test
		public void temp14() {
		
		WebDriver testDriverFF = DriverSetupFF.getTestWebDriverFF();
		
	    // Create and initialize FAQPage class object 
	    // and pass FireFox driver object as argument.
	    FAQPage objFAQ = new FAQPage(testDriverFF);
	   
	    List <WebElement> tmpHCX = objFAQ.getHeaderClothingLinkX();
	    
	    for(int i = 0; i < tmpHCX.size(); i++){
	    	
	    	if(tmpHCX.get(i).isDisplayed()) {
	    		tmpHCX.get(i).click();   
        		System.out.println("Element was found: " + tmpHCX.get(i).getText().toString());
        	}else {
        		tmpHCX.get(0).click();
        		//testDriverFF.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		if(tmpHCX.get(i).isDisplayed()) {
        			tmpHCX.get(i).click();
        			System.out.println("Element was found after Retry: " + tmpHCX.get(i).getText().toString());
        		}else {
        			System.out.println("Element was NOT clickable after Retry: " + tmpHCX.get(i).getText().toString());
        		}
        		
        	}
	    }
	    
	    for(int i = (tmpHCX.size()-1); i >= 0; i--){
	    		    	
	    	if(tmpHCX.get(i).isDisplayed()) {
	    		tmpHCX.get(i).click();   
        		System.out.println("Element was found: " + tmpHCX.get(i).getText().toString());
        	}else {
        		tmpHCX.get(0).click();
        		//testDriverFF.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		if(tmpHCX.get(i).isDisplayed()) {
        			tmpHCX.get(i).click();
        			System.out.println("Element was found after Retry: " + tmpHCX.get(i).getText().toString());
        		}else {
        			System.out.println("Element was NOT clickable after Retry: " + tmpHCX.get(i).getText().toString());
        		}
        		
        	}
	    }
	    
	    
	}



}
