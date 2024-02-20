package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProductsVerifyCartAfterLogin {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc20= new POM(driver);
		POM8 tc=new POM8(driver);
		POM2 tc1=new POM2(driver);
		POM9 tc2=new POM9(driver);
		POM20 tc3=new POM20(driver);
		POM14 tc14=new POM14(driver);
		tc20.launchApp();
		tc.Products();
		tc.allProductsTitle();
		tc2.productSearch();
		tc2.searchedProducts();
		tc2.searchSpecificProduct();
		tc3.addAllProductsToCart();
		tc14.cartButton();
		tc3.specificProductListInCart();
		tc20.signuporloginbtn();
		tc1.loginEmailid();
		tc1.loginpassword();
		tc1.loginButton();
		tc14.cartButton();
		tc3.specificProductListInCart();		
	}
}
