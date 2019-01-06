package com.org.GitMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumClass {
	
	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php?");
	}
	
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("user_login")).sendKeys("admin");
		
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		
		driver.findElement(By.id("wp-submit")).click();
		
		ScreenOption screen=new ScreenOption(driver);
		screen.clickOnScreen();
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
