package Day15TheorySelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebSite {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://output.jsbin.com/osebed/2");
	//to maximize the window
	driver.manage().window().maximize();
	//to get title
	String title=driver.getTitle();
	System.out.println(title);
	
	WebElement multids=driver.findElement(By.xpath("//select"));
	
	Select s= new Select(multids);
	
	s.selectByValue("apple");
	s.selectByVisibleText("Orange");
	s.selectByValue("orange");
	s.selectByValue("banana");
	s.selectByVisibleText("Grape");
	s.deselectByValue("orange");
	//to print all selected options
	List<WebElement> alloptions=s.getAllSelectedOptions();
	for (WebElement eachitem : alloptions) {
		System.out.println(eachitem.getText());
	}
	WebElement firstitem=s.getFirstSelectedOption();
System.out.println(firstitem.getText());
}
}
