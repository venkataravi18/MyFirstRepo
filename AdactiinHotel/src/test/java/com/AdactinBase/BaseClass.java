package com.AdactinBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	 public static void launchbrowser(String browser,String url) {
		if(browser.equalsIgnoreCase("Chrome")) {
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver =new FirefoxDriver();
		}
		else {
			System.out.println("enter valid browser");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
	public static void passByValueOnTextBox(WebElement e,String value){
			e.clear();
			e.sendKeys(value);
			
			
		}
		
	}

}
