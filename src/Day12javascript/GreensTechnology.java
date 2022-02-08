package Day12javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.get("http://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	
	WebElement scrl=driver.findElement(By.xpath("(//p)[12]"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrl);
	
	WebElement scrl1=driver.findElement(By.xpath("(//p)[10]"));
    String t1=scrl1.getText();
    System.out.println(t1);
}
}
