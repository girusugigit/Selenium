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

public class ToolSqa {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	driver.get("https://toolsqa.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(7000);
	
	driver.findElement(By.xpath("(//button[@class='modal__close'])[2]")).click();
	
	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("(//button[@class='modal__close'])[2]")).click();
	
	WebElement pgdown=driver.findElement(By.xpath("//div[text()='Cucumber']"));
	
	js.executeScript("arguments[0].scrollIntoView(true)", pgdown);
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	
	File source=tk.getScreenshotAs(OutputType.FILE);
	
	File Destination = new File("C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\ScreenShot\\toolsqa.png");
	
	FileUtils.copyFile(source, Destination);
			
}
}
