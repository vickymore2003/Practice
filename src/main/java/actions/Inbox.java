package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import locators.SignInPage;

public class Inbox extends BaseClass {
	SignInPage sign = new SignInPage(driver);

	public void co() throws InterruptedException {

		WebElement in = sign.inbox;
		
		String color = in.getCssValue("background-color");
		System.out.println(color);

	}
}
