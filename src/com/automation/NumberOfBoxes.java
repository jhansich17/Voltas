package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NumberOfBoxes {

	static WebDriver appDriver;

	public static void main(String[] args) throws Exception {

		AutomationUtilities obj = new AutomationUtilities();

		appDriver = obj.openBrowser("chrome", "http://way2automation.com/way2auto_jquery/index.php");

		appDriver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		appDriver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("ajay0589");
		appDriver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("asdfghjkl");
		appDriver.findElement(By.xpath("//div[@id='login']//input[@class='button']")).click();

		int boxSize = appDriver.findElements(By.xpath("//div//ul//li//figure//img")).size();

		System.out.println("Number of boxes:" + boxSize);
		Thread.sleep(3000);

		appDriver.findElement(By.xpath("//img[contains(@src,'draggable')]")).click();

		Thread.sleep(3000);
		appDriver.switchTo().frame(2);

		WebElement draggableElement = appDriver.findElement(By.xpath("//div[@id='draggable']"));

		Thread.sleep(3000);

		Actions action = new Actions(appDriver);

		action.dragAndDropBy(draggableElement, 250, 150).build().perform();
	

	}

}
