package day6tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9FlipKart {
public static void main(String[] args) throws IOException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	Robot r = new Robot();
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	WebElement sertxt=driver.findElement(By.xpath("//input[@type='text']"));
	js.executeScript("arguments[0].setAttribute('value','iphone')", sertxt);
	
	


	r.keyPress(KeyEvent.VK_ENTER);
	//r.keyRelease(KeyEvent.VK_ENTER);
	
	//driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
	File src=tk.getScreenshotAs(OutputType.FILE);
	
	File Dest=new File("C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\ScreenShot\\iphone.png");
	
	FileUtils.copyFile(src, Dest);
}
}
