package org.selpracticeDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
	
	WebDriver driver = new InternetExplorerDriver();
	driver.get("http://www.greenstechnologys.com/");
}
}
