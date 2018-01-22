# Project-TrunkClub-Automation-Testing-with-Selenium-WebDriver

Purpose: 
To create automation testing for TrunkClub FAQ website. Used Page Object Model pattern design.Tested 
navigation, links, and operation of the FAQ TrunkClub website.

Created a page object named: FAQPage.java 
Location in package: common.pageobjects 

Used Selenium IDE to create 24 Test cases that were saved into a Excel spreadsheet named: 
TestCasesTrunkClub.xls.

Each of the 24 test cases are written in Java and correspond to the same test case name on the Excel
spreadsheet TestCasesTrunkClub.xls. The 24 test cases are located in package named: common.tests

Used TestNG to invoke the test suite and execute the test cases. File name: TestNGFile2.xml 
Location in package named: common.TestNGFiles

Created a DriverSetupFF class that initializes the driver to be inherited by all the 24 test cases.
Location in package named: common.tests 
