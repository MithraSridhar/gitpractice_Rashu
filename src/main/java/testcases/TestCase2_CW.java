package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.BookResultPage;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class TestCase2_CW extends ProjectSpecificWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName="TestCase2";
		testDescription="Book search for Learning JavaScript Design Patterns";
		browserName="chrome";
		dataSheetName="TC002";
		category="Sanity";
		authors="Mithra";
	}
	
	@Test(dataProvider="fetchData")	
	public void testCase2(String searchText) throws InterruptedException {
		new LoginPage(driver, test)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickBookStore()
		.enterSearchText(searchText)
		.clickSearchResult(searchText)
		.getTitle()
		.clickLogOut();		
	}

}
