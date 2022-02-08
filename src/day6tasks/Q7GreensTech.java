package day6tasks;

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

public class Q7GreensTech {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement inttxt=driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[1]"));
	
	inttxt.click();
	
	Object t1=js.executeScript("arguments[0].scrollIntoView(true)", inttxt);
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	
	File src=tk.getScreenshotAs(OutputType.FILE);
	
	File Dest = new File("C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\ScreenShot\\interview.png");
	
	FileUtils.copyFile(src, Dest);
	
	
}
}
