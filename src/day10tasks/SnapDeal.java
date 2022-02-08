package day10tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	
	driver.manage().window().maximize();
	
	WebElement search=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	search.sendKeys("iphone 11");
	
	driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']")).click();
	
	driver.findElement(By.xpath("//p[contains(@title,'ASTEE 2 in 1  card holder ')]")).click();
	
	
			
}
}
