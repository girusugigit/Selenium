package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class IciciBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	Options w =driver.manage();
	Window o =w.window();
	o.maximize();
	
	WebElement textbox = driver.findElement(By.className("form-control text-muted"));
	textbox.sendKeys("gsugik");
}
}
