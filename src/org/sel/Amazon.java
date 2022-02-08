package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[4]")).click();
	
	driver.findElement(By.xpath("//a[@name='submit']")).click();
	
	
	
	
}
}
