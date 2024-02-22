package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CategoryProducts {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc18= new POM(driver);
		POM18 tc=new POM18(driver);
		tc18.launchApp();
		tc.categoryVerify();
		tc18.scrollbutton();
		tc.womenCategory();
		tc18.waitTime();
		tc.dressWomenCategory();
		tc18.waitTime();
		tc.categoryProductsPg();
		tc.menCategory();
		tc18.waitTime();
		tc.categoryPage();	
	}

}
