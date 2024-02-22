package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCartRecommendedItems {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc22= new POM(driver);
		POM22 tc=new POM22(driver);
		//POM12 tc1=new POM12(driver);
		tc22.launchApp();
		tc22.scrollbutton();
		tc.recommendedItemsVerify();
		tc.addToCartRI();
		
		tc.viewCartBtnRI();
		tc.productCartPage();
	}	

}
