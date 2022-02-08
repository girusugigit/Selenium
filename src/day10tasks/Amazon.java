package day10tasks;





import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

//import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	Actions a = new Actions(driver);
	
	Robot r = new Robot();
	
	driver.get("https://www.amazon.com/");
	
	driver.manage().window().maximize();
	
	WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("iphone x");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	WebElement rc=driver.findElement(By.xpath("(//span[contains(@class,'medium')])[2]"));
	a.moveToElement(rc).contextClick(rc).build().perform();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
    String parentid=driver.getWindowHandle();
    System.out.println(parentid);
    
    Set<String> allwindows=driver.getWindowHandles();
   System.out.println(allwindows);
   for (String eachid : allwindows) {
	if(!parentid.equals(eachid)) {
		driver.switchTo().window(eachid);
	}
}
	
    
    
    String gettxt=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
    
	System.out.println(gettxt);
	

	
}
}
