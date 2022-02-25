package com.wallethubautomation.PageRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ReviewPageRepo

{
	
	
	@FindBy(xpath = "//span[text()='Select...']")
	private WebElement drpDown;

	@FindBy(xpath = "//li[text()='Health Insurance']")
	private WebElement hlthOption;

	@FindBy(xpath = "//textarea[@placeholder=\"Write your review...\"]")
	private WebElement rvwtxtBox;

	@FindBy(xpath = "//div[text()='Submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//div//h2")
	private WebElement rspMsg;


	@FindBy(xpath = "//div[text()='Continue']")
	private WebElement cntBtn;

	
	public WebElement getDrpDown() {
		return drpDown;
	}

	public WebElement getHlthIsrOpt() {
		return hlthOption;
	}

	public WebElement getRvwtxtBox() {
		return rvwtxtBox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getAwsMsg() {
		return rspMsg;
	}

	public WebElement getCntBtn() {
		return cntBtn;
	}
 }
