package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDrag {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	driver.manage().window().maximize();
	
	Actions a = new Actions(driver);
	
	WebElement dragtxt=driver.findElement(By.xpath("(//li[@id ='fourth'])[1]"));
	
	WebElement dragtxt2 =driver.findElement(By.xpath("//ol[@id='amt7']"));
	
	
	a.dragAndDrop(dragtxt, dragtxt2).perform();
	
	
	WebElement dragtxt3=driver.findElement(By.xpath("//li[@id='credit']"));
	
	WebElement dragtxt4 =driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	
	a.dragAndDrop(dragtxt3, dragtxt4).perform();
}
}
