package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginBeforeCheckout {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc16= new POM(driver);
		POM2 tc=new POM2(driver);
		POM12 tc1=new POM12(driver);
		POM14 tc2=new POM14(driver);
		tc16.launchApp();
		tc16.waitTime();
		tc16.signuporloginbtn();
		tc.loginEmailid();
		tc.loginpassword();
		tc.loginButton();
		tc16.loggedinUsername();
		tc1.addToCartBtn();
		tc16.waitTime();
		tc1.addToCartSecondProduct();
		tc2.cartButton();
		tc2.cartPageVerify();
		tc2.proceedToCheckoutBtn();
		tc2.addressDetailsCheckout();
		tc2.commentAndPlaceOrder();
		tc2.paymentDetails();
		tc2.payAndConfirmOrderBtn();
		tc2.orderPlacedSuccessMsg();
		tc16.deleteAccount();
		tc16.accountDeletedVerifyandContinue();
	}

}
