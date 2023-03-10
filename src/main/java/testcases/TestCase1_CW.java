package testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProfilePage;
import wrappers.ProjectSpecificWrappers;


public class TestCase1_CW extends ProjectSpecificWrappers {
	
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Book search for Git Pocket Guide";
		browserName="chrome";
		dataSheetName="TC001";
		category="Sanity";
		authors="Mithra";
	}
	

	@Test(dataProvider="fetchData")
	public void testCase1(String searchText) throws InterruptedException {
		new LoginPage(driver, test)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickBookStore()
		.enterSearchText(searchText)
		.clickSearchResult(searchText)
		.getTitle()
		.clickLogOut();	
		//first change
	}
	
	
}

