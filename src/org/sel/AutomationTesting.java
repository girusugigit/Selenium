package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement fulnametxt = driver.findElement(By.xpath("//input[@placeholder = 'First Name']"));
		fulnametxt.sendKeys("sugi");

		WebElement Lastnametxt = driver.findElement(By.xpath("//input[@placeholder = 'Last Name']"));
		Lastnametxt.sendKeys("giru");

		WebElement addresstxt = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		addresstxt.sendKeys("15019 edindale dr");

		Thread.sleep(3000);

		WebElement emailtxt = driver.findElement(By.xpath("//input[@type = 'email']"));
		emailtxt.sendKeys("spk@gmail.com");

		Thread.sleep(3000);
		WebElement phonetxt = driver.findElement(By.xpath("//input[@type='tel']"));
		phonetxt.sendKeys("860-790-7280");

		Thread.sleep(3000);

		WebElement radbtn = driver.findElement(By.xpath("(//input[@type =\"radio\"])[2]"));
		radbtn.click();

		Thread.sleep(3000);

		WebElement checkbx1 = driver.findElement(By.xpath("(//input[@type = \"checkbox\"])[1]"));
		checkbx1.click();

		Thread.sleep(3000);

		WebElement checkbx2 = driver.findElement(By.xpath("(//input[@type = \"checkbox\"])[2]"));
		checkbx2.click();

		Thread.sleep(3000);

		WebElement checkbx3 = driver.findElement(By.xpath("(//input[@type = \"checkbox\"])[3]"));
		checkbx3.click();

		Thread.sleep(2000);

		WebElement langtxt = driver.findElement(By.id("msdd"));
		langtxt.click();

		Actions a = new Actions(driver);
		a.moveToElement(langtxt).perform();

		WebElement langtxt2 = driver.findElement(By.xpath("//a[text()='English']"));
		langtxt2.click();

		WebElement cl = driver.findElement(By.className("ng-scope"));
		cl.click();

		WebElement skilltsk = driver.findElement(By.id("Skills"));
		skilltsk.click();

		a.moveToElement(skilltsk).perform();
		
		driver.findElement(By.xpath("//option[@value='C++']")).click();
		
		driver.findElement(By.className("ng-scope ")).click();

	}
}
