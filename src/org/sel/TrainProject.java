package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainProject {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.cleartrip.com/trains");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chennai");
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bangalore");
	
	Robot r = new Robot();
	
	for(int i =0;i<=3;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_UP);
	}
}
}
