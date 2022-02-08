package day10tasks;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	driver.get("http://www.greenstechnologys.com/python-training.html");
	
	driver.manage().window().maximize();
	
	WebElement scrl=driver.findElement(By.xpath("(//h3[@class='panel-title'])[6]"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrl);
	
	driver.findElement(By.xpath("(//h3[@class='panel-title'])[24]")).click();
	
	WebElement scrl1=driver.findElement(By.xpath("(//h3[@class='panel-title'])[33]"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrl1);
	
	driver.findElement(By.xpath("(//h3[@class='panel-title'])[34]")).click();
	
	WebElement handling=driver.findElement(By.xpath("(//button[@class='let-us-now pinkbutton ga-click'])[33]"));
	handling.click();
	
	
	
	String output=handling.getText();
	System.out.println(output);
	
	String parentid=driver.getWindowHandle();
	System.out.println(parentid);
	
	Set<String> allids=driver.getWindowHandles();
	System.out.println(allids);
	for (String eachid : allids) {
		if(!parentid.equals(eachid)) {
			driver.switchTo().window(eachid);
		}
	}
	
	WebElement questions=driver.findElement(By.xpath("//pre"));
	
	
	
	System.out.println(questions);
	questions.getText();
	
}
}
