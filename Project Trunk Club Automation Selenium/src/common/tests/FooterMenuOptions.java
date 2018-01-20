package common.tests;

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


public class FooterMenuOptions {
	
	@Test
	public void temp24 () {
			
			WebDriver testDriverFF = DriverSetupFF.getTestWebDriverFF();
			
			//WebDriver testDriverFF = DriverSetupFF.setUpTestWebDriver();
		
	        // Create and initialize FAQPage class object 
	        // and pass FireFox driver object as argument.
	        FAQPage objFAQ = new FAQPage(testDriverFF);
	        
	         
	        WebElement wElemLnk = objFAQ.getfooterWomenPage();
	        wElemLnk.click();
	        //testDriverFF.navigate().back();
	        wElemLnk = objFAQ.getLinkFAQPage();
	        wElemLnk.click();
	        objFAQ.refreshElements();
	        
	        wElemLnk = objFAQ.getfooterMenPage();
	        wElemLnk.click();
	        //testDriverFF.navigate().back();
	        wElemLnk = objFAQ.getLinkFAQPage();
	        wElemLnk.click();
	        objFAQ.refreshElements();
	        
	        wElemLnk = objFAQ.getfooterCustomPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        
	        wElemLnk = objFAQ.getfooterBusinessPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        //wElemLnk = objFAQ.getLinkFAQPage();
	        objFAQ.refreshElements();
	        
	        
	        wElemLnk = objFAQ.getfooterLocationsPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        
	        wElemLnk = objFAQ.getfooterGiftCardPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        
	        wElemLnk = objFAQ.getfooterAboutUsPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        
	        /*wElemLnk = objFAQ.getfooterCareerPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        */
	        wElemLnk = objFAQ.getfooterPressPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        
	        wElemLnk = objFAQ.getfooterContactPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	     	      
	        wElemLnk = objFAQ.getfooterLogoPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        
	        wElemLnk = objFAQ.getfooterFaceBookPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        
	        wElemLnk = objFAQ.getfooterTwitterPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        
	        wElemLnk = objFAQ.getfooterPinterestPage();
	        wElemLnk.click();
	        testDriverFF.navigate().back();
	        objFAQ.refreshElements();
	        
	        
	        // quit FireFox browser object
	     	//testDriverFF.quit();
	        
		}
		
				

}
