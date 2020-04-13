package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	protected WebDriver driver;
	
	public void launchApp(String browser) {
		
		
		
			//To launch firefox BROWSER
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("http://demowebshop.tricentis.com/");
			
			}
			// TO launch Chrome Browser
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("http://demowebshop.tricentis.com/");
			}
       //to maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	
	// To Take Screenshot
				public void screenshot(String path) throws IOException
				{
					TakesScreenshot ts=((TakesScreenshot)driver);
					File Source=ts.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(Source,new File(path));
				}
	
	
}
