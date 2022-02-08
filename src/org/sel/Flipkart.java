package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.className("_2sVfI7")).click();
	
	WebElement hometxt=driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
	
	
	Actions a= new Actions(driver);
	a.moveToElement(hometxt).perform();
}
}
