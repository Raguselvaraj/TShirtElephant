package com.tShirt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class TShirtFinal extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("GOOgle");
		launchUrl("http://www.tshirtelephant.com/");
		BaseClass b=new BaseClass();
		TShirt1 shirt=new TShirt1();
		b.isDisplayed(shirt.getAppLogo());
		b.isDisplayed(shirt.getCountryFlag());
		b.isDisplayed(shirt.getContact_number());
		b.isDisplayed(shirt.getEmailId());
		b.isDisplayed(shirt.getSignIn());
		b.isDisplayed(shirt.getStarted());
		b.isDisplayed(shirt.getProducts());
		b.isDisplayed(shirt.getServices());
		b.isDisplayed(shirt.getAbout());
		b.isDisplayed(shirt.getDesignNow());
		b.isDisplayed(shirt.getContactNow());
		b.isDisplayed(shirt.gettShirts());
		b.isDisplayed(shirt.getSportsJersey());
		b.isDisplayed(shirt.getMadeInCanada());
		b.isDisplayed(shirt.getTankTops());
		b.isDisplayed(shirt.getPerformance());
		b.isDisplayed(shirt.getWomen());
		b.isDisplayed(shirt.getHats());
		b.isDisplayed(shirt.getFollowOnInstagram());
		b.isDisplayed(shirt.getCustomTShirts());
		b.isDisplayed(shirt.getGetStartedBelowCustom());
		b.isDisplayed(shirt.getCustomersSaying());
		b.isDisplayed(shirt.getPlacingOrder());
		b.isDisplayed(shirt.getGetInTouch());
		b.isDisplayed(shirt.getAddress());
		
		

	}

}
