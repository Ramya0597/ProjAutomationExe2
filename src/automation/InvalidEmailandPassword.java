package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvalidEmailandPassword {
	@Test
	public void invalidCredentials() throws Exception {
		WebDriver driver = new ChromeDriver();
		POM tc3 = new POM(driver);
		POM2 tc=new POM2(driver);
		POM3 tc1=new POM3(driver);
		tc3.launchApp();
		tc3.signuporloginbtn();
		tc.loginvisible();
		tc1.invalidEmail();
		tc1.invalidPass();
		tc.loginButton();
		tc1.msgVerifyLogin();
	}

}
