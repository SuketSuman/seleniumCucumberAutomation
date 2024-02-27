package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class DealsBackendSendingMailPage {
	
	public DealsBackendSendingMailPage() {
		
		 PageFactory.initElements(Base.driver,this);
	 }
  
	
	@FindBy(xpath="//*[@id=\"id_subject\"]")
	public static WebElement subject;
	
	@FindBy(xpath="//*[@id=\"id_locations_from\"]/option")
	public static WebElement firstProperty;
	
	@FindBy(xpath="//*[@id=\"id_locations_add_link\"]")
	public static WebElement addPropertyArrow;
	
	@FindBy(xpath="//*[@id=\"mailer_form\"]/div[1]/div/div/button[1]")
	public static WebElement save;
	
	@FindBy(xpath="//*[@id=\"id_locations_from\"]")
	public static WebElement propertyDropBox;
	
	@FindBy(xpath="//*[@id=\"suit-center\"]/div[1]")
	public static WebElement emailAlertBox;
	
	
}
