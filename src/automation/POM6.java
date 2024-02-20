package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM6 {
	
	WebDriver driver;

	public POM6(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\" Contact us\"]")
	WebElement contactus;
	@FindBy(xpath = "//div[@class=\"contact-form\"]//child::h2[1]")
	WebElement getinTouchVisible;
	@FindBy(name = "name")
	WebElement getinTouchName;
	@FindBy(name = "email")
	WebElement getinTouchEmail;
	@FindBy(name = "subject")
	WebElement getinTouchSub;
	@FindBy(id = "message")
	WebElement getinTouchMsg;
	@FindBy(name = "upload_file")
	WebElement getinTouchUpload;
	@FindBy(xpath = "//input[@name=\"submit\"]")
	WebElement getinTouchSubmitbtn;
	@FindBy(xpath = "//div[@class= \"status alert alert-success\"]")
	WebElement getinTouchSuccessAlert;
	@FindBy(xpath = "//span[text()=\" Home\"]")
	WebElement getinTouchHomeBtn;
	@FindBy(xpath = "//div[@class=\"logo pull-left\"]//child::a[1]//child::img[1]")
	WebElement logo;
	
	
	public void contactus() {
		contactus.click();
	}
	
	public void getTouchVisible() {
		boolean getTouch = getinTouchVisible.isDisplayed();
		System.out.println("'GET IN TOUCH' is visible: " + getTouch);
	}

	public void getinTouchName() {
		getinTouchName.sendKeys("Ram");
	}
	
	public void getinTouchEmail() {
		getinTouchEmail.sendKeys("ram832@gmail.com");
	}

	public void getinTouchSubject() {
		getinTouchSub.sendKeys("get in touch");
	}

	public void getinTouchMessage() {
		getinTouchMsg.sendKeys("Improve the application");
	}

	public void getinTouchUploadFile() {
		getinTouchUpload.sendKeys("C:\\Users\\user\\OneDrive\\Desktop\\Details1.xls");
	}

	public void getinTouchSubmit() {
		getinTouchSubmitbtn.click();
	}
	
	public void getinTouchSuccessfullMsg() {
		boolean successMsg = getinTouchSuccessAlert.isDisplayed();
		System.out.println("Success! Your details have been submitted successfully.' is visible: " + successMsg);
	}

	public void getinTouchHomeButton() {
		getinTouchHomeBtn.click();
	}
	
	public void homePageVisible() {
		boolean homePage = logo.isDisplayed();
		System.out.println("landed to home page successfully: " + homePage);
	}

}
