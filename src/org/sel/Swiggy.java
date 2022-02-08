package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	
	
	driver.manage().window().maximize();
	
	
	WebElement signupTXT=driver.findElement(By.xpath("//a[@class =\"x4bK8\"]"));
	signupTXT.click();
	
	
	
	WebElement accntTXT =driver.findElement(By.xpath("//a[@class =\"_3p4qh\"]"));
	accntTXT.click();
	Thread.sleep(3000);
	
	WebElement phTxt =driver.findElement(By.name("mobile"));
	phTxt.sendKeys("8607907280");
	
	Thread.sleep(3000);
	
	WebElement nameTxt =driver.findElement(By.name("name"));
	nameTxt.sendKeys("Sugi");
	
	Thread.sleep(3000);
	
	WebElement mailTxt =driver.findElement(By.name("email"));
	mailTxt.sendKeys("spk@gmail.com");
	
	Thread.sleep(3000);
	
	WebElement pwdTxt =driver.findElement(By.name("password"));
	pwdTxt.sendKeys("greens123");
	
	Thread.sleep(3000);
	
	WebElement clickBtn =driver.findElement(By.xpath("//a[@class = \"a-ayg\"]"));
	clickBtn.click();
	
	//WebElement locationtab =driver.findElement(By.id("location"));
	//locationtab.sendKeys("chennai");
	
	//WebElement findtab=driver.findElement(By.className("_3iFC5"));
	//findtab.click();
	
}}
