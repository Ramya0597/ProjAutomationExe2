package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddReviewOnProduct {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc0=new POM(driver);
		POM8 tc1= new POM8(driver);
		POM21 tc=new POM21(driver);
		tc0.launchApp();
		tc1.Products();
		tc1.allProductsTitle();
		tc0.scrollbutton();
		tc1.viewProduct();
		tc.writeYourReviewVisible();  
		tc.reviewName();
		tc.reviewEmail();
		tc.reviewTextBox();
		tc.reviewSubmit();
		tc.successMessage();
	}
}
