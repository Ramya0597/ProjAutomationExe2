package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Subscription {
	
	@Test
	public void subscriptionHomePage() {
		WebDriver driver = new ChromeDriver();
		POM tc10 = new POM(driver);
		POM10 tc=new POM10(driver);
		tc10.launchApp();
		tc10.scrollDownFooter();
		tc.subscriptionVerify();
		tc.subscriptionTextbox();
		tc.subscriptionSuccess();
	}
}
