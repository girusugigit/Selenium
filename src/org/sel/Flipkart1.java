package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	WebElement mailtxt=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	mailtxt.sendKeys("spk@gmail.com");
	String t2=mailtxt.getAttribute("value");
	System.out.println(t2);
	System.out.println();
	
	Robot a = new Robot();
	a.keyPress(KeyEvent.VK_TAB);
	a.keyRelease(KeyEvent.VK_TAB);
	
	WebElement passtxt=driver.findElement(By.xpath("//input[@type='password']"));
	passtxt.sendKeys("spk011");
	String t1=passtxt.getAttribute("value");
	System.out.println(t1);
	System.out.println();
	
	a.keyPress(KeyEvent.VK_TAB);
	a.keyRelease(KeyEvent.VK_TAB);
	
	driver.findElement(By.xpath("(//span[contains(text(),'Login')])[2]")).click();
}
}
