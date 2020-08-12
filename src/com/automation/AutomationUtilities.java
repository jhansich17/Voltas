package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationUtilities {

	WebDriver driver;

	public WebDriver openBrowser(String browserName, String url) {

		switch (browserName) {
		case "chrome":

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ajayj\\eclipse-workspace\\Voltas\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			break;
		case "firefox":
			break;
		case "ie":
			break;
		default:
			System.out.println("Enter correct browser name");
			break;
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
