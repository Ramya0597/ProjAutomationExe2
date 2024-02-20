package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadInvoiceAfterPO {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc24= new POM(driver);
		POM24 tc=new POM24(driver);
		POM14 tc14=new POM14(driver);
		POM12 tc12=new POM12(driver);
		tc24.launchApp();
		tc24.waitTime();
		tc12.addToCartBtn();
		tc14.cartButton();
		tc14.cartPageVerify();
		tc14.proceedToCheckoutBtn();
		tc24.registerLoginBtn();
		tc24.signupName();
		tc24.signupEmailid();
		tc24.signupbtn();
		tc24.accountInfoVerify();
		tc24.createAccountDetails();
		tc24.scrollbutton();
		tc24.accountCreateCheckbox();
		tc24.addressInform();
		tc24.loggedinUsername();
		tc14.cartButton();
		tc14.proceedToCheckoutBtn();
		tc14.addressDetailsCheckout();
		tc14.commentAndPlaceOrder();
		tc14.paymentDetails();
		tc14.payAndConfirmOrderBtn();
		tc14.orderPlacedSuccessMsg();
		tc.downloadInvoiceCart();
		tc.continuePayPage();
		tc24.deleteAccount();
		tc24.accountDeletedVerifyandContinue();
	}

}
