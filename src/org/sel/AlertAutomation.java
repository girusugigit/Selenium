package org.sel;

import org.openqa.selenium.Alert;
import org.sel.AlertAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.server.HelpFlags;

public class AlertAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		WebElement simplealert = driver.findElement(By.xpath("//a[text()=\"Alert with OK \"]"));
		simplealert.click();

		driver.findElement(By.xpath("(//button[contains(text(),'display')])[1]")).click();

		Alert a = driver.switchTo().alert();
		String t1 = a.getText();
		System.out.println(t1);
		// simple alert
		a.accept();

		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();

		Alert b = driver.switchTo().alert();

		String t2 = b.getText();
		System.out.println(t2);

		// confirm alert
		// b.accept();
		b.dismiss();

		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();

		WebElement txt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		txt.click();

		Alert c = driver.switchTo().alert();

		String t3 = c.getText();
		System.out.println(t3);

		// prompt alert
		c.sendKeys("sugi");
		c.accept();

	}
}
