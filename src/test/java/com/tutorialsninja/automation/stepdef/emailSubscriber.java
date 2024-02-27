package com.tutorialsninja.automation.stepdef;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.DealsBackendLoginPage;
import com.tutorialsninja.automation.pages.DealsBackendSendingMailPage;

import cucumber.api.java.en.*;

public class emailSubscriber {
	private static Logger log = Logger.getLogger(emailSubscriber.class);
	DealsBackendLoginPage dealsBackendLoginPage = new DealsBackendLoginPage();
	DealsBackendSendingMailPage dealsBackendSendingMailPage = new DealsBackendSendingMailPage();

	@Given("^I Book a non-stop flight with lowest price$")
	public void i_launch_the_deals_backend_page() throws Throwable {

		Base.driver.get(
				"https://www.makemytrip.com/flight/search?itinerary=DEL-BHO-08/12/2023&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		Elements.click(DealsBackendLoginPage.nonStop);
		Elements.click(DealsBackendLoginPage.bookNowButton);

	}

	@Given("^I Login$")
	public void i_Login() throws Throwable {
		Elements.TypeTextIfElementPresent(DealsBackendLoginPage.emailAddress, "suket@houzen.co.uk");
		Elements.TypeTextIfElementPresent(DealsBackendLoginPage.password, "agent123");
		Elements.click(DealsBackendLoginPage.loginButton);
	}

	@When("^I provide email subject$")
	public void i_provide_email_subject() throws Throwable {
		Elements.TypeTextIfElementPresent(DealsBackendSendingMailPage.subject,
				"Houzen - your new investment opportunities are in");
	}

	@When("^I choose (\\d+) properties$")
	public void i_choose_properties(int arg1) throws Throwable {
		Elements.click(DealsBackendSendingMailPage.firstProperty);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);

		Elements.scrollDownVertically();

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);

		Elements.scrollDownVertically();

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);

		Elements.scrollDownVertically();

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);

		Elements.scrollDownVertically();

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);

		Elements.click(DealsBackendSendingMailPage.addPropertyArrow);

	}

	@When("^click save$")
	public void click_save() throws Throwable {
		Elements.click(DealsBackendSendingMailPage.save);

	}

	@Then("^subscriber should get their email$")
	public void subscriber_should_get_their_email() throws Throwable {

		String s = Elements.getText(DealsBackendSendingMailPage.emailAlertBox);
		System.out.println(s);

	}

}
