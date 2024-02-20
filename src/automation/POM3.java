package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {
	
	WebDriver driver;

	public POM3(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class=\"login-form\"]//child::form[1]//child::input[2]")
	WebElement emailLogin;
	@FindBy(xpath="//div[@class=\"login-form\"]//child::form[1]//child::input[3]")
	WebElement passLogin;
	@FindBy(xpath="//div[@class=\"login-form\"]//child::form[1]//child::p[1]")
	WebElement msgVerify;
	
	public void invalidEmail() {
		emailLogin.sendKeys("r132@gmail.com");
	}
	
	public void invalidPass() {
		passLogin.sendKeys("QA3");
	}
	
	public void msgVerifyLogin() {
	boolean errorMessage = msgVerify.isDisplayed();
	System.out.println("Your email or password is incorrect! is visible: " + errorMessage);
	}

}
