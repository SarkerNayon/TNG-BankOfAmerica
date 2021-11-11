package bankOfAmerica;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElementPage {
	
	public WebElementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[@class='open-account']")
	public WebElement openAccount;

	@FindBy(xpath = "(//div[@class='cta cta'])[1]")
	public WebElement getStrated;

	@FindBy(xpath = "//a[@id='ProductDetails_P3_Opt1_CTA']")
	public WebElement safeBalance;

	@FindBy(xpath = "(//input[@name='zipCodeInput'])[2]")
	public WebElement zipCodeBox;

	@FindBy(id = "go-button-zip-modal")
	public WebElement goButton;

	@FindBy(xpath = "//input[@id='rb-savings-account-none']")
	public WebElement noAddSaving;

//	@FindBy(xpath = "//input[@id='isBoaClient']")
//	public static WebElement checkBox;

	@FindBy(xpath = "//a[@id='go-to-application-mediumup']")
	public WebElement goToApplication;

}
