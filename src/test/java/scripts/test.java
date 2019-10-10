package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import actions.BaseClass;
import locators.SignInPage;

public class test extends BaseClass {
	SignInPage sign = new SignInPage(driver);

	@Test
	public void f() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		sign.email.sendKeys("tt367928");
		sign.next.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sign.password.sendKeys("Welcome1$");
		sign.next.click();

	}
}
