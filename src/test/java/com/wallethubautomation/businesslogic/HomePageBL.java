package com.wallethubautomation.businesslogic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.wallethubautomation.common.BaseClass;
import com.wallethubautomation.common.PageRepoFactory;

public class HomePageBL

{
	public void selectRvwStar(WebDriver driver, JavascriptExecutor js) throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		Actions action = new Actions(driver);
		String userid = BaseClass.configReader("username").replaceAll("@gmail.com", "");
		wait.until(ExpectedConditions
				.presenceOfElementLocated(PageRepoFactory.homePageRepo(driver).getLocator("userid", driver, userid)));
		js.executeScript("window.scrollBy(0,1000);");
		if (PageRepoFactory.homePageRepo(driver).getElements("yourreview", driver).size() != 0) {
			PageRepoFactory.homePageRepo(driver).getEditBtn().click();
			PageRepoFactory.homePageRepo(driver).getRvwCmmt().sendKeys(Keys.chord(Keys.CONTROL, "a"));
			PageRepoFactory.homePageRepo(driver).getRvwCmmt().sendKeys(Keys.DELETE);
			PageRepoFactory.homePageRepo(driver).getSubmtBtn().click();
			wait.until(ExpectedConditions
					.presenceOfElementLocated(PageRepoFactory.homePageRepo(driver).getLocator("img", driver, null)));
			driver.navigate().refresh();
			js.executeScript("window.scrollBy(0,350);");
		}
		action.moveToElement(PageRepoFactory.homePageRepo(driver).getStr()).build().perform();	
	}

	public void clickStr(WebDriver driver)
	{
		PageRepoFactory.homePageRepo(driver).getStr().click();
	}
	
	public void getComment(WebDriver driver, String text, JavascriptExecutor js) {
		js.executeScript("arguments[0].scrollIntoView(true);", PageRepoFactory.homePageRepo(driver).getRvw());
	}
}
