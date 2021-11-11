package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonMethods.CommonMethods;

public class AutoQoute {

	@FindBy(xpath = "(//div[@class='product-checkbox'])[1]")
	public WebElement auto;

	@FindBy(xpath =  "//a[text()='Start My Quote']")
	public WebElement startMyQoute;

	@FindBy(xpath = "(//input[@class='zip-code-input'])[2]")
	public WebElement zipcode;

	@FindBy(xpath = "//input[@class='btn btn--primary btn--full-mobile']")
	public WebElement continueButton;

	@FindBy(xpath = "//input[@id='Id_GiveFirstName_44837']//parent::div[@class='form-field form-field--error']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='Id_GiveLastName_43527']")
	public WebElement lastName;

	@FindBy(xpath = "(//input[@id='Id_GiveDateOfBirth_99460'])[1]")
	public WebElement dateOfBirth;

	@FindBy(className = "btn btn--primary btn--pull-right breakdown-next-btn")
	public WebElement nextButton;

	@FindBy(xpath = "//input[@id='AddressSearch']")
	public WebElement address;

	@FindBy(xpath = "//input[@id='UnitNumber']")
	public WebElement aptNumber;

	@FindBy(id = "Id_NEXT_62348Button")
	public WebElement nextButton2;

	public AutoQoute(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void autoQoute(CommonMethods cMethods) {
		cMethods.click(auto);
		cMethods.click(startMyQoute);
		cMethods.sendText(zipcode, "10007");
		cMethods.click(continueButton);
		cMethods.sendText(firstName, "jhon");
		cMethods.sendText(lastName, "doe");
		cMethods.sendText(dateOfBirth, "01/02/1971");
		cMethods.click(nextButton);
		cMethods.sendText(address, "555 W 57 Street");
		cMethods.sendText(aptNumber, "6G");
		cMethods.click(nextButton2);
	}

}
