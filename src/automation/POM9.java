package automation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM9 {

	WebDriver driver;

	public POM9(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id=\"search_product\"]")
	WebElement productSearchField;
	@FindBy(xpath = "//button[@id=\"submit_search\"]//child::i[1]")
	WebElement searchSymbol;
	@FindBy(xpath = "//h2[text()=\"Searched Products\"]")
	WebElement searchedProducts;
	@FindBy(xpath = "//div[@class=\"features_items\"]")
	List<WebElement> searchSpecificProducts;	
	
	public void productSearch() {
		productSearchField.sendKeys("tshirt");
		searchSymbol.click();
	}

	public void searchedProducts() {
		boolean searchedProductsVisible = searchedProducts.isDisplayed();
		System.out.println("'SEARCHED PRODUCTS' is visible: " + searchedProductsVisible);
	}
	
	public void searchSpecificProduct() {
		for (int i = 0; i < searchSpecificProducts.size(); i++) {
			System.out.println(searchSpecificProducts.get(i).getText());
		}
	}

}
