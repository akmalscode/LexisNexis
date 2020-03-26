package com.LexisNexis;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LexisNexis.Base.Base;
import com.LexisNexis.Pages.GooglePage;

public class T001_Title extends Base {

	GooglePage googlePage;

	// constructor
	public T001_Title() {
		super();
	}

	@BeforeMethod
	public void setup() {
		BrowserInit();
		googlePage = new GooglePage();
	}

	@Test
	void getTitleTest() {
		String title = googlePage.validateHomePageTitle();
		Assert.assertEquals(title, "LexisNexis&reg; for Law Schools - Sign In | LexisNexis");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
