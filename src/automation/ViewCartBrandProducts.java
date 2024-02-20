package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ViewCartBrandProducts {
	
	@Test
	public void registerWhileCheckout() {
		WebDriver driver = new ChromeDriver();
		POM tc19= new POM(driver);
		POM19 tc=new POM19(driver);
		POM8 tc1=new POM8(driver);
		tc19.launchApp();
		tc1.Products();
		tc.brands();
		tc.subBrand();
		tc.brandPgAndproduts();
		tc.babyHugBrandLink();
		tc.babyHugBrandTitle();
	}

}
