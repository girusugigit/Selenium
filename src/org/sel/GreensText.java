package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensText {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[@id='readReviews']")).click();
	
	Thread.sleep(2000);
	
	WebElement txt=driver.findElement(By.xpath("(//p[@class='justify'])[1]"));
	String t1=txt.getText();
	System.out.println(t1);
	
	
	WebElement d=driver.findElement(By.className("mail-info"));
	String t2=d.getText();
	System.out.println(t2);
	System.out.println();
	
	WebElement txt2=driver.findElement(By.xpath("(//p[@class=\"mail-info\"])[3]"));
	String t3=txt2.getText();
	System.out.println(t3);
	System.out.println();
	
	
	
	
	
}
}
