package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 {

	WebDriver driver;

	public POM2(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class=\"login-form\"]//child::h2[1]")
	WebElement loginAccountVisible;
	@FindBy(xpath = "//div[@class=\"login-form\"]//child::form[1]//child::input[2]")
	WebElement loginEmail;
	@FindBy(xpath = "//div[@class=\"login-form\"]//child::form[1]//child::input[3]")
	WebElement loginPass;
	@FindBy(xpath = "//button[text()=\"Login\"]")
	WebElement loginbtn;
	

	public void loginvisible() {
		boolean loginAccount = loginAccountVisible.isDisplayed();
		System.out.println("Login to your account is visible: " + loginAccount);
	}

	public void loginEmailid() {
		loginEmail.sendKeys("ramk1v2@gmail.com");
	}

	public void loginpassword() {
		loginPass.sendKeys("QA@123");
	}

	public void loginButton() {
		loginbtn.click();
	}

}
