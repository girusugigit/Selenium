package org.selpracticeDay1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
			public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://greenstech.in/selenium-course-content.html");
}}
