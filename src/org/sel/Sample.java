package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtusername = driver.findElement(By.id("email"));
	txtusername.sendKeys("deepa");
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("13455");
	}

}
