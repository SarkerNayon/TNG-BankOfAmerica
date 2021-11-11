package com.commonMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	public void click(WebElement element) {
		element.click();
	}

	public void sendText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void dropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

}
