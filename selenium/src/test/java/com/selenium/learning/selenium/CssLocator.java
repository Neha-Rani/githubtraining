package com.selenium.learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drives\\D Drive\\Neha\\Testing\\Testing Tools\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=uk");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("uname");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pwd");
		driver.findElement(By.cssSelector("#Login")).click();
		

	}

}
