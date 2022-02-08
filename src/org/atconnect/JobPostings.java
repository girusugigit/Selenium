package org.atconnect;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobPostings {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		Robot r = new Robot();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("database2021covid19@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Data@2021");
		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[10]")).click();
		WebElement post=driver.findElement(By.xpath("//span[contains(text(),'Photo/video')]")); 
		
 	  post.click();
 	  
	}
 	 
	}

