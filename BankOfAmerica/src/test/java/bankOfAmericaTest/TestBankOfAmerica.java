package bankOfAmericaTest;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import bankOfAmerica.DriverPage;
import bankOfAmerica.WebElementPage;

public class TestBankOfAmerica extends DriverPage {
	@Test()

	public void OpenSavingAccount() throws InterruptedException {
		WebElementPage ePage = new WebElementPage(driver);
		ePage.openAccount.click();
		ePage.getStrated.click();
		ePage.safeBalance.click();
		Set<String> windows = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(windows);
		driver.switchTo().window(windowsList.get(1));
		System.out.println(driver.getCurrentUrl());
		ePage.zipCodeBox.click();
		ePage.zipCodeBox.sendKeys("10007");
		ePage.goButton.click();
		ePage.noAddSaving.click();
		boolean clickBox = ePage.noAddSaving.isSelected();
		System.out.println("The check Box is selected ." + clickBox);
		ePage.goToApplication.click();
		DriverPage.driver.wait(3000);

		// screenShotTest();
	}

//	public void screenShotTest() throws IOException {
//		File pictures = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(pictures, new File("/Users/sarker/eclipse-workspace/MavenProjects/Screenshots/pic1.jpg"));
//	}
}
