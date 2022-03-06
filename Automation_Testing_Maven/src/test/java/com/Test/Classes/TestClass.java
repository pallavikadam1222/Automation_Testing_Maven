package com.Test.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.Classes.CreateReport;
import com.POM.Classes.CreateTasks;
import com.POM.Classes.LoginPage;
import com.POM.Classes.LogoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	//changed with pallu_2022
		WebDriver driver;
		
		@BeforeMethod
		public void beforeMethod()
		{
			
			WebDriverManager.chromedriver().setup();
			this.driver = new ChromeDriver();
			this.driver.manage().window().maximize();
			this.driver.get("http://localhost/login.do");
			LoginPage loginPage = new LoginPage(this.driver);
			loginPage.sendLoginDetails();
		}
		
		@Test
		public void testCreateReport()
		{
			CreateReport createreport =new CreateReport(driver);
			createreport.clickOnCreateReport();
		}
		@Test
		public void testCreateTask()
		{
			CreateTasks createtasks =new CreateTasks(driver);
			createtasks.ClickOnCreateTaskTab();
		}
		

	@AfterMethod
	public void aftermethod() {
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.ClickOnLogout();
	}

	}


