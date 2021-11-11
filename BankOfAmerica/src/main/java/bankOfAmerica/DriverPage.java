package bankOfAmerica;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class DriverPage {
	public static WebDriver driver;

	@Parameters({ "browser" })
	@BeforeMethod
	public void commonFiles(String browser) {
			
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"/Users/sarker/eclipse-workspace/MavenProjects2021/BankOfAmerica/drivers/chromedriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.bankofamerica.com/");
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/sarker/eclipse-workspace/MavenProjects/drivers/geckodriver");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.bankofamerica.com/");
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			}
			
			
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
