package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM4 {
	
	WebDriver driver;

	public POM4(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLoginPage() {
	String loginpage= driver.getTitle();
	System.out.println("User is navigated to: "+loginpage);
	}

}
