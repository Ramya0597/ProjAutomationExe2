package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddressDetailsCheckoutPage {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc23= new POM(driver);
		POM23 tc= new POM23(driver);
		POM12 tc12=new POM12(driver);
		POM14 tc14=new POM14(driver);
		tc23.launchApp();
		tc23.signuporloginbtn();
		tc23.signupName();
		tc23.signupEmailid();
		tc23.signupbtn();
		tc23.accountInfoVerify();
		tc23.createAccountDetails();
		tc23.scrollbutton();
		tc23.accountCreateCheckbox();
		tc23.addressInform();
		tc23.loggedinUsername();
		tc12.addToCartBtn();
		tc14.cartButton();
		tc14.cartPageVerify();
		tc14.proceedToCheckoutBtn();
		tc.addressDetails();
		tc.billingAddress();		
		tc23.deleteAccount();
		tc23.accountDeletedVerifyandContinue();		
	}

}
