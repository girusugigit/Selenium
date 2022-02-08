package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopClues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shopclues.com/wholesale.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'Mobiles & More')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Nokia')]")).click();

	}
}
