package day10tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	
	WebElement scrl=driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
	js.executeScript("arguments[0].click()", scrl);
}
}
