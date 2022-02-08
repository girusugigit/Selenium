package Day15TheorySelect;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GlobalSqa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	
	driver.manage().window().maximize();
	
	String Title=driver.getTitle();
	System.out.println(Title);
	
	WebElement options=driver.findElement(By.xpath("//select"));
	
	Select s = new Select(options);
	s.selectByVisibleText("Andorra");
	s.selectByIndex(7);
	s.selectByValue("ALB");
	s.selectByValue("AGO");
	s.selectByVisibleText("Greece");
	List<WebElement> print=s.getOptions();
	for (WebElement eachitem1 : print) {
		System.out.println(eachitem1.getText());
	}
	
}


}
