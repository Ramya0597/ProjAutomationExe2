package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SubscriptionCartPage {
	
	@Test
	public void subscriptionCart() {
		WebDriver driver = new ChromeDriver();
		POM tc11= new POM(driver);
		POM10 tc=new POM10(driver);
		POM14 tc14=new POM14(driver);
		tc11.launchApp();
		tc14.cartButton();
		tc11.scrollDownFooter();
		tc.subscriptionVerify();
		tc.subscriptionTextbox();
		tc.subscriptionSuccess();
	}

}
