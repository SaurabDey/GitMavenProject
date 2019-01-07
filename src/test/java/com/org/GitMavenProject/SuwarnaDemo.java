package com.org.GitMavenProject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuwarnaDemo 
{
	
	

		//global variable
		int a=50;
		int b=60;
		static int c=60;    //static variable, no need to abject creation for calling purpose
		static int s=70;

		@Test
		public void variableClass()
		{
			int x=20;   //local variable
			//static int y=20;  
			System.out.println("CONST");	
		}
		@Test
		public void m1()
		{
			int y=90;    //local variable
			//static int u=90;
			System.out.println("M1 METHOD");
		}
		
	}
