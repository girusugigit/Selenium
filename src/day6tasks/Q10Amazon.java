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

public class Q10Amazon {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement srctxt=driver.findElement(By.xpath("//input[@type='text']"));
	js.executeScript("arguments[0].setAttribute('value','motorola')", srctxt);
	
	js.executeScript("arguments[0].setAttribute('style','color:yellow;margin:30px solid red')", srctxt);
	
	WebElement logintxt=driver.findElement(By.xpath("//input[@type='submit']"));
	js.executeScript("arguments[0].click()", logintxt);
	
	
	//js.executeScript("arguments[0].setAttribute('style','color:yellow;margin:30px solid red')", logintxt);
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	
	File src=tk.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\ScreenShot\\amazon.png");
	
	FileUtils.copyFile(src, dest);
}
}
