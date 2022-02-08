package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SnapDeal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/login");
	
	Options o =driver.manage();
	Window w= o.window();
	w.maximize();
	
	WebElement Usertextbox=driver.findElement(By.id("userName"));
	Usertextbox.sendKeys("8607907280");
	
	WebElement continuebutton =driver.findElement(By.id("checkUser"));
	continuebutton.click();
	
	Thread.sleep(3000);
	
	WebElement emailbutton =driver.findElement(By.id("j_username_new"));
	emailbutton.sendKeys("gi345@gmail.com");
	
	WebElement nametab= driver.findElement(By.id("j_name"));
	nametab.sendKeys("Giru");
	
	WebElement pastab =driver.findElement(By.id("j_password"));
	pastab.sendKeys("abc123");
	
	//WebElement contab= driver.findElement(By.id("userSignup"));
	//contab.click();
	
	
}
}
