package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemoGuru {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	
	driver.manage().window().maximize();
	//Eg 1 with string name or id
	//driver.switchTo().frame("a077aa5e");
	
	
	//Eg 2 with index-the attribute value is 5 under inspect hence index =5-1
	//driver.switchTo().frame(4);
	
	//Eg3 find webelement and then using the reference we can pull it
	
	WebElement t1=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	
	driver.switchTo().frame(t1);
	
	driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	
	
	
}
}
