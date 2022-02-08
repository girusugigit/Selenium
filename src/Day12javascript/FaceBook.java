package Day12javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement usertxt=driver.findElement(By.xpath("//input[@type='text']"));
	js.executeScript("arguments[0].setAttribute('value','spk@011')", usertxt);
	
	String t1=usertxt.getText();
	System.out.println(t1);
	
	WebElement passtxt=driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','pass123')", passtxt);
	
	driver.findElement(By.name("login")).click();
}
}
