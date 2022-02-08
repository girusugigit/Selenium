package day6tasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	//store in temporary location
	File source=tk.getScreenshotAs(OutputType.FILE);
	
	File Destination = new File("C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\ScreenShot\\greens.png");
	
	FileUtils.copyFile(source, Destination);
	
	
}
}
