package stepDefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountLoging {
	public static WebDriver driver;

	@Given("user on Geico.com home page")
	public void user_on_geico_com_home_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/sarker/eclipse-workspace/GeicoBdd/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.geico.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

	}

	@When("user click on login")
	public void user_click_on_login() {
		driver.findElement(By.className("icon-profile")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn--secondary'])[1]")).click();
	}

	@When("user enter invalid username")
	public void user_enter_invalid_username() {
		driver.findElement(By.xpath("//input[@id='TextInputComponent-1']")).sendKeys("user");
	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
		driver.findElement(By.xpath("//input[@id='TextInputComponent-2']")).sendKeys("password");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[@class='btn btn--primary btn--full-mobile']")).click();
	}

	@Then("display invalid information.")
	public void display_invalid_information() {
		System.out.println(driver.getTitle());
	}

}
