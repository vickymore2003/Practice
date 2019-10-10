package actions;

import java.util.concurrent.TimeUnit;
import locators.SignInPage;

public class LoginClass extends BaseClass {
	SignInPage sign = new SignInPage(driver);

	public void login() {
		/*
		 * sign.email.click(); driver.manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS); System.out.println(sign.email.getText());
		 * sign.email.sendKeys("tt367928");
		 * System.out.println(sign.email.getAttribute("data-initial-value"));
		 * sign.next.click(); driver.manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS);
		 * 
		 * sign.password.click(); sign.password.sendKeys("Welcome1$");
		 * sign.next.click();
		 */
		sign.email.sendKeys("tt367928");
		sign.next.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sign.password.sendKeys("Welcome1$");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		sign.next.click();

	}
}