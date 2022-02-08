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

public class Q5GreensTech {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	driver.manage().window().maximize();
	
	WebElement src=driver.findElement(By.xpath("//div[@id='heading20']"));
	
	js.executeScript("arguments[0].scrollIntoView(true)", src);
	
	TakesScreenshot tk= (TakesScreenshot)driver;
	
	File source=tk.getScreenshotAs(OutputType.FILE);
	
	File Destination= new File("C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\ScreenShot\\job.png");
	
	FileUtils.copyFile(source, Destination);
}
}
