package org.sel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	Options o =driver.manage();
	Window w = o.window();
	w.maximize();
	
	//String title = driver.getTitle();
	//System.out.println(title);
	
	
	
	WebElement FromText = driver.findElement(By.id("src"));
	FromText.sendKeys("Chennai");
	
	WebElement ToField = driver.findElement(By.id("dest"));
	ToField.sendKeys("Bangalore");
	
	
	
	WebElement date = driver.findElement(By.id("onward_cal"));
	date.sendKeys("23-Dec-2021");
	
	//WebElement datepick = driver.findElement(By.id("onward_cal"));
	//datepick.click();
	
	WebElement search = driver.findElement(By.id("search_btn"));
	search.click();
	
}
}
