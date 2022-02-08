package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusSign {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.redbus.in/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//div[@class='fr signin-block']")).click();
	
	driver.findElement(By.xpath("//li[@id='signInLink']")).click();
	
	Thread.sleep(2000);
	
	WebElement phntxt=driver.findElement(By.xpath("(//input[@placeholder='Enter your mobile number'])[2]"));
	phntxt.sendKeys("8607907280");
}
}
