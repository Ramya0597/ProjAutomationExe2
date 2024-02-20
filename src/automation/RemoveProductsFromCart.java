package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RemoveProductsFromCart {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc17= new POM(driver);
		POM12 tc=new POM12(driver);
		POM14 tc1=new POM14(driver);
		POM17 tc2=new POM17(driver);
		tc17.launchApp();
		tc17.waitTime();
		tc.addToCartBtn();
		tc17.waitTime();
		tc.addToCartSecondProduct();
		tc1.cartButton();
		tc1.cartPageVerify();
		tc2.deleteProduct();
		tc2.productDeleteConfirm();
	}

}