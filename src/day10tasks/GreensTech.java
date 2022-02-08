package day10tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	driver.manage().window().maximize();
	
	WebElement scrl=driver.findElement(By.xpath("//div[@id='heading303']"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrl);
	
	WebElement frame=driver.findElement(By.xpath("//div[@id='heading304']"));
	js.executeScript("arguments[0].click()", frame);
	
	WebElement junit=driver.findElement(By.xpath("(//a[@target='_blank'])[184]"));
	js.executeScript("arguments[0].click()", junit);
}
}
