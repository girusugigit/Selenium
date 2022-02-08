package org.sel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	Options d = driver.manage();
	Window w = d.window();
	w.maximize();
	
	WebElement textbox = driver.findElement(By.name("q"));
	textbox.sendKeys("greens velmurugan");
	
    driver.findElement(By.className("gNO89b")).click();
    
    driver.findElement(By.xpath("//h3[contains(text(),'Velmurugan K - Technical Manager')]")).click();
	
	}
}

