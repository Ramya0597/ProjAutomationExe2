package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterWhileCheckout {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc14= new POM(driver);
		POM12 tc=new POM12(driver);
		POM14 tc1=new POM14(driver);
		tc14.launchApp();
		tc14.waitTime();
		tc.addToCartBtn();
		tc14.waitTime();
		tc.continueShoppingBtn();
		tc.addToCartSecondProduct();
		tc14.waitTime();
		tc.continueShoppingBtn();
		tc1.cartButton();
		tc1.cartPageVerify();
		tc1.proceedToCheckoutBtn();
		tc14.registerLoginBtn();
		tc14.signupName();
		tc14.signupEmailid();
		tc14.signupbtn();
		tc14.accountInfoVerify();
		tc14.createAccountDetails();
		tc14.scrollbutton();
		tc14.accountCreateCheckbox();
		tc14.addressInform();
		tc14.loggedinUsername();
		tc1.cartButton();
		tc1.proceedToCheckoutBtn();
		tc1.addressDetailsCheckout();
		tc1.commentAndPlaceOrder();
		tc1.paymentDetails();
		tc1.payAndConfirmOrderBtn();
		tc1.orderPlacedSuccessMsg();
		tc14.deleteAccount();
		tc14.accountDeletedVerifyandContinue();
	}
}
