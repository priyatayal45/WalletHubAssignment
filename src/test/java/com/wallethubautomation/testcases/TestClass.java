package com.wallethubautomation.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wallethubautomation.common.BaseClass;
import com.wallethubautomation.common.BusinessLogicFactory;
import com.wallethubautomation.common.PageRepoFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass extends BaseClass {
	WebDriverWait wait;
	WebDriver driver;
	String ReviewCmmt;
	JavascriptExecutor js;

	@Test(priority = 0)
	public void starSelectTest() throws InterruptedException, IOException {
		ReviewCmmt = "WalletHub is a worthwhile service for receiving a free credit report and daily credit score from TransUnion. It offers educational information about personal credit (but not as much editorial content as NerdWallet), and the targeting advertising is useful and relevant.";
		driver = BaseClass.driverSetUp();
		js = (JavascriptExecutor) driver;
		driver.get(BaseClass.configReader("url"));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 3000);
		BusinessLogicFactory.loginpagebl().login(driver);
		BusinessLogicFactory.homepagebl().selectRvwStar(driver, js);
		Assert.assertEquals(PageRepoFactory.homePageRepo(driver).getStr().getAttribute("aria-checked"), "true");
		BusinessLogicFactory.homepagebl().clickStr(driver);
	}

	@Test(priority = 1)
	public void verifyReviewComment() throws InterruptedException {
		BusinessLogicFactory.reviewpagebl().writereview(driver, ReviewCmmt, wait);
		BusinessLogicFactory.homepagebl().getComment(driver, ReviewCmmt, js);
		Assert.assertEquals(PageRepoFactory.homePageRepo(driver).getRvwTxt().getText(), ReviewCmmt);
		BaseClass.driverClose();
	}

}
