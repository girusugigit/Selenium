package day10tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	Robot r= new Robot();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mask");
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("(//a[contains(text(),'Nea N95')])[2]")).click();

	
	
}
}
