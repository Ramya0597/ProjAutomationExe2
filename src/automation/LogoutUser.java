package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogoutUser {
	
	@Test
	public void logoutUser() throws Exception {
		WebDriver driver = new ChromeDriver();
		POM tc4 = new POM(driver);
		POM2 tc=new POM2(driver);
		POM4 tc1=new POM4(driver);
		tc4.launchApp();
		tc4.signuporloginbtn();
		tc.loginvisible();
		tc.loginEmailid();
		tc.loginpassword();
		tc.loginButton();
		tc4.loggedinUsername();
		tc4.logoutButton();
		tc1.verifyLoginPage();
	}
	
}
