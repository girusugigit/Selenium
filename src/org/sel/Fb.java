package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Fb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//downcasting-------higher to lower
		//child ref=(child)parent-ref
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement txt=driver.findElement(By.id("email"));
		//txt.sendkeys("greens")
		js.executeScript("arguments[0].setAttribute('value','greens')",txt);
		
		WebElement txtpass=driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','Password')", txtpass);
		
		WebElement btnlogin=driver.findElement(By.name("login"));
		//btnlogin.click()
		js.executeScript("arguments[0].click()",btnlogin);
		
		
	}
}
