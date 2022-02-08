package day14table;



import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Schools {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	driver.manage().window().maximize();
	
	String Title=driver.getTitle();
	System.out.println(Title);
	
	WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
	java.util.List<WebElement> rows=table.findElements(By.tagName("tr"));
	for (int i = 0; i < rows.size(); i++) {
		WebElement eachrow=rows.get(i);
		java.util.List<WebElement> headers=eachrow.findElements(By.tagName("th"));
		
		for (int j = 0; j < headers.size(); j++) {
			WebElement eachheader=headers.get(j);
			String text=eachheader.getText();
			System.out.println(text);
			
		}
		java.util.List<WebElement> datas=eachrow.findElements(By.tagName("td"));
		for (int j = 0; j < datas.size(); j++) {
			WebElement eachdata=datas.get(j);
			String datatxt=eachdata.getText();
			System.out.println(datatxt);
		}
	}
	
}
}
