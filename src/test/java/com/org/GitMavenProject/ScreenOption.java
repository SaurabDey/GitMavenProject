package com.org.GitMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScreenOption 
{
   
	WebDriver driver;
	 
   public ScreenOption(WebDriver driver2)
   {
	   driver=driver2;
   }
 
	public void clickOnScreen()
	{
		WebElement button=driver.findElement(By.id("show-settings-link"));
		button.click();
	}
	
}
