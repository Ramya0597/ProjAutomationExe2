package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterUser {
	
	@Test
	public void registerUser() throws Exception {
		WebDriver driver = new ChromeDriver();
		POM tc1 = new POM(driver);
		tc1.launchApp();
		tc1.signuporloginbtn();
		tc1.signupvisible();
		tc1.signupName();
		tc1.signupEmailid();
		tc1.signupbtn();
		tc1.accountInfoVerify();
		tc1.createAccountDetails();
		tc1.scrollbutton();
		tc1.accountCreateCheckbox();
		tc1.addressInform();
		//tc1.waitTime();
		tc1.loggedinUsername();
		tc1.deleteAccount();
		tc1.waitTime();
		tc1.accountDeletedVerifyandContinue();
		tc1.continueBtnHP();
		
	}

}
