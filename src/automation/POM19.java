package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM19 {

	WebDriver driver;

	public POM19(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()=\"Brands\"]")
	WebElement brands;
	@FindBy(xpath = "//a[text()=\"H&M\"]")
	WebElement hmBrand;
	@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div")
	WebElement brandProducts;
	@FindBy(xpath = "//a[text()=\"Babyhug\"]")
	WebElement babyHugBrand;
	@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div")
	WebElement babyHugProducts;

	public void brands() {
		boolean brandsDisplay = brands.isDisplayed();
		System.out.println("Brands are visible on left side bar: " + brandsDisplay);
	}

	public void subBrand() {
		hmBrand.click();
	}

	public void brandPgAndproduts() {
		String brandPage = driver.getCurrentUrl();
		System.out.println("user is navigated to brand page: " + brandPage);
		String products=brandProducts.getText();
			System.out.println("brand products are displayed: "+products);
	}
	
	public void babyHugBrandLink() {
		babyHugBrand.click();
	}
	
	public void babyHugBrandTitle() {
		String babyHugPage=driver.getCurrentUrl();
		System.out.println(babyHugPage);
		System.out.println(babyHugProducts.getText());
	}

}
