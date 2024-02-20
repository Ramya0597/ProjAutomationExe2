package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExistingEmail {

	@Test
	public void existingEmailid() throws Exception {
		WebDriver driver = new ChromeDriver();
		POM tc5 = new POM(driver);
		POM5 tc=new POM5(driver);
		tc5.launchApp();
		tc5.signuporloginbtn();
		tc5.signupvisible();
		tc5.signupName();
		tc5.signupEmailid();
		tc5.signupbtn();
		tc.emailExisting();
	}
}
