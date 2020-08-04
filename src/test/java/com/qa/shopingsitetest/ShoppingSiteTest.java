package com.qa.shopingsitetest;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSiteTest {
	
	private WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//shiva//Documents//AA_PROJECTS//DG_seleniumProjects//seleniumTest1//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().fullscreen();

	}

	WebElement target;

}
