package common.pageobjects;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


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


public class FAQPage {
		
	WebDriver testDriver;
	
	// Create By for web page anchor links data instant members
	By anchorTagname = By.tagName("a");
	
	//Case 1 data instant members
	By openFAQPage = By.xpath("https://www.trunkclub.com/faq");
	By homePage = By.id("Trunk-Club:A-Nordstrom-Company");
	By womenPage = By.partialLinkText("Women");
	By menPage = By.partialLinkText("Men");
	By signInPage = By.linkText("Sign In");
	By getStartedPage = By.linkText("Get Started");
	By linkFAQPage = By.linkText("Visit our FAQ page");
	
	//Case 2 General FAQ Menu Options data instant members
	By headerGeneral = By.xpath("//header[@id='general']/h3");
	By headerGeneral1 = By.xpath("//li/h4");
	By headerGeneral2 = By.xpath("//li[2]/h4");
	By headerGeneral3 = By.xpath("//li[3]/h4");
	By headerGeneral4 = By.xpath("//li[4]/h4");
	By headerGeneral5 = By.xpath("//li[5]/h4");
	By headerGeneral6 = By.xpath("//li[6]/h4");
	By headerGeneral7 = By.xpath("//li[7]/h4");
	By headerGeneral8 = By.xpath("//li[8]/h4");
	By headerGeneral9 = By.xpath("//li[9]/h4");
	By headerGeneral10 = By.xpath("//li[10]/h4");
	
	//Case 3 General Sub Menu Links data instant members
	By headerGeneralLink1 = By.linkText("Boston");
	By headerGeneralLink2 = By.linkText("Charleston");
	By headerGeneralLink3 = By.linkText("Chicago");
	By headerGeneralLink4 = By.linkText("Dallas");
	By headerGeneralLink5 = By.linkText("Washington D.C.");
	By headerGeneralLink6 = By.linkText("Los Angeles");
	By headerGeneralLink7 = By.linkText("New York City");
	By headerGeneralLink8 = By.linkText("service@trunkclub.com");
	By headerGeneralLink9 = By.linkText("learn more about here");
	By headerGeneralLink10 = By.linkText("Nordstrom Card");
	By headerGeneralLink11 = By.linkText("a consultation with your stylist");
	By headerGeneralLink12 = By.linkText("online");
	By headerGeneralLink13 = By.linkText("iPhone");
	By headerGeneralLink14 = By.linkText("Android");
	By headerGeneralLink15 = By.linkText("referral page");
	By headerGeneralLink16 = By.linkText("support page");
	By headerGeneralLink17 = By.linkText("1-800-385-0100");
	By headerGeneralLink18 = By.xpath("(//a[contains(text(),'service@trunkclub.com')])[2]");
	
	//Case 4 Pricing FAQ Menu Options data instant members
	By headerPricing = By.xpath("//header[@id='pricing-faq']/h3");
	By headerPricing1 = By.xpath("//section[2]/ol/li/h4");
	By headerPricing2 = By.xpath("//section[2]/ol/li[2]/h4");
	By headerPricing3 = By.xpath("//section[2]/ol/li[3]/h4");
	By headerPricing4 = By.xpath("//section[2]/ol/li[4]/h4");
	By headerPricing5 = By.xpath("//section[2]/ol/li[5]/h4");
	By headerPricing6 = By.xpath("//section[2]/ol/li[6]/h4");
	By headerPricing7 = By.xpath("//section[2]/ol/li[7]/h4");
	By headerPricing8 = By.xpath("//section[2]/ol/li[8]/h4");
			
	//Case 5 Pricing Sub Menu Links data instant members
	By headerPricingLink1 = By.linkText("Click here");
	By headerPricingLink2 = By.linkText("Terms of Service");
	
	//Case 6 Clothing FAQ Menu Options data instant members
	By headerClothing = By.xpath("//header[@id='clothing']/h3");
	By headerClothing1 = By.xpath("//section[3]/ol/li/h4");
	By headerClothing2 = By.xpath("//section[3]/ol/li[2]/h4");
	By headerClothing3 = By.xpath("//section[3]/ol/li[3]/h4");
	By headerClothing4 = By.xpath("//section[3]/ol/li[4]/h4");
	By headerClothing5 = By.xpath("//section[3]/ol/li[5]/h4");
	By headerClothing6 = By.xpath("//section[3]/ol/li[6]/h4");
	
	//Case 7 Clothing Sub Menu Links data instant members
	By headerClothingLink1 = By.linkText("click here");
	By headerClothingLink2 = By.linkText("core brands here");
	By headerClothingLink3 = By.xpath("(//a[contains(@href, 'https://itunes.apple.com/us/app/trunk-club/id635441999')])[2]");
	By headerClothingLink4 = By.xpath("(//a[contains(@href, 'https://play.google.com/store/apps/details?id=com.trunkclub.member&amp;hl=en')])[2]");
	By headerClothingLink5 = By.linkText("here");
	By headerClothingLink6 = By.linkText("Clubhouses");
	
	//Case 8 Shipping & Returns FAQ Menu Options data instant members
	By headerShipReturn = By.xpath("//header[@id='shipping']/h3");
	By headerShipReturn1 = By.xpath("//section[4]/ol/li/h4");
	By headerShipReturn2 = By.xpath("//section[4]/ol/li[2]/h4");
	By headerShipReturn3 = By.xpath("//section[4]/ol/li[3]/h4");
	By headerShipReturn4 = By.xpath("//section[4]/ol/li[4]/h4");
	By headerShipReturn5 = By.xpath("//section[4]/ol/li[5]/h4");
	By headerShipReturn6 = By.xpath("//section[4]/ol/li[6]/h4");
	By headerShipReturn7 = By.xpath("//section[4]/ol/li[7]/h4");
	By headerShipReturn8 = By.xpath("//section[4]/ol/li[8]/h4");
	By headerShipReturn9 = By.xpath("//section[4]/ol/li[9]/h4");
	By headerShipReturn10 = By.xpath("//section[4]/ol/li[10]/h4");
	By headerShipReturn11 = By.xpath("//section[4]/ol/li[11]/h4");
	By headerShipReturn12 = By.xpath("//section[4]/ol/li[12]/h4");
	By headerShipReturn13 = By.xpath("//section[4]/ol/li[13]/h4");
	By headerShipReturn14 = By.xpath("//section[4]/ol/li[14]/h4");
	By headerShipReturn15 = By.xpath("//section[4]/ol/li[15]/h4");
	
	//Case 9 Shipping & Return Sub Menu Links data instant members
	By headerShipReturnLink1 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[3]");
	By headerShipReturnLink2 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[4]");
	By headerShipReturnLink3 = By.xpath("(//a[contains(@href, '/locations')])[10]");
	By headerShipReturnLink4 = By.xpath("(//a[contains(@href, '/locations')])[11]");		
	By headerShipReturnLink5 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[5]");
	By headerShipReturnLink6 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[6]");
	By headerShipReturnLink7 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[7]");
		
	//Case 10 Styling Fee FAQ Menu Options data instant members
	By headerStylingFee = By.xpath("//header[@id='homefee']/h3");
	By headerStylingFee1 = By.xpath("//section[5]/ol/li/h4");
	By headerStylingFee2 = By.xpath("//section[5]/ol/li[2]/h4");
	By headerStylingFee3 = By.xpath("//section[5]/ol/li[3]/h4");
	By headerStylingFee4 = By.xpath("//section[5]/ol/li[4]/h4");

	//Case 11 Styling Fee Sub Menu Links data instant members
	By headerStylingFeeLink1 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[8]");
	
	//Case 12 Our Stylist FAQ Menu Options data instant members
	By headerOurStylist = By.xpath("//header[@id='stylists']/h3");
	By headerOurStylist1 = By.xpath("//section[6]/ol/li/h4");
	By headerOurStylist2 = By.xpath("//section[6]/ol/li[2]/h4");
	By headerOurStylist3 = By.xpath("//section[6]/ol/li[3]/h4");
	By headerOurStylist4 = By.xpath("//section[6]/ol/li[4]/h4");
	
	//Case 13 Styling Fee Sub Menu Links data instant members
	By headerOurStylistLink1 = By.linkText("Clubhouse");
	By headerOurStylistLink2 = By.linkText("messenger app");
	By headerOurStylistLink3 = By.linkText("Careers page");
	By headerOurStylistLink4 = By.xpath("(//a[contains(@href, '/mens/brands')])[2]");
	By headerOurStylistLink5 = By.xpath("(//a[contains(@href, '/womens/brands')])[2]");
	By headerOurStylistLink6 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[9]");
 
	//Case 14 Custom FAQ Menu Options data instant members
	By headerCustom = By.xpath("//header[@id='custom']/h3");
	By headerCustom1 = By.xpath("//section[7]/ol/li/h4");
	By headerCustom2 = By.xpath("//section[7]/ol/li[2]/h4");
	By headerCustom3 = By.xpath("//section[7]/ol/li[3]/h4");
	By headerCustom4 = By.xpath("//section[7]/ol/li[4]/h4");
	By headerCustom5 = By.xpath("//section[7]/ol/li[5]/h4");
	By headerCustom6 = By.xpath("//section[7]/ol/li[6]/h4");
	By headerCustom7 = By.xpath("//section[7]/ol/li[7]/h4");
	By headerCustom8 = By.xpath("//section[7]/ol/li[8]/h4");
	By headerCustom9 = By.xpath("//section[7]/ol/li[9]/h4");
	By headerCustom10 = By.xpath("//section[7]/ol/li[10]/h4");
	By headerCustom11 = By.xpath("//section[7]/ol/li[11]/h4");
	By headerCustom12 = By.xpath("//section[7]/ol/li[12]/h4");
	By headerCustom13 = By.xpath("//section[7]/ol/li[13]/h4");
	
	//Case 15 Custom Sub Menu Links data instant members
	By headerCustomLink1 = By.xpath("(//a[contains(@href, '/custom')])[5]");
	By headerCustomLink2 = By.xpath("(//a[contains(@href, '/custom')])[6]");
	By headerCustomLink3 = By.xpath("(//a[contains(@href, '/messenger')])[3]");
	By headerCustomLink4 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[10]");
		
	//Case 16 Trunks FAQ Menu Options data instant members
	By headerTrunks = By.xpath("//header[@id='trunks']/h3");
	By headerTrunks1 = By.xpath("//section[8]/ol/li/h4");
	By headerTrunks2 = By.xpath("//section[8]/ol/li[2]/h4");
	By headerTrunks3 = By.xpath("//section[8]/ol/li[3]/h4");
	By headerTrunks4 = By.xpath("//section[8]/ol/li[4]/h4");
		
	//Case 17 Trunks Sub Menu Links data instant members
	By headerTrunksLink1 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[11]");
	By headerTrunksLink2 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[12]");
	By headerTrunksLink3 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[13]");
	
	//Case 18 Alterations FAQ Menu Options data instant members
	By headerAlterations = By.xpath("//header[@id='alterations']/h3");
	By headerAlterations1 = By.xpath("//section[9]/ol/li/h4");
	By headerAlterations2 = By.xpath("//section[9]/ol/li[2]/h4");
	By headerAlterations3 = By.xpath("//section[9]/ol/li[3]/h4");
	By headerAlterations4 = By.xpath("//section[9]/ol/li[4]/h4");
	By headerAlterations5 = By.xpath("//section[9]/ol/li[5]/h4");
	By headerAlterations6 = By.xpath("//section[9]/ol/li[6]/h4");
	By headerAlterations7 = By.xpath("//section[9]/ol/li[7]/h4");
	By headerAlterations8 = By.xpath("//section[9]/ol/li[8]/h4");
	By headerAlterations9 = By.xpath("//section[9]/ol/li[9]/h4");
		
	//Case 19 Alterations Sub Menu Links data instant members
	By headerAlterationsLink1 = By.linkText("alterations page");
	By headerAlterationsLink2 = By.linkText("price list");
		
	//Case 20 Locations FAQ Menu Options data instant members
	By headerLocations = By.xpath("//header[@id='locations']/h3");
	By headerLocations1 = By.xpath("//section[10]/ol/li/h4");
	By headerLocations2 = By.xpath("//section[10]/ol/li[2]/h4");
	By headerLocations3 = By.xpath("//section[10]/ol/li[3]/h4");
	By headerLocations4 = By.xpath("//section[10]/ol/li[4]/h4");
	
	//Case 21 Locations Sub Menu Links data instant members
	By headerLocationsLink1 = By.xpath("(//a[contains(@href, '/locations')])[13]");
	By headerLocationsLink2 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[14]");
	By headerLocationsLink3 = By.xpath("(//a[contains(@href, '/locations')])[14]");
	By headerLocationsLink4 = By.xpath("(//a[contains(@href, '/locations')])[15]");
	
	//Case 22 Gifting FAQ Menu Options data instant members
	By headerGifting = By.xpath("//header[@id='gifting']/h3");
	By headerGifting1 = By.xpath("//section[11]/ol/li/h4");
	By headerGifting2 = By.xpath("//section[11]/ol/li[2]/h4");
	By headerGifting3 = By.xpath("//section[11]/ol/li[3]/h4");
	By headerGifting4 = By.xpath("//section[11]/ol/li[4]/h4");
	
	//Case 23 Gifting Sub Menu Links data instant members
	By headerGiftingLink1 = By.xpath("(//a[contains(@href, 'mailto:service@trunkclub.com')])[15]");
	By headerGiftingLink2 = By.xpath("//a[contains(@href, '/gifts')]");
	By headerGiftingLink3 = By.xpath("(//a[contains(@href, '/gifts')])[2]");
	By headerGiftingLink4 = By.linkText("trunkclub.com/redeem");
	
	//Case 24 Footer Menu Links data instant members
	By footerWomenPage = By.xpath("(//a[contains(text(),'Women')])[2]");
	By footerMenPage = By.xpath("(//a[contains(text(),'Men')])[2]");
	By footerCustomPage = By.xpath("(//a[contains(text(),'Custom')])[2]");
	By footerBusinessPage = By.linkText("For Business");
	By footerLocationsPage = By.xpath("(//a[contains(text(),'Locations')])[2]");
	By footerGiftCardPage = By.xpath("(//a[contains(text(),'Gift Cards')])[2]");
	By footerAboutUsPage = By.xpath("(//a[contains(text(),'About Us')])[2]");
	By footerCareerPage = By.xpath("(//a[contains(text(),'Careers')])[3]");
	By footerPressPage = By.xpath("(//a[contains(text(),'Press')])[2]");
	By footerContactPage = By.linkText("Contact");
	By footerLogoPage = By.cssSelector("svg.social-logo");
	By footerFaceBookPage = By.cssSelector("a[title=&quot;Visit Our Facebook&quot;] &gt; svg.social-logo &gt; path");
	By footerTwitterPage = By.cssSelector("a[title=&quot;Visit Our Twitter&quot;] &gt; svg.social-logo &gt; path");
	By footerPinterestPage = By.cssSelector("a[title=&quot;Visit Our Pinterest&quot;] &gt; svg.social-logo &gt; path");
	
	/* Constructor */
	public FAQPage (WebDriver wd) {
		
		this.testDriver = wd;
	}
		
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getFAQPage() {
		return testDriver.findElement(openFAQPage);
		
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getHomePage() {
		return testDriver.findElement(homePage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getWomenPage() {
		return testDriver.findElement(womenPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getMenPage() {
		return testDriver.findElement(menPage);
		
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getSignInPage() {
		return testDriver.findElement(signInPage);
		
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getGetStartedPage() {
		return testDriver.findElement(getStartedPage);
		
	}
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getLinkFAQPage() {
		return testDriver.findElement(linkFAQPage);
		
	}
	
	//refresh Elements to support when navigating to other webpages.
	public void refreshElements() {
		List<WebElement> tempList = testDriver.findElements(anchorTagname);		
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterWomenPage() {
		return testDriver.findElement(footerWomenPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterMenPage() {
		return testDriver.findElement(footerMenPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterCustomPage() {
		return testDriver.findElement(footerCustomPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterBusinessPage() {
		return testDriver.findElement(footerBusinessPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterLocationsPage() {
		return testDriver.findElement(footerLocationsPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterGiftCardPage() {
		return testDriver.findElement(footerGiftCardPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterAboutUsPage() {
		return testDriver.findElement(footerAboutUsPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterCareerPage() {
		return testDriver.findElement(footerCareerPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterPressPage() {
		return testDriver.findElement(footerPressPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterContactPage() {
		return testDriver.findElement(footerContactPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterLogoPage() {
		return testDriver.findElement(footerLogoPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterFaceBookPage() {
		return testDriver.findElement(footerFaceBookPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterTwitterPage() {
		return testDriver.findElement(footerTwitterPage);
	}
	
	//Get method for retrieving WebElement with corresponding data instant member
	public WebElement getfooterPinterestPage() {
		return testDriver.findElement(footerPinterestPage);
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderGeneralX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerGeneral));
		tmp.add(testDriver.findElement(headerGeneral1));
		tmp.add(testDriver.findElement(headerGeneral2));
		tmp.add(testDriver.findElement(headerGeneral3));
		tmp.add(testDriver.findElement(headerGeneral4));
		tmp.add(testDriver.findElement(headerGeneral5));
		tmp.add(testDriver.findElement(headerGeneral6));
		tmp.add(testDriver.findElement(headerGeneral7));
		tmp.add(testDriver.findElement(headerGeneral8));
		tmp.add(testDriver.findElement(headerGeneral9));
		tmp.add(testDriver.findElement(headerGeneral10));
		
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderGeneralLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerGeneralLink1));
		tmp.add(testDriver.findElement(headerGeneral1));
		tmp.add(testDriver.findElement(headerGeneralLink2));
		tmp.add(testDriver.findElement(headerGeneral1));
		tmp.add(testDriver.findElement(headerGeneralLink3));
		tmp.add(testDriver.findElement(headerGeneral1));
		tmp.add(testDriver.findElement(headerGeneralLink4));
		tmp.add(testDriver.findElement(headerGeneral1));
		tmp.add(testDriver.findElement(headerGeneralLink5));
		tmp.add(testDriver.findElement(headerGeneral1));
		tmp.add(testDriver.findElement(headerGeneralLink6));
		tmp.add(testDriver.findElement(headerGeneral1));
		tmp.add(testDriver.findElement(headerGeneralLink7));
		tmp.add(testDriver.findElement(headerGeneral1));
		tmp.add(testDriver.findElement(headerGeneralLink8));
		tmp.add(testDriver.findElement(headerGeneral1));
		tmp.add(testDriver.findElement(headerGeneralLink9));
		tmp.add(testDriver.findElement(headerGeneralLink10));
		tmp.add(testDriver.findElement(headerGeneralLink11));
		tmp.add(testDriver.findElement(headerGeneralLink12));
		tmp.add(testDriver.findElement(headerGeneral6));
		tmp.add(testDriver.findElement(headerGeneralLink13));
		tmp.add(testDriver.findElement(headerGeneral6));
		tmp.add(testDriver.findElement(headerGeneralLink14));
		tmp.add(testDriver.findElement(headerGeneralLink15));
		tmp.add(testDriver.findElement(headerGeneralLink16));
		tmp.add(testDriver.findElement(headerGeneralLink17));
		tmp.add(testDriver.findElement(headerGeneral10));
		tmp.add(testDriver.findElement(headerGeneralLink18));
		
		return tmp;
			
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List<WebElement> resetHeaderGeneralLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
				
		tmp.add(testDriver.findElement(headerGeneral8));
		tmp.add(testDriver.findElement(headerGeneral3));
		tmp.add(testDriver.findElement(headerGeneral2));
		tmp.add(testDriver.findElement(headerGeneral));
		
		return tmp;
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderPricingX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerPricing));
		tmp.add(testDriver.findElement(headerPricing1));
		tmp.add(testDriver.findElement(headerPricing2));
		tmp.add(testDriver.findElement(headerPricing3));
		tmp.add(testDriver.findElement(headerPricing4));
		tmp.add(testDriver.findElement(headerPricing5));
		tmp.add(testDriver.findElement(headerPricing6));
		tmp.add(testDriver.findElement(headerPricing7));
		tmp.add(testDriver.findElement(headerPricing8));
			
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderPricingLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerPricing));
		tmp.add(testDriver.findElement(headerPricing1));
		tmp.add(testDriver.findElement(headerPricing8));
		tmp.add(testDriver.findElement(headerPricingLink1));
		tmp.add(testDriver.findElement(headerPricingLink2));
		tmp.add(testDriver.findElement(headerPricing));
			
		return tmp;
			
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderClothingX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerClothing));
		tmp.add(testDriver.findElement(headerClothing1));
		tmp.add(testDriver.findElement(headerClothing2));
		tmp.add(testDriver.findElement(headerClothing3));
		tmp.add(testDriver.findElement(headerClothing4));
		tmp.add(testDriver.findElement(headerClothing5));
		tmp.add(testDriver.findElement(headerClothing6));
					
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderClothingLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerClothing));
		tmp.add(testDriver.findElement(headerClothing1));
		tmp.add(testDriver.findElement(headerClothing3));
		tmp.add(testDriver.findElement(headerClothing4));
		tmp.add(testDriver.findElement(headerClothing6));
		
		tmp.add(testDriver.findElement(headerClothingLink1));
		tmp.add(testDriver.findElement(headerClothing1));
		tmp.add(testDriver.findElement(headerClothingLink2));
		tmp.add(testDriver.findElement(headerClothingLink3));
		tmp.add(testDriver.findElement(headerClothingLink5));
		tmp.add(testDriver.findElement(headerClothingLink6));
		tmp.add(testDriver.findElement(headerClothing));
			
		return tmp;
			
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderShipReturnX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerShipReturn));
		tmp.add(testDriver.findElement(headerShipReturn1));
		tmp.add(testDriver.findElement(headerShipReturn2));
		tmp.add(testDriver.findElement(headerShipReturn3));
		tmp.add(testDriver.findElement(headerShipReturn4));
		tmp.add(testDriver.findElement(headerShipReturn5));
		tmp.add(testDriver.findElement(headerShipReturn6));
		tmp.add(testDriver.findElement(headerShipReturn7));
		tmp.add(testDriver.findElement(headerShipReturn8));
		tmp.add(testDriver.findElement(headerShipReturn9));
		tmp.add(testDriver.findElement(headerShipReturn10));
		tmp.add(testDriver.findElement(headerShipReturn11));
		tmp.add(testDriver.findElement(headerShipReturn12));
		tmp.add(testDriver.findElement(headerShipReturn13));
		tmp.add(testDriver.findElement(headerShipReturn14));
		tmp.add(testDriver.findElement(headerShipReturn15));
		
		
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderShipReturnLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerShipReturn));
		tmp.add(testDriver.findElement(headerShipReturn3));
		tmp.add(testDriver.findElement(headerShipReturn5));
		tmp.add(testDriver.findElement(headerShipReturn10));
		tmp.add(testDriver.findElement(headerShipReturn11));
		tmp.add(testDriver.findElement(headerShipReturn13));
		tmp.add(testDriver.findElement(headerShipReturn14));
		tmp.add(testDriver.findElement(headerShipReturn15));
		
		tmp.add(testDriver.findElement(headerShipReturnLink1));
		tmp.add(testDriver.findElement(headerShipReturnLink2));
		tmp.add(testDriver.findElement(headerShipReturnLink3));
		tmp.add(testDriver.findElement(headerShipReturnLink4));
		tmp.add(testDriver.findElement(headerShipReturnLink5));
		tmp.add(testDriver.findElement(headerShipReturnLink6));
		tmp.add(testDriver.findElement(headerShipReturnLink7));
		tmp.add(testDriver.findElement(headerShipReturn));
			
		return tmp;
			
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderStylingFeeX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerStylingFee));
		tmp.add(testDriver.findElement(headerStylingFee1));
		tmp.add(testDriver.findElement(headerStylingFee2));
		tmp.add(testDriver.findElement(headerStylingFee3));
		tmp.add(testDriver.findElement(headerStylingFee4));
				
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderStylingFeeLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerStylingFee));
		tmp.add(testDriver.findElement(headerStylingFee3));
		
		tmp.add(testDriver.findElement(headerStylingFeeLink1));
		tmp.add(testDriver.findElement(headerStylingFee));
			
		return tmp;
			
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderOurStylistX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerOurStylist));
		tmp.add(testDriver.findElement(headerOurStylist1));
		tmp.add(testDriver.findElement(headerOurStylist2));
		tmp.add(testDriver.findElement(headerOurStylist3));
		tmp.add(testDriver.findElement(headerOurStylist4));
				
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderOurStylistLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerOurStylist));
		tmp.add(testDriver.findElement(headerOurStylist1));
		tmp.add(testDriver.findElement(headerOurStylist2));
		tmp.add(testDriver.findElement(headerOurStylist4));
		
		tmp.add(testDriver.findElement(headerOurStylistLink1));
		tmp.add(testDriver.findElement(headerOurStylist1));
		tmp.add(testDriver.findElement(headerOurStylistLink2));
		tmp.add(testDriver.findElement(headerOurStylist1));
		tmp.add(testDriver.findElement(headerOurStylistLink3));
		
		tmp.add(testDriver.findElement(headerOurStylistLink4));
		tmp.add(testDriver.findElement(headerOurStylist2));
		tmp.add(testDriver.findElement(headerOurStylistLink5));
		tmp.add(testDriver.findElement(headerOurStylistLink6));
		
		tmp.add(testDriver.findElement(headerOurStylist));
			
		return tmp;
			
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderCustomX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerCustom));
		tmp.add(testDriver.findElement(headerCustom1));
		tmp.add(testDriver.findElement(headerCustom2));
		tmp.add(testDriver.findElement(headerCustom3));
		tmp.add(testDriver.findElement(headerCustom4));
		tmp.add(testDriver.findElement(headerCustom5));
		tmp.add(testDriver.findElement(headerCustom6));
		tmp.add(testDriver.findElement(headerCustom7));
		tmp.add(testDriver.findElement(headerCustom8));
		tmp.add(testDriver.findElement(headerCustom9));
		tmp.add(testDriver.findElement(headerCustom10));
		tmp.add(testDriver.findElement(headerCustom11));
		tmp.add(testDriver.findElement(headerCustom12));
		tmp.add(testDriver.findElement(headerCustom13));
			
		
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderCustomLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerCustom));
		tmp.add(testDriver.findElement(headerCustom1));
		tmp.add(testDriver.findElement(headerCustom3));
		tmp.add(testDriver.findElement(headerCustom10));
		
		tmp.add(testDriver.findElement(headerCustomLink1));
		tmp.add(testDriver.findElement(headerCustomLink2));
		tmp.add(testDriver.findElement(headerCustomLink3));
		tmp.add(testDriver.findElement(headerCustom10));
		tmp.add(testDriver.findElement(headerCustomLink4));
		tmp.add(testDriver.findElement(headerCustom));	
			
		return tmp;
			
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderTrunksX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerTrunks));
		tmp.add(testDriver.findElement(headerTrunks1));
		tmp.add(testDriver.findElement(headerTrunks2));
		tmp.add(testDriver.findElement(headerTrunks3));
		tmp.add(testDriver.findElement(headerTrunks4));
				
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderTrunksLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerTrunks));
		tmp.add(testDriver.findElement(headerTrunks3));
		tmp.add(testDriver.findElement(headerTrunks4));
		
		tmp.add(testDriver.findElement(headerTrunksLink1));
		tmp.add(testDriver.findElement(headerTrunks3));
		tmp.add(testDriver.findElement(headerTrunksLink2));
		tmp.add(testDriver.findElement(headerTrunksLink3));
		tmp.add(testDriver.findElement(headerTrunks));	
			
		return tmp;
			
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderAlterationsX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerAlterations));
		tmp.add(testDriver.findElement(headerAlterations1));
		tmp.add(testDriver.findElement(headerAlterations2));
		tmp.add(testDriver.findElement(headerAlterations3));
		tmp.add(testDriver.findElement(headerAlterations4));
		tmp.add(testDriver.findElement(headerAlterations5));
		tmp.add(testDriver.findElement(headerAlterations6));
		tmp.add(testDriver.findElement(headerAlterations7));
		tmp.add(testDriver.findElement(headerAlterations8));
		tmp.add(testDriver.findElement(headerAlterations9));
				
				
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderAlterationsLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerAlterations));
		tmp.add(testDriver.findElement(headerAlterations1));
		tmp.add(testDriver.findElement(headerAlterations2));
		
		tmp.add(testDriver.findElement(headerAlterationsLink1));
		tmp.add(testDriver.findElement(headerAlterationsLink2));
		tmp.add(testDriver.findElement(headerAlterations));	
			
		return tmp;
			
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderLocationsX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerLocations));
		tmp.add(testDriver.findElement(headerLocations1));
		tmp.add(testDriver.findElement(headerLocations2));
		tmp.add(testDriver.findElement(headerLocations3));
		tmp.add(testDriver.findElement(headerLocations4));
								
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderLocationsLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerLocations));
		tmp.add(testDriver.findElement(headerLocations1));
		tmp.add(testDriver.findElement(headerLocations3));
		tmp.add(testDriver.findElement(headerLocations4));
		
		tmp.add(testDriver.findElement(headerLocationsLink1));
		tmp.add(testDriver.findElement(headerLocationsLink2));
		tmp.add(testDriver.findElement(headerLocations3));
		tmp.add(testDriver.findElement(headerLocationsLink3));
		tmp.add(testDriver.findElement(headerLocationsLink4));
		tmp.add(testDriver.findElement(headerLocations));	
			
		return tmp;
			
	}
	
	//method is setup for testing of expanding/collapsing WebElements
	//test cases
	public List <WebElement> getHeaderGiftingX() {
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerGifting));
		tmp.add(testDriver.findElement(headerGifting1));
		tmp.add(testDriver.findElement(headerGifting2));
		tmp.add(testDriver.findElement(headerGifting3));
		tmp.add(testDriver.findElement(headerGifting4));
								
		return tmp;
	}
	/*
	 * Method for setting up for test cases that test the 
	 * nested web links embedded in a specific FAQ Menu options
	 * when expanded. 
	 */
	public List <WebElement> getHeaderGiftingLinkX(){
		List<WebElement> tmp = new ArrayList<WebElement>();
		
		tmp.add(testDriver.findElement(headerGifting));
		tmp.add(testDriver.findElement(headerGifting1));
		tmp.add(testDriver.findElement(headerGifting2));
		tmp.add(testDriver.findElement(headerGifting3));
		tmp.add(testDriver.findElement(headerGifting4));
		
		tmp.add(testDriver.findElement(headerGiftingLink1));
		tmp.add(testDriver.findElement(headerGiftingLink2));
		tmp.add(testDriver.findElement(headerGiftingLink3));
		tmp.add(testDriver.findElement(headerGiftingLink4));
		tmp.add(testDriver.findElement(headerGifting));	
			
		return tmp;
			
	}
	

}
