package com.selenium.learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google {

	public WebDriver driver;


	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Drives\\D Drive\\Neha\\Testing\\Testing Tools\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().fullscreen();
	}

	@Test
	public void testcase01() {
		System.out.println("Do your best everytime");

	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
