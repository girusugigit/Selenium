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

public class Q6GreensTech {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	driver.manage().window().maximize();
	
	WebElement source=driver.findElement(By.xpath("(//div[@id='headingOne'])[2]"));
	js.executeScript("arguments[0].scrollIntoView(true)",source);
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	
	File src=tk.getScreenshotAs(OutputType.FILE);
	
	File Dest=new File("C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\ScreenShot\\trend.png");
	
	FileUtils.copyFile(src, Dest);
	
	
}
}
