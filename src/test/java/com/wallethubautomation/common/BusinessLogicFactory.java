package com.wallethubautomation.common;

import com.wallethubautomation.businesslogic.HomePageBL;
import com.wallethubautomation.businesslogic.LoginPageBL;
import com.wallethubautomation.businesslogic.ReviewPageBL;

public class BusinessLogicFactory

{
	static LoginPageBL loginpagebl;
	static HomePageBL homepagebl;
	static ReviewPageBL reviewpagebl;

	public static LoginPageBL loginpagebl() {
		return loginpagebl != null ? loginpagebl : new LoginPageBL();

	}

	public static HomePageBL homepagebl() {
		return homepagebl != null ? homepagebl : new HomePageBL();

	}

	public static ReviewPageBL reviewpagebl() {
		return reviewpagebl != null ? reviewpagebl : new ReviewPageBL();

	}

}
