package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterBeforeCheckout {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc15= new POM(driver);
		POM12 tc=new POM12(driver);
		POM14 tc1=new POM14(driver);
		tc15.launchApp();
		tc15.waitTime();
		tc15.signuporloginbtn();
		tc15.signupName();
		tc15.signupEmailid();
		tc15.signupbtn();
		tc15.accountInfoVerify();
		tc15.createAccountDetails();
		tc15.scrollbutton();
		tc15.accountCreateCheckbox();
		tc15.addressInform();
		tc15.loggedinUsername();
		tc.addToCartBtn();
		tc15.waitTime();
		tc.addToCartSecondProduct();
		tc1.cartButton();
		tc1.cartPageVerify();
		tc1.proceedToCheckoutBtn();
		tc1.addressDetailsCheckout();
		tc1.commentAndPlaceOrder();
		tc1.paymentDetails();
		tc1.payAndConfirmOrderBtn();
		tc1.orderPlacedSuccessMsg();
		tc15.deleteAccount();
		tc15.accountDeletedVerifyandContinue();		
	}
}
