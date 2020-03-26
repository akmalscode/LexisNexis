
package com.LexisNexis;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LexisNexis.Base.Base;
import com.LexisNexis.Pages.GooglePage;

public class GooglePageTest extends Base {

	GooglePage googlePage;

	// constructor
	public GooglePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		BrowserInit();
		googlePage = new GooglePage();
	}

//	@Test
//	void getTitleTest() {
//		String title = googlePage.validateHomePageTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "LexisNexis&reg; for Law Schools - Sign In | LexisNexis");
//
//	}

	@Test
	public void getTitle() {
		GooglePage.validateHomePageTitle();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
