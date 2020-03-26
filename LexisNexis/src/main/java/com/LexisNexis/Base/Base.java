package com.LexisNexis.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import com.LexisNexis.Utility.TestUtil;

public class Base {

	public static WebDriver driver;
	public static Properties properties;
	
	public Base() {
		try {
			properties = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "/src/main/java/com/LexisNexis/Config/config.properties");
			properties.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void BrowserInit() {
		String browserName = properties.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+ "/src/main/java/Resources/chromedriver"));
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",(System.getProperty("user.dir")+ "/src/main/java/Resources/geckodriver"));
			driver = new FirefoxDriver();
		} 
			
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(properties.getProperty("url"));
	}

}
