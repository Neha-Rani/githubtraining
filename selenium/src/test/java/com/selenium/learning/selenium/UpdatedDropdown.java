package com.selenium.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drives\\D Drive\\Neha\\Testing\\Testing Tools\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebElement textfield = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		Actions action = new Actions(driver);
		action.contextClick(textfield).build().perform();
		
				

/*	driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.close();
*///*[@id="ctl00_mainContent_ddl_destinationStation1"]
	}

}
