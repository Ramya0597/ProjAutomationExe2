package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM5 {
	
	WebDriver driver;

	public POM5(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()=\"Email Address already exist!\"]")
	WebElement ExistingEmailMsg;
	
	public void emailExisting() {
		boolean errorMsg = ExistingEmailMsg.isDisplayed();
		System.out.println("Email Address already exist!: " + errorMsg);
	}

}
