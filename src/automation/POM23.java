package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM23 {
	
	WebDriver driver;

	public POM23(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"address_delivery\"]/li[2]")
	WebElement flName;
	@FindBy(xpath = "//*[@id=\"address_delivery\"]/li[3]")
	WebElement company;
	@FindBy(xpath = "//*[@id=\"address_delivery\"]/li[4]")
	WebElement address1;
	@FindBy(xpath = "//*[@id=\"address_delivery\"]/li[5]")
	WebElement address2;
	@FindBy(xpath = "//*[@id=\"address_delivery\"]/li[6]")
	WebElement cityState;
	@FindBy(xpath = "//*[@id=\"address_delivery\"]/li[7]")
	WebElement country;
	@FindBy(xpath = "//*[@id=\"address_delivery\"]/li[8]")
	WebElement mbleNo;
	@FindBy(xpath="//*[@id=\"address_invoice\"]/li[2]")
	WebElement fNameBD;
	@FindBy(xpath = "//*[@id=\"address_invoice\"]/li[3]")
	WebElement companyBD;
	@FindBy(xpath = "//*[@id=\"address_invoice\"]/li[4]")
	WebElement address1BD;
	@FindBy(xpath = "//*[@id=\"address_invoice\"]/li[5]")
	WebElement address2BD;
	@FindBy(xpath = "//*[@id=\"address_invoice\"]/li[6]")
	WebElement cityStateBD;
	@FindBy(xpath = "//*[@id=\"address_invoice\"]/li[7]")
	WebElement countryBD;
	@FindBy(xpath = "//*[@id=\"address_invoice\"]/li[8]")
	WebElement mbleNoBD;
		
	public void addressDetails() {
		String actFName="Mr. Ram Y";
		String expFullName= flName.getText();
		System.out.println(expFullName);
		Assert.assertEquals(actFName, expFullName);
		
		String actCompany="XYZ Company";
		String excCompany= company.getText();
		System.out.println(excCompany);
		Assert.assertEquals(actCompany, excCompany);
		
		String actAddress1="surat";
		String excAddress1= address1.getText();
		System.out.println(excAddress1);
		Assert.assertEquals(actAddress1, excAddress1);
		
		String actAddress2="street-4";
		String excAddress2= address2.getText();
		System.out.println(excAddress2);
		Assert.assertEquals(actAddress2, excAddress2);
		
		String actCityStatePincode="Surat Gujart 345542";
		String excCityStatePincode= cityState.getText();
		System.out.println(excCityStatePincode);
		Assert.assertEquals(actCityStatePincode, excCityStatePincode);
		
		String actCountry="India";
		String excCountry= country.getText();
		System.out.println(excCountry);
		Assert.assertEquals(actCountry, excCountry);
		
		String actMNo="8900098871";
		String excMNo= mbleNo.getText();
		System.out.println(excCountry);
		Assert.assertEquals(actMNo, excMNo);
	}
	
	public void billingAddress() {
		String actFNameBD="Mr. Ram Y";
		String expFullNameBD= fNameBD.getText();
		System.out.println(expFullNameBD);
		Assert.assertEquals(actFNameBD, expFullNameBD);
		
		String actCompanyBD="XYZ Company";
		String excCompanyBD= companyBD.getText();
		System.out.println(excCompanyBD);
		Assert.assertEquals(actCompanyBD, excCompanyBD);
		
		String actAddress1BD="surat";
		String excAddress1BD= address1BD.getText();
		System.out.println(excAddress1BD);
		Assert.assertEquals(actAddress1BD, excAddress1BD);
		
		String actAddress2BD="street-4";
		String excAddress2BD= address2BD.getText();
		System.out.println(excAddress2BD);
		Assert.assertEquals(actAddress2BD, excAddress2BD);
		
		String actCityStatePincodeBD="Surat Gujart 345542";
		String excCityStatePincodeBD= cityStateBD.getText();
		System.out.println(excCityStatePincodeBD);
		Assert.assertEquals(actCityStatePincodeBD, excCityStatePincodeBD);
		
		String actCountryBD="India";
		String excCountryBD= countryBD.getText();
		System.out.println(excCountryBD);
		Assert.assertEquals(actCountryBD, excCountryBD);
		
		String actMNoBD="8900098871";
		String excMNoBD= mbleNoBD.getText();
		System.out.println(excCountryBD);
		Assert.assertEquals(actMNoBD, excMNoBD);
	}
	 
}
