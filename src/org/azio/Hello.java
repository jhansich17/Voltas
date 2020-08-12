package org.azio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hello {

	public static void main(String[] args) {

		System.out.println("hello");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajayj\\eclipse-workspace\\Voltas\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

	}

}
