package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	
	Options o =driver.manage();
	Window w= o.window();
	w.maximize();
	
	WebElement nametab = driver.findElement(By.className("ng-scope"));
	nametab.sendKeys("spk");
	
}
}
