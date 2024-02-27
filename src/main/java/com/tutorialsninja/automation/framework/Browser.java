package com.tutorialsninja.automation.framework;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.tutorialsninja.automation.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static Logger log = Logger.getLogger(Browser.class);

	public static void startBrowser() throws MalformedURLException {
		// String host = System.getProperty("seleniumHubHost");

		// if (System.getProperty("browser").equals("chrome")) {
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("start-maximized"); //
		// https://stackoverflow.com/a/26283818/1689770
		// options.addArguments("enable-automation"); //
		// https://stackoverflow.com/a/43840128/1689770
		// options.addArguments("--headless"); // only if you are ACTUALLY running
		// headless
		// options.addArguments("--no-sandbox"); //
		// https://stackoverflow.com/a/50725918/1689770
		// options.addArguments("--disable-infobars"); //
		// https://stackoverflow.com/a/43840128/1689770
		// options.addArguments("--disable-dev-shm-usage"); //
		// https://stackoverflow.com/a/50725918/1689770
		// options.addArguments("--disable-browser-side-navigation"); //
		// https://stackoverflow.com/a/49123152/1689770
		// options.addArguments("--disable-gpu");
		// options.addArguments("--window-size=1920,1080");
		// options.addArguments("--dns-prefetch-disable");
		// options.addArguments("--disable-gpu");
		// options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		// Base.driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"),
		// options);

		// }

		// if (System.getProperty("browser").equals("firefox")) {
		// FirefoxOptions options = new FirefoxOptions();
		// options.addArguments("start-maximized"); //
		// https://stackoverflow.com/a/26283818/1689770
		// options.addArguments("enable-automation"); //
		// https://stackoverflow.com/a/43840128/1689770
		// options.addArguments("--headless"); // only if you are ACTUALLY running
		// headless
		// options.addArguments("--no-sandbox"); //
		// https://stackoverflow.com/a/50725918/1689770
		// options.addArguments("--disable-infobars"); //
		// https://stackoverflow.com/a/43840128/1689770
		// options.addArguments("--disable-dev-shm-usage"); //
		// https://stackoverflow.com/a/50725918/1689770
		// options.addArguments("--disable-browser-side-navigation"); //
		// https://stackoverflow.com/a/49123152/1689770
		// options.addArguments("--disable-gpu");
		// options.addArguments("--window-size=1920,1080");
		// options.addArguments("--dns-prefetch-disable");
		// options.addArguments("--disable-gpu");
		// options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		// Base.driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"),
		// options);

		// }

		/*
		 * DesiredCapabilities dc = DesiredCapabilities.chrome();
		 * 
		 * if (System.getProperty("browser").equals("firefox"))
		 * dc = DesiredCapabilities.firefox();
		 * 
		 * String host = System.getProperty("seleniumHubHost");
		 * 
		 * Base.driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"),
		 * dc);
		 */

		String browser = Base.reader.getBrowser().toLowerCase();
		log.info("Selected Browser is: " + browser);
		switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.driver", "chromedriver93/chromedriver.exe");
				Base.driver = new ChromeDriver();
				log.info("Chrome Browser is Started" + Base.driver.hashCode());
				// return Base.driver;
		}

		/*
		 * case "ie":
		 * WebDriverManager.iedriver().setup();
		 * Base.driver = new InternetExplorerDriver();
		 * log.info("Internet Explorer Browser is Started" + Base.driver.hashCode());
		 * return Base.driver;
		 * 
		 * case "opera":
		 * WebDriverManager.operadriver().setup();
		 * Base.driver = new OperaDriver();
		 * log.info("Opera Browser is Started" + Base.driver.hashCode());
		 * return Base.driver;
		 * 
		 * case "htmlunit":
		 * Base.driver = new HtmlUnitDriver();
		 * log.info("HtmlUnit Browser is Started" + Base.driver.hashCode());
		 * return Base.driver;
		 * 
		 * default:
		 * WebDriverManager.firefoxdriver().setup();
		 * Base.driver = new FirefoxDriver();
		 * log.info("Firefox Browser is Started" + Base.driver.hashCode());
		 * return Base.driver;
		 */
	}

	public static void maximize() {
		Base.driver.manage().window().maximize();
	}

	public static byte[] takeScreenshot() {
		try {
			return ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.BYTES);
		} catch (Exception e) {
			log.info("Exception has Occured while taking screenshot");
			return null;
		}

	}
}
