package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;

	@BeforeMethod
	public void StartUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
	}

	@AfterMethod
	public void tearDown() {
	}

	/*
	 * @Test public void test() { WebElement email =
	 * driver.findElement(By.id("identifierId")); email.sendKeys("gmail"); }
	 */
}
