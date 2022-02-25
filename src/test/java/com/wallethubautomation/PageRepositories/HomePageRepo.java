package com.wallethubautomation.PageRepositories;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageRepo

{

	@FindBy(xpath = "//span[text()=' Your Review']")
	WebElement usrrvw;

	@FindBy(xpath = "//button[text()='edit']")
	WebElement editBtn;

	@FindBy(xpath = "//textarea[@name=\"reviewcomment\"]")
	WebElement rvwCmmt;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement submtBtn;

	@FindBy(xpath = "(//div[@class=\"rvtab-ci-avatar\"]/img)[1]")
	WebElement img;

	@FindBy(xpath = "//review-star[@class=\"rvs-svg\"]//div//*[local-name() = 'svg'][4]")
	WebElement str;

	@FindBy(xpath = "(//button[text()='edit']//following-sibling:: div)[1]")
	WebElement rvwTxt;

	public WebElement getRvw() {
		return usrrvw;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getRvwCmmt() {
		return rvwCmmt;
	}

	public WebElement getSubmtBtn() {
		return submtBtn;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getStr() {
		return str;
	}

	public WebElement getRvwTxt() {
		return rvwTxt;
	}

	public static List getElements(String parameter, WebDriver driver) {
		List Elements = null;
		switch (parameter) {
		case "yourreview":
			Elements = driver.findElements(By.xpath("//span[text()=' Your Review']"));
			break;
		}
		return Elements;
	}

	public static By getLocator(String element, WebDriver driver, String parameter) {
		By by = null;
		switch (element) {
		case "userid": {
			by = By.xpath("//span[text()=\"" + parameter + "\"]");
			break;
		}
		case "img": {
			by = By.xpath("//div[@class=\"rvtab-ci-avatar\"]/img)[1]");
			break;
		}
		}
		return by;

	}

}
