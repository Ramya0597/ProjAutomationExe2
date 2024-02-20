package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductQuantityInCart {
	
	@Test
	public void productAddToCart() {
		WebDriver driver = new ChromeDriver();
		POM tc13= new POM(driver);
		POM8 tc=new POM8(driver);
		POM13 tc1=new POM13(driver);
		tc13.launchApp();
		tc.viewProduct();
		tc.productDetailsVisible();
		tc1.productQuantity();
		tc1.productDetailsAddCartBtn();
		tc1.productDetailsViewCartBtn();
		tc1.productQuantityVerify();
	}

}
