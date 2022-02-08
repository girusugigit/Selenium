package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreenTechnology extends GreensTechAddress {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com");
	
	WebElement disTxt=driver.findElement(By.xpath("//h1[contains(text(),'Software')]"));
	String t1 =disTxt.getText();
	System.out.println(t1);
	
	String t2 =disTxt.getAttribute("attribute_value");
	System.out.println(t2);
	
	WebElement txt3 = driver.findElement(By.xpath("//p[@style='text-align:justify; font-size:18px;']"));
	String t4 =txt3.getText();
	System.out.println(t4);
	
	//GreenTechnology g1= new GreenTechnology();
	//g1.greensAdayar();
	//System.out.println(t1+g1.greensAdayar());
}
}
