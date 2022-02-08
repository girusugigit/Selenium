package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelNewUser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/Register.php");
	
	driver.manage().window().maximize();
	
	WebElement usertab =driver.findElement(By.name("username"));
	usertab.sendKeys("sugigiru");
	
	WebElement pwdtab = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	pwdtab.sendKeys("abc@123");
	
	WebElement confmpwdtab = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	confmpwdtab.sendKeys("abc@123");
	
	WebElement nametab =driver.findElement(By.name("full_name"));
	nametab.sendKeys("Sugi Girubakar");
	
	WebElement emailtab =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	emailtab.sendKeys("spk@gmail.com");
	
	WebElement capchatab = driver.findElement(By.id("captcha-form"));
	WebElement ct =capchatab.findElement(By.xpath("//img[@src= 'captcha.php']"));
	ct.click();
	
}
}
