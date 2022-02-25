package com.wallethubautomation.businesslogic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.wallethubautomation.PageRepositories.LoginPageRepo;
import com.wallethubautomation.common.BaseClass;
import com.wallethubautomation.common.PageRepoFactory;

public class LoginPageBL

{

	
	public void login(WebDriver driver) throws IOException
	{
		PageRepoFactory.loginPageRepo(driver).getLgnBtn().click();
		PageRepoFactory.loginPageRepo(driver).getUsrBtn().sendKeys(BaseClass.configReader("username"));
		PageRepoFactory.loginPageRepo(driver).getPwdBtn().sendKeys(BaseClass.configReader("password"));
		PageRepoFactory.loginPageRepo(driver).getLgnBtn().click();	
	}
	
	
	
}
