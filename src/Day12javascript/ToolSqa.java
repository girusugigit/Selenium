package Day12javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSqa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	
	driver.get("http://toolsqa.com/");
	
	WebElement scrl=driver.findElement(By.xpath("//img[@class='subscribe__rockstar']"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrl);
	
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//driver.findElement(By.xpath("(//button[@class='modal__close'])[2]")).click();
	
	

	
	WebElement scrl2=driver.findElement(By.xpath("//img[@class='learner']"));
	js.executeScript("arguments[0].scrollIntoView(false)",scrl2);
}
}
