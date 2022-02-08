package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement usrtxt = driver.findElement(By.name("email"));
		usrtxt.sendKeys("spk@gmail.com");
		String t1 = usrtxt.getAttribute("value");
		System.out.println(t1);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		WebElement passtxt = driver.findElement(By.name("pass"));
		passtxt.sendKeys("spk011");
		String t2 = passtxt.getAttribute("value");
		System.out.println(t2);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement button=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:30px solid red')", button);

	}
}
