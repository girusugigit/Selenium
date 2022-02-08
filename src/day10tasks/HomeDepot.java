package day10tasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("https://www.homedepot.com/");
	
	driver.manage().window().maximize();
	
	WebElement search=driver.findElement(By.xpath("//input[@id='headerSearch']"));
		search.sendKeys("Fan");	
		
		driver.findElement(By.xpath("//button[@id='headerSearchButton']")).click();
		
		WebElement scrldown=driver.findElement(By.xpath("(//img[contains(@src,'contentgrid')])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrldown);
		
		driver.findElement(By.xpath("(//a[@title='Floor Fans'])[1]")).click();
		
		WebElement scrl=driver.findElement(By.xpath("(//a[@class='header product-pod--ie-fix'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrl);
		
		driver.findElement(By.xpath("(//span[@class='bttn__content'])[4]")).click();
		
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		Set<String> allwindow=driver.getWindowHandles();
		System.out.println(allwindow);
		for (String eachid : allwindow) {
			if(!parentid.equals(eachid)) {
				driver.switchTo().window(eachid);
			}
		}
		
		//driver.findElement(By.xpath("//button[@class='increment quantity-btn']")).click();
		
		driver.findElement(By.xpath("(//span[contains(text(),'Add To Cart')])[24]")).click();
		
}
}
