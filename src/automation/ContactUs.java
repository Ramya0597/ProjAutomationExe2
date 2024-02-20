package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs {

	@Test
	public void contactusPage() throws Exception {
		WebDriver driver = new ChromeDriver();
		POM tc6 = new POM(driver);
		POM6 tc=new POM6(driver);
		tc6.launchApp();
		tc.contactus();
		tc.getTouchVisible();
		tc.getinTouchName();
		tc.getinTouchEmail();
		tc.getinTouchSubject();
		tc.getinTouchMessage();
		tc6.waitTime();
		tc.getinTouchUploadFile();
		tc6.scrollbutton();
		tc.getinTouchSubmit();
		tc6.alert();
		tc.getinTouchSuccessfullMsg();
		tc.getinTouchHomeButton();
		tc.homePageVisible();
	}

}