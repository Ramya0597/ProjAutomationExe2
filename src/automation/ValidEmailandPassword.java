package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidEmailandPassword {

	@Test
	public void validCredentials() throws Exception {
		WebDriver driver = new ChromeDriver();
		POM tc2 = new POM(driver);
		POM2 tc = new POM2(driver);
		tc2.launchApp();
		tc2.signuporloginbtn();
		tc.loginvisible();
		tc.loginEmailid();
		tc.loginpassword();
		tc.loginButton();
		tc2.loggedinUsername();
		tc2.deleteAccount();

	}

}
