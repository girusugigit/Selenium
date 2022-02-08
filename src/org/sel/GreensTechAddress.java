package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreensTechAddress {
	WebDriver driver;
	
	public GreensTechAddress() {
		super();
		this.driver =  CustomChromeDriver.getDriver("http://www.greenstechnologys.com/");;
	}
	
	public String getAddress(String element)
	{
		WebElement address = driver.findElement(By.xpath(element));
		return address.getText();
		
	}

	public static void main(String[] args) {
		GreensTechAddress g = new GreensTechAddress();
		System.out.println("Adayar : " + g.getAddress("(//p)[6]"));
		System.out.println("Navalur : " + g.getAddress("(//p)[9]"));
		System.out.println("Tambaram : " + g.getAddress("(//p)[8]"));
		System.out.println("Perumbakkam : " + g.getAddress("(//p)[11]"));
		System.out.println("Porur : " + g.getAddress("(//p)[10]"));

	}
}
