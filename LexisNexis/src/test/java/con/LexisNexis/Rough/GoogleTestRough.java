package con.LexisNexis.Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class GoogleTestRough {

	public static void main(String[] args) {

		// System.getProperty("webdriver.chrome.driver",);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/java/executable/chromedriver");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.google.com/";
		driver.get(url);
		
		driver.findElement(By.name("q")).sendKeys("lexisnexis");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/table/tbody/tr[2]/td[2]/div/span/h3/a")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "LexisNexis® for Law Schools - Sign In | LexisNexis");
		System.out.println(title);
		
		driver.quit();


	}

}
