package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM18 {
	
	WebDriver driver;

	public POM18(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Category']")
	WebElement category;
	@FindBy(xpath = "//a[@href='#Women']")
	WebElement women;
	@FindBy(xpath = "//*[@id='Women']//child::div[1]//child::ul[1]//child::li[2]")
	WebElement tops;
	@FindBy(xpath = "//h2[text()='Women - Tops Products']")
	WebElement womenTopsTitle;
	@FindBy(xpath = "//a[@href='#Men']")
	WebElement men;
	@FindBy(xpath = "//a[text()='Tshirts ']")
	WebElement menTshirts;
	@FindBy(xpath = "//li[text()='Men > Tshirts']")
	WebElement menTshirtVerifyPg;
	
	
	public void categoryVerify() {
		boolean categoryDisplay= category.isDisplayed();
		System.out.println("categories are visible on left side bar: "+categoryDisplay);		
	}
	
	public void womenCategory() {
		women.click();
	}
	
	public void dressWomenCategory() {
		tops.click();
	}
	
	public void categoryProductsPg() {
		String page=driver.getCurrentUrl();
		System.out.println("category page is displayed as: "+page);
		String actTitle=womenTopsTitle.getText();
		System.out.println("Actual Title: "+actTitle);
		String expTitle="WOMEN - TOPS PRODUCTS";
		Assert.assertEquals(actTitle, expTitle);
	}
	
	public void menCategory() {
		men.click();
		menTshirts.click();	
	}
	
	public void categoryPage() {
		String actPage=menTshirtVerifyPg.getText();
		System.out.println(actPage);
		String expPage="Men > Tshirts";
		Assert.assertEquals(actPage, expPage, "user is navigated to Men > Tshirts category page");
	}
	
}
