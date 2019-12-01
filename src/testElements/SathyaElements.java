package testElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SathyaElements
{
	WebDriver driver;
	@FindBy(xpath = "//input[@id='instasearch']")
	@CacheLookup WebElement searchbox;
	
	@FindBy(xpath = "//i[@class='icm icm-magnifier instasearch-icon']")
	@CacheLookup WebElement searchbutton;
	
	@FindBy(xpath = "(//h3[@class='art-name']/a)[1]")
	@CacheLookup WebElement firstItem;
	
	@FindBy(xpath = "//div[@class='page-title']")
	@CacheLookup WebElement itemTitle;
	
	@FindBy(xpath = "(//a[@data-type='cart'])[1]")
	@CacheLookup WebElement cartButton;
	
	@FindBy(xpath = "//a[@class='btn btn-clear btn-block btn-action']")
	@CacheLookup WebElement out;
	
	@FindBy(xpath = "//div[@class='col-sm-6 col-md-12 col-lg-6']")
	@CacheLookup WebElement user;
	
	@FindBy(xpath = "(//div[@class='col-sm-9']//input[@class='form-control'])[2]")
	@CacheLookup WebElement formFname;

	@FindBy(xpath = "(//div[@class='col-sm-9']//input[@class='form-control'])[3]")
	@CacheLookup WebElement formLname;

	@FindBy(xpath = "(//div[@class='col-sm-9']//input[@class='form-control'])[4]")
	@CacheLookup WebElement formAddress;

	@FindBy(xpath = "(//div[@class='col-sm-9']//input[@class='form-control'])[6]")
	@CacheLookup WebElement formCity;

	@FindBy(xpath = "(//div[@class='col-sm-9']//input[@class='form-control'])[7]")
	@CacheLookup WebElement formPINcode;

	@FindBy(xpath = "(//div[@class='col-sm-9']//input[@class='form-control'])[8]")
	@CacheLookup WebElement formEmail;

	@FindBy(xpath = "(//div[@class='col-sm-9']//input[@class='form-control'])[9]")
	@CacheLookup WebElement formPhNo;
	
	@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[1]")
	@CacheLookup WebElement formCountry;
	
	@FindBy(xpath = "//li[@aria-selected='false']")
	@CacheLookup WebElement formCountry1;
	
	@FindBy(xpath = "//button[@class='btn btn-warning btn-lg new-address-next-step-button']")
	@CacheLookup WebElement nextbutton;
	
	@FindBy(xpath = "//button[@class='btn btn-warning btn-block select-shipping-address-button']")
	@CacheLookup WebElement shipto;
	
	@FindBy(xpath = "//button[@class='btn btn-warning btn-lg shipping-method-next-step-button']")
	@CacheLookup WebElement shipNext;
	
	@FindBy(xpath = "//button[@class='btn btn-warning btn-lg payment-method-next-step-button']")
	@CacheLookup WebElement deliveryNext;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	@CacheLookup WebElement checkBox;
	
	@FindBy(xpath = "//button[@class='btn btn-danger btn-lg btn-block btn-buy']")
	@CacheLookup WebElement confirmButton;
	
	//*************************************************
	@FindBy(xpath = "//a[contains(text(),'Electronics')]")
	@CacheLookup WebElement typeofProduct;
	
	@FindBy(xpath = "//a[@title='Laptop']/span[contains(text(),'Laptop')]")
	@CacheLookup WebElement ItemLaptop;
	
	@FindBy(xpath = "//a[@title='Dell']/span[contains(text(),'Dell')]")
	@CacheLookup WebElement ItemDell;
	
	//**********************************************
	@FindBy(xpath = "//a[contains(text(),'Features')]")
	@CacheLookup WebElement LapFeaturesButton;
	
	@FindBy(xpath = "(//tr/td[@class='pd-spec-value'])[6]")
	@CacheLookup WebElement LapRam;

	@FindBy(xpath = "(//tr/td[@class='pd-spec-value'])[7]")
	@CacheLookup WebElement LapRom;

	@FindBy(xpath = "(//tr/td[@class='pd-spec-value'])[18]")
	@CacheLookup WebElement LapWarranty;

	public SathyaElements (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ItemSearch(String items)
	{
		searchbox.sendKeys(items);
	}
	
	public void button() {
		searchbutton.click();
	}
	
	public void item() {
		firstItem.click();
	}
	
	public String ItemName() {
		String name = itemTitle.getText();
		return name;
	}
	
	public void AddToCart() {
		cartButton.click();
	}
	
	public void CheckOut() {
		out.click();
	}
	
	public void GuestUser() {
		user.click();
	}
	
	public void details(String Fname, String Lname, String address, String city, String pin, String email, String mobile)
	{
		formFname.sendKeys(Fname);
		formLname.sendKeys(Lname);
		formAddress.sendKeys(address);
		formCity.sendKeys(city);
		formPINcode.sendKeys(pin);
		formEmail.sendKeys(email);
		formPhNo.sendKeys(mobile);
	}
	
	public void country() {
		formCountry.click();
		formCountry1.click();
	}
	
	public void next() {
		nextbutton.click();
	}
	
	public void ship() {
		shipto.click();
	}
	
	public void next1() {
		shipNext.click();
	}
	
	public void next2() {
		deliveryNext.click();
	}
	
	public void Check() {
		checkBox.click();
	}
	
	public void confirm() {
		confirmButton.click();
	}
	
	public void ProductType() {
		typeofProduct.click();
	}
	
	public void Laptop() {
		ItemLaptop.click();
	}
	
	public void Dell() {
		ItemDell.click();
	}
	
	public void Features() {
		LapFeaturesButton.click();
	}
	
	public String Ram() {
		return LapRam.getText();
	}
	
	public String Rom() {
		return LapRom.getText();
	}
	
	public String Warranty() {
		return LapWarranty.getText();
	}
}
