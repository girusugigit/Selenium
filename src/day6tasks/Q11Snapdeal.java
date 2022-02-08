package day6tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("https://www.snapdeal.com/");
	
	driver.manage().window().maximize();
	
	WebElement srctxt=driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
	js.executeScript("arguments[0].setAttribute('value','HP Laptop')", srctxt);
	
	WebElement clicktxt=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
	clicktxt.click();
}
}
