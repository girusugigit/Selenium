package day6tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q9FlipKart1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	Actions a= new Actions(driver);
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	WebElement exittxt=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	js.executeScript("arguments[0].click()", exittxt);
	
	Thread.sleep(2000);
	WebElement fashiontxt=driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
	js.executeScript("arguments[0].click()", fashiontxt);
}
}
