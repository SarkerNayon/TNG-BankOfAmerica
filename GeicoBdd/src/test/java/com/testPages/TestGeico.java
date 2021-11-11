package com.testPages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.driverPage;
import com.commonMethods.CommonMethods;
import com.pages.AutoQoute;

public class TestGeico extends driverPage {
	CommonMethods cMethods;
	AutoQoute aQoute;

	@BeforeMethod
	public void intialization() {
		cMethods = new CommonMethods();
		aQoute = new AutoQoute(driver);
	}

	@Test
	public void getAutoQoute() {
		aQoute.autoQoute(cMethods);
	}

}
