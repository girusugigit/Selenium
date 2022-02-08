package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {
	public static void main(String[] args) {

		// Browser...... Setproperty(System is class and setproperty is staticmethod)

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGI\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		// to display the url(WebDriver is interface and ChromeDriver is child class-upcasting is used)
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
        //Displays the title of the url
		String title=driver.getTitle();
        System.out.println(title);
        
        //Displays the url itself
        String url=driver.getCurrentUrl();
        System.out.println(url);
        
        
        //closes the current tab
        driver.close();
	}

}
