package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpWithoutArrow {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc25= new POM(driver);
		POM25 tc=new POM25(driver);
		POM10 tc10=new POM10(driver);
		POM26 tc26=new POM26(driver);
		tc25.launchApp();
		tc25.waitTime();
		tc25.scrollDownFooter();
		tc10.subscriptionVerify();
		tc26.scrollUp();
		tc25.waitTime();
		tc.textVisibleScrollUp();	
	}
}
