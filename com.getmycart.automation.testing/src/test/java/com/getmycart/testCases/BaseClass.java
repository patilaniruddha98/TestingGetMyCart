package com.getmycart.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import com.getmycart.utilities.ReadConfig;

public class BaseClass {
	public static WebDriver driver;
	ReadConfig readConfig=new ReadConfig();
	public static Logger logger;
	public String baseUrl=readConfig.getUrl();
	public String uname=readConfig.getUsername();
	public String pword=readConfig.getPassword();
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		
		logger=Logger.getLogger("getmycart");
		PropertyConfigurator.configure("log4j.properties");
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readConfig.getChromeDriver());
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		}
		
	}
	
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		//Thread.sleep(40000);
		driver.close();
	}
	
	
	
	
	

}
