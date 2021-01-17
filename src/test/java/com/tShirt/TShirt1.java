package com.tShirt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class TShirt1 extends BaseClass {
	
	@FindAll({@FindBy(xpath="(//a[text()='T-Shirt Elephant'])[1]"),@FindBy(xpath="(//a[@class=\"navbar-brand\"])[1]")})
	private WebElement appLogo;
	
	@FindAll({@FindBy(xpath="(//a[@href=\"javascript:;\"])[1]"),@FindBy(xpath="Check the flag")})
	private WebElement countryFlag;
	
	@FindBy(xpath="//a[@class=\"phone-number\"]")
	private WebElement contact_number;

	@FindAll({@FindBy(xpath="//a[@class=\"email\"]"),@FindBy(xpath="//a[text()=\" EMAIL\"]")})
	private WebElement emailId;
	
	@FindAll({@FindBy(id="desktop-login"),@FindBy(xpath="(//a[text()='Sign In'])[1]")})
	private WebElement signIn;
	
	@FindAll({@FindBy(xpath="(//a[@class=\"btn get-started\"])[3]"),@FindBy(xpath="(//a[text()=\"Get Started\"])[3]")})
    private WebElement getStarted;
	
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[1]")
	private WebElement products;
	
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[2]")
	private WebElement services;
	
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[3]")
	private WebElement about;
	
	@FindAll({@FindBy(xpath="(//a[text()=\"Design Now\"])[1]"),@FindBy(xpath="(//a[@class=\"btn\"])[1]")})
	private WebElement designNow;
	
	@FindAll({@FindBy(xpath="(//div[contains(text(),\"Need your order\")])[1] "),@FindBy(xpath="//a[text()='+1 844-593-5855']")})
	private WebElement contactNow;

    @FindAll({@FindBy(xpath="(//div[@class=\"box-name\"])[1]"),@FindBy(xpath="//span[text()='T-Shirts']")})
    private WebElement tShirts;
    
    @FindAll({@FindBy(xpath="(//div[@class=\"box-name\"])[2]"),@FindBy(xpath="//span[text()='Sports Jerseys']")})
    private WebElement sportsJersey;
    
    @FindAll({@FindBy(xpath="(//div[@class=\"box-name\"])[3]"),@FindBy(xpath="//span[text()='Sweatshirts']")})
    private WebElement sweatShirts;
    
    @FindAll({@FindBy(xpath="(//div[@class=\"box-name\"])[4]"),@FindBy(xpath="//span[text()='Made in Canada']")})
    private WebElement madeInCanada;
    
    @FindAll({@FindBy(xpath="(//div[@class=\"box-name\"])[5]"),@FindBy(xpath="//span[text()='Tank Tops']")})
    private WebElement tankTops;
    
    @FindAll({@FindBy(xpath="(//div[@class=\"box-name\"])[6]"),@FindBy(xpath="//span[text()='Performance']")})
    private WebElement performance;
    
    @FindAll({@FindBy(xpath="(//div[@class=\"box-name\"])[7]"),@FindBy(xpath="//span[text()='Womens']")})
    private WebElement women;
    
    @FindAll({@FindBy(xpath="(//div[@class=\"box-name\"])[8]"),@FindBy(xpath="//span[text()='Hats']")})
    private WebElement hats;
    
    @FindAll({@FindBy(xpath="//p[text()=' Follow us on Instagram ']"),@FindBy(xpath="//a[text()='@tshirtelephant']")})
    private WebElement followOnInstagram;
    
    @FindAll({@FindBy(xpath="//h2[text()='Custom T-Shirts, Made Better']"),@FindBy(xpath="(//div[@class=\"col-md-12\"])[4]")})
    private WebElement customTShirts;
    
    @FindBy(xpath="(//a[@class=\"btn get-started\"])[4]")
    private WebElement getStartedBelowCustom;
    
    @FindBy(xpath="//h2[text()='What Our Customers Are Saying']")
    private WebElement customersSaying;
    
    @FindAll({@FindBy(xpath="//h2[text()='Need assistance placing your order?']"),@FindBy(xpath="(//div[@class=\"col-md-12\"])[6]")})
    private WebElement placingOrder;
    
    @FindAll({@FindBy(xpath="//a[@class=\"btn touch\"]"),@FindBy(xpath="//a[text()='Get in touch']")})
    private WebElement getInTouch;
    
    @FindAll({@FindBy(id="footer-contact-address"),@FindBy(xpath="//a[text()='18 Raitherm Road North York, ON Canada M6B 3X9']")})
    private WebElement address;

	public WebElement getAppLogo() {
		return appLogo;
	}

	public WebElement getCountryFlag() {
		return countryFlag;
	}

	public WebElement getContact_number() {
		return contact_number;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getStarted() {
		return getStarted;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getAbout() {
		return about;
	}

	public WebElement getDesignNow() {
		return designNow;
	}

	public WebElement getContactNow() {
		return contactNow;
	}

	public WebElement gettShirts() {
		return tShirts;
	}

	public WebElement getSportsJersey() {
		return sportsJersey;
	}

	public WebElement getSweatShirts() {
		return sweatShirts;
	}

	public WebElement getMadeInCanada() {
		return madeInCanada;
	}

	public WebElement getTankTops() {
		return tankTops;
	}

	public WebElement getPerformance() {
		return performance;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getHats() {
		return hats;
	}

	public WebElement getFollowOnInstagram() {
		return followOnInstagram;
	}

	public WebElement getCustomTShirts() {
		return customTShirts;
	}

	public WebElement getGetStartedBelowCustom() {
		return getStartedBelowCustom;
	}

	public WebElement getCustomersSaying() {
		return customersSaying;
	}

	public WebElement getPlacingOrder() {
		return placingOrder;
	}

	public WebElement getGetInTouch() {
		return getInTouch;
	}

	public WebElement getAddress() {
		return address;
	}
    
    
    public TShirt1() {

      PageFactory.initElements(driver,this);
    }
    
    
	
	
}
