package com.POM.Classes;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateReport{
	@FindBy(xpath="(//div[@class='i'])[2]")
	private WebElement createReport;
	
	@FindBy(xpath="(//a[@class='x-menu-item'])[2]")
	private WebElement overTime;
	
	@FindBy(xpath="(//input[@type='button'])[7]")
	private WebElement cancel;
	
public 	CreateReport(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void clickOnCreateReport()
{
	createReport.click();
	overTime.click();
	cancel.click();	
}
	
}
