package automation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM20 {
	
	WebDriver driver;

	public POM20(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//i[@class=\"fa fa-shopping-cart\"]")
	List<WebElement> addToCartAllProducts;
	@FindBy(xpath = "//button[text()=\"Continue Shopping\"]")
	WebElement continueShopping;
	@FindBy(xpath = "//table[@id=\"cart_info_table\"]")
	List<WebElement> specificProductInCart;
	
	public void addAllProductsToCart() {
		for (int i = 0; i < addToCartAllProducts.size(); i++) {
			addToCartAllProducts.get(i).click();
		}
		continueShopping.click();
	}

	public void specificProductListInCart() {
		for (int i = 0; i < specificProductInCart.size(); i++) {
			System.out.println(specificProductInCart.get(i).getText());
		}
	}

}
