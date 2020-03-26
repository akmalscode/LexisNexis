package com.LexisNexis.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LexisNexis.Base.Base;


public class GooglePage extends Base{
	
	//Page Factory Object Repo
	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
	public WebElement googleSearchField;
	
	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")
	public WebElement btnGoogleSearch;
	
	@FindBy(xpath = "//*[@id=\"prm\"]/div/a")
	public WebElement btnCOVIDGoogleSearch;
	
	@FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/table/tbody/tr[2]/td[2]/div/span/h3/a")
	public static WebElement thirdLinkTitlElement ;
	
	
	//Initialization PageObject
	public GooglePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchKeyword() {
		
		googleSearchField.sendKeys("lexisnexis");
		btnGoogleSearch.click();
		
		
	}
	public static String validateHomePageTitle() {
		thirdLinkTitlElement.click();
		return driver.getTitle();
	}
	
	
	
	

}
