package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM21 {
	
	WebDriver driver;

	public POM21(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Write Your Review\"]")
	WebElement writeYourReview;
	@FindBy(xpath  = "//input[@id=\"name\"]")
	WebElement nameReview;
	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement emailReview;
	@FindBy(xpath = "//textarea[@id=\"review\"]")
	WebElement reviewTextBoxReview;
	@FindBy(xpath = "//button[@id=\"button-review\"]")
	WebElement submitReview;
	@FindBy(xpath = "//span[text()=\"Thank you for your review.\"]")
	WebElement successReviewMsg;
	
	public void writeYourReviewVisible() {
		boolean reviewVisible=writeYourReview.isDisplayed();
		System.out.println("'Write Your Review' is visible: "+reviewVisible);
	}
	
	public void reviewName() {
		nameReview.sendKeys("Ram");
	}
	
	public void reviewEmail() {
		emailReview.sendKeys("ram@gmail.com");
	}
	
	public void reviewTextBox() {
		reviewTextBoxReview.sendKeys("Review done");
	}
	
	public void reviewSubmit() {
		submitReview.click();
	}
	
	public void successMessage() {
		boolean messageConfirm=successReviewMsg.isDisplayed();
		System.out.println("success message 'Thank you for your review' displayed: "+messageConfirm);
	}
	

}
