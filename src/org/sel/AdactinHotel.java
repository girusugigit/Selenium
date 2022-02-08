package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		//Options o =driver.manage();
		//Window w =o.window();
		driver.manage().window().maximize();
		
		WebElement usertab = driver.findElement(By.id("username"));
		usertab.sendKeys("spk@gmail.com");
		String t1=usertab.getAttribute("id");
		System.out.println(t1);
		
		WebElement pwdtab = driver.findElement(By.xpath("//input[@type='password']"));
		pwdtab.sendKeys("vbncm123");
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='Submit']"));
		submit.click();
		
		
		
	}
}
