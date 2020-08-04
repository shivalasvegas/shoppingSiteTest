package com.qa.shopingsitetest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Write a test that will search the website for an item of clothing (e.g ‘Dress’) 
//and assert that a particular item was found. 


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
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		target = driver.findElement(By.id("search_query_top"));
		
		target.sendKeys("dress");
		target = driver.findElement(By.name("submit_search"));
		target.click();
		
		Thread.sleep(10000);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
