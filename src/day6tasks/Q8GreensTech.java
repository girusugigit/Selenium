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

public class Q8GreensTech {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	driver.manage().window().maximize();
	
	WebElement w1=driver.findElement(By.xpath("//div[@id='heading301']"));
	js.executeScript("arguments[0].scrollIntoView(true)", w1);
	
	WebElement src=driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[5]"));
	src.click();
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File S1=tk.getScreenshotAs(OutputType.FILE);
	
	File D1=new File("C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\ScreenShot\\java.png");
	
	FileUtils.copyFile(S1, D1);
	
	
}
}
