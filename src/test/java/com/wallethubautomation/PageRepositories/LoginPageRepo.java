package com.wallethubautomation.PageRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wallethubautomation.common.BaseClass;

public class LoginPageRepo {

	@FindBy(xpath = "//span[text()='Login']")
	WebElement LgnBtn;

	@FindBy(xpath = "//input[@name='em']")
	WebElement usrBtn;

	@FindBy(xpath = "//input[@name='pw']")
	WebElement pwdBtn;


	public WebElement getLgnBtn() {
		return LgnBtn;
	}

	public WebElement getUsrBtn() {
		return usrBtn;
	}

	public WebElement getPwdBtn() {
		return pwdBtn;
	}


}
