package com.selenium.learning.selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashmapExample {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Drives\\D Drive\\Neha\\Testing\\Testing Tools\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		System.out.println(getCredentialsMap());
		System.out.println(getCredentialsMap().get("customer"));
		driver.findElement(By.name("username")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getUserName("customer"));
			
	}
	
	public static HashMap<String, String> getCredentialsMap() {
		
		HashMap <String,String> userMap = new HashMap<String,String>();
		
		userMap.put("customer", "naveenautomation:Test@123");
		
		return userMap;
		}
	
	public static String getUserName(String role) {
		String credentials=getCredentialsMap().get(role);
		return credentials.split(":")[0];
		
	}	

	}


