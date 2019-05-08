package com.test.pacl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Sucharitha {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srini Raju V\\suchi workspace\\try\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	Thread.sleep(2000);
	//**driver.manage().window().maximize();**//
	TakesScreenshot t=(TakesScreenshot) driver;
	
	File src = t.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Srini Raju V\\Desktop\\suchi\\Git9Am_Apr22\\Screeenshot");
	FileUtils.copyFile(src, des);
	driver.quit();
	
	

}
}
