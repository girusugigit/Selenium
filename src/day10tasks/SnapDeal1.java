package day10tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal1  {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	Robot r = new Robot();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.get("https://www.snapdeal.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.name("keyword")).sendKeys("hand sanitizer");
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement choose=driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
	js.executeScript("arguments[0].click()",choose);
	
	String parentid=driver.getWindowHandle();
	System.out.println(parentid);
	
	Set<String> allid=driver.getWindowHandles();
	System.out.println(allid);
	
	for (String eachid : allid) {
		if(!parentid.equals(eachid)) {
			driver.switchTo().window(eachid);
			
			
		}
	}
	driver.findElement(By.xpath("(//span[@class='intialtext'])[1]")).click();
}
	
	
	
	
}

