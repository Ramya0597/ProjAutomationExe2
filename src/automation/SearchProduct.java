package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProduct {
	
	@Test
	public void searchProduct() {
		WebDriver driver = new ChromeDriver();
		POM tc9 = new POM(driver);
		POM8 tc=new POM8(driver);
		POM9 tc1=new POM9(driver);
		tc9.launchApp();
		tc.Products();
		tc.allProductsTitle();
		tc9.scrollbutton();
		tc1.productSearch();
		tc9.scrollbutton();
		tc1.searchedProducts();
		tc9.waitTime();
		tc1.searchSpecificProduct();
		tc9.scrollbutton();
	}
}
