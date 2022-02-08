package Day12javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	
	
	
	WebElement usertxt=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	js.executeAsyncScript("arguments[0].click()", usertxt);
	
		
	WebElement usertxt1=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	js.executeAsyncScript("arguments[0].setAttribute('value','8607907280')", usertxt1);
}
}
