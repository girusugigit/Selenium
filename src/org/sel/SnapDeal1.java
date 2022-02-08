package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal1 {
	public static void main(String[] args) throws InterruptedException {
		
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/login");
	
	driver.manage().window().maximize();
	
	WebElement Usertextbox=driver.findElement(By.xpath("//input[@placeholder ='Mobile Number/ Email']"));
	Usertextbox.sendKeys("8607907280");
	
	
	
driver.findElement(By.id("checkUser")).click();
	
WebElement email=driver.findElement(By.xpath("//input[@id ='j_username_new']"));
email.sendKeys("girusugi@gmail.com");
	
	
	
}
}
