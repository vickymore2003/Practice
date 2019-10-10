package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import actions.BaseClass;
import actions.Inbox;
import actions.LoginClass;
import locators.SignInPage;

public class testGmail extends BaseClass {
	@Test
	public void gmail() throws InterruptedException {
		LoginClass signIn = new LoginClass();
		signIn.login();
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Inbox in = new Inbox();
		in.co();

		/*
		 * String inboxcolor =
		 * driver.findElement(By.xpath("//div[@data-tooltip='Inbox']"))
		 * .getCssValue("background-color"); System.out.println(inboxcolor);
		 * 
		 */ }
}
