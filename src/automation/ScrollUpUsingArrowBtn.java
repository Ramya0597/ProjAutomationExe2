package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpUsingArrowBtn {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc25= new POM(driver);
		POM25 tc=new POM25(driver);
		POM10 tc10=new POM10(driver);
		tc25.launchApp();
		tc25.waitTime();
		tc25.scrollDownFooter();
		tc10.subscriptionVerify();
		tc25.waitTime();
		tc.scrollUpArrowBtn();
		tc.textVisibleScrollUp();	
	}
}
