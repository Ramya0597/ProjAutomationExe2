package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddProductCart {
	
	@Test
	public void productAddToCart() {
		WebDriver driver = new ChromeDriver();
		POM tc12= new POM(driver);
		POM8 tc=new POM8(driver);
		POM12 tc1=new POM12(driver);
		tc12.launchApp();
		tc.Products();
		tc12.waitTime();
		tc1.addToCartBtn();
		tc1.continueShoppingBtn();
		tc1.addToCartSecondProduct();
		tc1.viewCartButton(); 
		tc1.verifyViewCart();
		tc1.bothProductsDesc();		
	}

}
