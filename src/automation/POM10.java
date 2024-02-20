package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM10 {
	
	WebDriver driver;

	public POM10(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()=\"Subscription\"]")
	WebElement subscription;
	@FindBy(id = "susbscribe_email")
	WebElement subscriptionEmail;
	@FindBy(xpath = "//button[@id=\"subscribe\"]")
	WebElement subscriptionArrowBtn;
	@FindBy(id = "success-subscribe")
	WebElement subscriptionSuccessMsg;
	
	public void subscriptionVerify() {
		String actText = subscription.getText();
		System.out.println(actText);
		String expText = "SUBSCRIPTION";
		Assert.assertEquals(expText, actText);
	}

	public void subscriptionTextbox() {
		subscriptionEmail.sendKeys("ram8231@gmail.com");
		subscriptionArrowBtn.click();
	}

	public void subscriptionSuccess() {
		boolean subSuccessMsg = subscriptionSuccessMsg.isDisplayed();
		System.out.println("'You have been successfully subscribed!' is visible: " + subSuccessMsg);
	}
	
}
