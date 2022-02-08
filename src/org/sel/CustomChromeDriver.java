package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomChromeDriver {
	 
	public static WebDriver getDriver(String websiteName) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get(websiteName);		
		driver.manage().window().maximize();
		return driver;
		
	}

}