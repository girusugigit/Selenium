package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBookConfig {
	public static void main(String[] args) throws AWTException {
		// Browser Configuration
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// get the url
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement textemail = driver.findElement(By.id("email"));
		//textemail.sendKeys("priyakumaravel");

		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys(textemail,"priyakumaravel").keyUp(Keys.SHIFT).build().perform();
		a.doubleClick(textemail).perform();
		a.contextClick(textemail).perform();
		Robot r = new Robot();
		
		for(int i =0;i<3;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		}
		

	}
}
