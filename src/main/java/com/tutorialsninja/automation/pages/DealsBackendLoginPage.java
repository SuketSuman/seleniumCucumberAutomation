package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class DealsBackendLoginPage {

	public DealsBackendLoginPage() {

		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath = "//*[@id=\"id_username\"]")
	public static WebElement emailAddress;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[4]/div/div[1]/label/span")
	public static WebElement nonStop;

	@FindBy(xpath = "//*[@id=\"id_password\"]")
	public static WebElement password;

	@FindBy(xpath = "//*[@id=\"login-form\"]/div[4]/input")
	public static WebElement loginButton;

	@FindBy(xpath = "//*[@id=\"listing-id\"]/div/div[2]/div/div[1]")
	public static WebElement firstCard;

	@FindBy(xpath = "//*[@id=\"listing-id\"]/div/div[2]/div/div[1]//button")
	public static WebElement bookNowButton;
}
