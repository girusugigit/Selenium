package Day12javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	driver.manage().window().maximize();
	WebElement scrldown=driver.findElement(By.xpath("(//div[contains(@class,'card-headercore')])[2]"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrldown);

}
}
