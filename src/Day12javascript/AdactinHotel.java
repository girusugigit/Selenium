package Day12javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement usertxt=driver.findElement(By.id("username"));
	js.executeScript("arguments[0].setAttribute('value','spk@gmail.com')", usertxt);
Object t1=js.executeScript("return arguments[0].getAttribute('value')", usertxt);
	System.out.println(t1);
	
	Thread.sleep(3000);
	
	WebElement passtxt=driver.findElement(By.id("password"));
	js.executeScript("arguments[0].setAttribute('value','Password12')", passtxt);
	Object t2=js.executeScript("return arguments[0].getAttribute('value')", passtxt);
	System.out.println(t2);
	
	Thread.sleep(3000);
	
	WebElement logintxt=driver.findElement(By.id("login"));
	js.executeScript("arguments[0].click()", logintxt);
	
	
}
}
