package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ViewAllProductsandDetailsPage {

	@Test
	public void viewAllProducts() {
		WebDriver driver = new ChromeDriver();
		POM tc8 = new POM(driver);
		POM8 tc=new POM8(driver);
		tc8.launchApp();
		tc.Products();
		tc.allProductsTitle();
		tc.productList();
		tc8.scrollbutton();
		tc.viewProduct();
		tc.productDetailPg();
		tc.productDetailsVisible();
	}

}
