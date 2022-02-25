package com.wallethubautomation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.wallethubautomation.PageRepositories.HomePageRepo;
import com.wallethubautomation.PageRepositories.LoginPageRepo;
import com.wallethubautomation.PageRepositories.ReviewPageRepo;

public class PageRepoFactory

{

	static LoginPageRepo loginpagerepo;
	static HomePageRepo homepagerepo;
	static ReviewPageRepo reviewpagerepo;

	public static LoginPageRepo loginPageRepo(WebDriver driver) {
		if (loginpagerepo == null)
			loginpagerepo = PageFactory.initElements(driver, LoginPageRepo.class);
		return loginpagerepo;
	}

	public static HomePageRepo homePageRepo(WebDriver driver) {
		if (homepagerepo == null)
			homepagerepo = PageFactory.initElements(driver, HomePageRepo.class);
		return homepagerepo;
	}

	public static ReviewPageRepo reviewPageRepo(WebDriver driver) {
		if (reviewpagerepo == null)
			reviewpagerepo = PageFactory.initElements(driver, ReviewPageRepo.class);
		return reviewpagerepo;
	}
}
