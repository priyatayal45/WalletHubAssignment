package com.wallethubautomation.businesslogic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.wallethubautomation.common.PageRepoFactory;

public class ReviewPageBL 

{
	
	
	public void writereview(WebDriver driver,String review,WebDriverWait wait) throws InterruptedException
	{
	PageRepoFactory.reviewPageRepo(driver).getDrpDown().click();
	PageRepoFactory.reviewPageRepo(driver).getHlthIsrOpt().click();
	PageRepoFactory.reviewPageRepo(driver).getRvwtxtBox().sendKeys(review);
	PageRepoFactory.reviewPageRepo(driver).getSubmitBtn().click();
	wait.until(ExpectedConditions.textToBePresentInElement(PageRepoFactory.reviewPageRepo(driver).getAwsMsg(), "Awesome!"));
	PageRepoFactory.reviewPageRepo(driver).getCntBtn().click();
	}
}
