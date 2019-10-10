package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	private WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	public WebElement email;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement next;
	@FindBy(xpath = "//class[@class='ZFr60d CeoRYc']")
	public WebElement next1;
//@FindBy(xpath = "//div[@id=':3u']")
	@FindBy(xpath="//div[@data-tooltip='Inbox']")
	public WebElement inbox;

}
