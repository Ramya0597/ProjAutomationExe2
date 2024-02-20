package automation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM8 {
	
	WebDriver driver;

	public POM8(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\" Products\"]")
	WebElement productsBtn;
	@FindBy(xpath = "//h2[text()=\"All Products\"]")
	WebElement allProductsTitle;
	@FindBy(xpath = "//div[@class= \"features_items\"]")
	List<WebElement> allProductsList;
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")
	WebElement viewProduct;
	@FindBy(xpath = "//h2[text()=\"Blue Top\"]")
	WebElement firstProductName;
	@FindBy(xpath = "//p[text()=\"Category: Women > Tops\"]")
	WebElement firstProductCategory;
	@FindBy(xpath = "//span[text()=\"Rs. 500\"]")
	WebElement firstProductPrice;
	@FindBy(xpath = "//p[text()=\" In Stock\"]")
	WebElement firstProductAvailability;
	@FindBy(xpath = "//p[text()=\" New\"]")
	WebElement firstProductCondition;
	@FindBy(xpath = "//p[text()=\" Polo\"]")
	WebElement firstProductBrand;
	
	public void Products() {
		productsBtn.click();
	}
	
	public void allProductsTitle() {
		boolean allProducts = allProductsTitle.isDisplayed();
		System.out.println("user is navigated to ALL PRODUCTS page successfully: " + allProducts);
	}

	public void productList() {
		for (int i = 0; i < allProductsList.size(); i++) {
			System.out.println(allProductsList.get(i).getText());
		}
	}

	public void viewProduct() {
		viewProduct.click();
	}
	
	public void productDetailPg() {
		String currentPage = driver.getCurrentUrl();
		System.out.println("User is landed to product detail page: " + currentPage);
	}

	public void productDetailsVisible() {
		boolean product = firstProductName.isDisplayed();
		System.out.println("product name is Visible: " + product);
		boolean category = firstProductCategory.isDisplayed();
		System.out.println("Category is Visible: " + category);
		boolean price = firstProductPrice.isDisplayed();
		System.out.println("Price is Visible: " + price);
		boolean availability = firstProductAvailability.isDisplayed();
		System.out.println("Availability is Visible: " + availability);
		boolean condition = firstProductCondition.isDisplayed();
		System.out.println("Condition is Visible: " + condition);
		boolean brand = firstProductBrand.isDisplayed();
		System.out.println("Brand is Visible: " + brand);
	}

}
