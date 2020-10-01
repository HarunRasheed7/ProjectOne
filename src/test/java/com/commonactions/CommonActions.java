package com.commonactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CommonActions {
	public static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver84.exe");
		driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void select(WebElement e) {
		e.click();
	}
	
	public void mouseOver(WebElement e) {
		Actions acc=new Actions(driver);
		acc.moveToElement(e).build().perform();;
	}
	

}
