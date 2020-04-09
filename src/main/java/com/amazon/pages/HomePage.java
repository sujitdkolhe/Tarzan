package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.config.Constants;

public class HomePage {
	@FindBy(css = "#nav-hamburger-menu")
	private WebElement menuBtn;
	@FindBy(css = "#hmenu-canvas-background > div")
	private WebElement closeMunuBtn;
	@FindBy(css = "span.nav-sprite.nav-logo-base")
	private WebElement amazonLogo;
	@FindBy(css = "span.nav-logo-locale")
	private WebElement inLogo;
	@FindBy(css = "span.nav-sprite.nav-logo-base")
	private WebElement amazon_In_TryPrimeLogo;
	@FindBy(xpath = "//a[contains(text(),'Try Prime')]")
	private WebElement tryPrimeText;
	@FindBy(css = "#searchDropdownBox")
	private WebElement allCategoriesDropdown;
	@FindBy(css = "#twotabsearchtextbox")
	private WebElement searchBox;
	@FindBy(css = "div.nav-right > div > input")
	private WebElement searchBtn;
	@FindBy(css = "#nav-search-submit-text")
	private WebElement searchBtnLogo;
	
	@FindBy(css = "#nav-tools>a")
	private WebElement customerServiceToobar;
	
	@FindBy(css = "span.nav-line-1>span:nth-child(1)")
	private WebElement EN_GlobalImage;
	@FindBy(css = "#icp-nav-flyout>span>span>span.icp-nav-language")
	private WebElement ENText;
	@FindBy(css = "#icp-nav-flyout")
	private WebElement ENLanguage;
	@FindBy(css = "#nav-link-accountList>span.nav-line-1")
	private WebElement HelloSignInText;
	@FindBy(css = "#nav-link-accountList>span.nav-line-2")
	private WebElement accountListText;
	@FindBy(css = "#nav-link-accountList")
	private WebElement HelloSignIn_AccountListLabel;
	@FindBy(css = "#nav-orders>span.nav-line-1")
	private WebElement returnText;
	@FindBy(css = "#nav-orders>span.nav-line-2")
	private WebElement orderText;
	@FindBy(css = "#nav-orders")
	private WebElement returnOrderText;
	@FindBy(css = "#nav-link-prime>span.nav-line-1")
	private WebElement tryText;
	@FindBy(css = "#nav-link-prime>span.nav-line-2")
	private WebElement PrimeText;
	@FindBy(css = "#nav-link-prime")
	private WebElement TryPrimeText;
	@FindBy(css = "span.nav-cart-icon.nav-sprite")
	private WebElement cartIcon;
	@FindBy(css = "#nav-cart>span.nav-line-2")
	private WebElement cartText;
	@FindBy(css = "#nav-cart-count")
	private WebElement zeroNumber;
	@FindBy(css = "#glow-ingress-line1")
	private WebElement helloText;
	@FindBy(css = "#nav-packard-glow-loc-icon")
	private WebElement yourAddressIcon;
	@FindBy(css = "#glow-ingress-line2")
	private WebElement SelectYourAddressText;
	@FindBy(css = "#nav-global-location-slot>span>a")
	private WebElement selectYourAdress;
	@FindBy(css = "#GLUXZipUpdateInput")
	private WebElement pincodeBox;
	@FindBy(css = "#GLUXZipUpdate > span > input")
	private WebElement applyPincodeBtn;
	@FindBy(css = "#nav-xshop>a")
	private WebElement shopping_Container;

	// This is to Initializing the page Objects
	public HomePage() {
		PageFactory.initElements(Constants.driver, this); // we can also write (currentclassname.class)
	}

	// This method to click on menu tab
	public void clickOnMenuTab() {
		menuBtn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Unable to find Element");
			e.printStackTrace();
		}
	}

// This method to close the menu tab
	public void closeMunuTab() {
		closeMunuBtn.click();
	}

//This method to verify 'amazon' logo 
	public boolean getAmazonLogo() {
		return amazonLogo.isDisplayed();
	}

	// This method to verify'.in' image
	public boolean inLogo() {
		return inLogo.isDisplayed();
	}

	// This method to click on 'Amazon.in' logo
	public void clickOnAmazonLogo() {
		amazon_In_TryPrimeLogo.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Unable to click on elelment");
			e.printStackTrace();
		}

	}

	// This method to get 'TryPrime' Text
	public String getTryPrimeText() {
		return tryPrimeText.getText();

	}

	// This method to click on on 'TryPrime' Text
	public void clickOnTryprime() {
		tryPrimeText.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Unable to click on elelment");
			e.printStackTrace();
		}
	}

	// This method to get cssValue(color) of 'All categories' dropdown menu
	public String getColorAllcategoriesDropDown() {
		String color = allCategoriesDropdown.getCssValue("background-color");
		return color;
	}

	// This method to get cssValue(color) after hovering on 'All categories'
	// dropdown menu
	public String getColor_AllcategoriesDropDown_AfterHover() {
		Constants.element = allCategoriesDropdown;
		Constants.action = new Actions(Constants.driver);
		Constants.action.moveToElement(Constants.element).perform();
		String color = allCategoriesDropdown.getCssValue("color");
		return color;
	}

	// This method to click on 'AllcategoriesDropDown'
	public void clickOn_AllCategoriesDropdown() {
		allCategoriesDropdown.click();
	}

	// This method to scrolling 'AllcategoriesDropDown'.
	public void scrolling_AllcategoriesDropDown() {
		Actions action = new Actions(Constants.driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.err.println("unable to scroll");
			e.printStackTrace();
		}
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		// action.keyUp(Keys.CONTROL).sendKeys(Keys.UP);
	}

	// This method to select index from 'AllcategoriesDropDown'
	public void selectIndex_AllcategoriesDropDown(int indexToEnter) {
		Constants.element = allCategoriesDropdown;
		Constants.select = new Select(Constants.element);
		Constants.select.selectByIndex(indexToEnter);
	}

	// This method to get cssValue(color) of 'Search Box'
	public String getColor_SearchBtn() {
		String color = searchBtn.getCssValue("background-color");
		return color;
	}

	// This method to get cssValue(color) after hovering on 'Search Box'
	public String getColor_searchBtn_AfterHover() {
		Constants.element = searchBtn;
		Constants.action = new Actions(Constants.driver);
		Constants.action.moveToElement(Constants.element).perform();
		String color = searchBtn.getCssValue("color");
		return color;
	}

	// This method to click on search button
	public void clickOnSearchBtn() {
		searchBtn.click();
	}

	// This method to verify search button logo
	public boolean getSerachBtnLogo() {
		boolean isDisplay = searchBtnLogo.isDisplayed();
		return isDisplay;
	}

	// This method to enter text in Search Box
	public void enterTextinSearchBox(String textToEnter) {
		searchBox.sendKeys(textToEnter);
	}

	// This method to verify EN_Global image(language)
	public boolean getEN_Global_Image() {
		boolean isDisplay = EN_GlobalImage.isDisplayed();
		return isDisplay;
	}

//This method to get EN_Language text
	public String getENLanguageText() {
		Constants.actual = ENText.getText();
		return Constants.actual;
	}

//This method to click on EN_Language Image
	public void clickOnEN_LanguageImage() {
		ENLanguage.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Unable to click on EN_Languahe Image");
			e.printStackTrace();
		}
	}

//This method to get Hello SignIn text
	public String getHelloSignInText() {
		Constants.actual = HelloSignInText.getText();
		return Constants.actual;
	}

	// This method to get AccountLists text
	public String getAccountListsText() {
		Constants.actual = accountListText.getText();
		return Constants.actual;
	}

	// This method to click on Hello SignIn_AccountList
	public void clickOnHelloSignIn_AccountList() {
		HelloSignIn_AccountListLabel.click();
	}

	// This method to get 'Return' text
	public String getReturnText() {
		Constants.actual = returnText.getText();
		return Constants.actual;
	}

	// This method to get 'Order' text
	public String getOrderText() {
		Constants.actual = orderText.getText();
		return Constants.actual;
	}

	// THis method to click on 'Return Order'
	public void clickOnReturnOrder() {
		returnOrderText.click();
	}

	// This method to get 'Try' text
	public String getTryText() {
		Constants.actual = tryText.getText();
		return Constants.actual;
	}

	// This method to get 'Prime' text
	public String getPrimeText() {
		Constants.actual = PrimeText.getText();
		return Constants.actual;
	}

	// This method to click on 'Try Prime'
	public void clickOnTryPrimeTool() {
		TryPrimeText.click();
	}

	// This method to verify Cart icon
	public boolean getCartIcon() {
		boolean isDisplay = cartIcon.isDisplayed();
		return isDisplay;
	}

	// This method to get Cart text
	public String getCartText() {
		Constants.actual = cartText.getText();
		return Constants.actual;
	}

	// This method to get '0'(zero) number
	public String getZeroNumber() {
		Constants.actual = zeroNumber.getText();
		return Constants.actual;
	}

	// This method to click on Cart Tool
	public void clickCartTool() {
		cartText.click();
	}

	// This method to verify address icon
	public boolean getyourAddressIcon() {
		boolean isDisplay = yourAddressIcon.isDisplayed();
		return isDisplay;
	}

	// This method to verify Hello Text
	public String getHelloText() {
		Constants.actual = helloText.getText();
		return Constants.actual;
	}

	// This method to verify Select Your Address text
	public String getSelectYourAddressText() {
		Constants.actual = SelectYourAddressText.getText();
		return Constants.actual;
	}
	public void clickOnSelectYourAddress() {
		selectYourAdress.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Unable to click");
			e.printStackTrace();
		}
	}

	// This method to enter pincode in pincode box
	public void enterPincodeInPincodeBox(String pincode) {
		pincodeBox.sendKeys(pincode);
	}

	// This method to click on Apply pincode button
	public void clickOnApplyPincodeBtn() {
		applyPincodeBtn.click();
	}

	
	
}