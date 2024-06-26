package com.testing.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Hello CDAC");
		
		WebElement button = driver.findElement(By.id("idOfButton"));
		button.click();

//		WebElement dblClk = driver.findElement(By.id("dblClkBtn"));
//		actions.doubleClick(dblClk).perform();
		
		WebElement male = driver.findElement(By.id("male"));
		male.click();
		
		
//		WebElement checkbox = driver.findElement(By.id("Automation"));
//		checkbox.click();
		
		
		WebElement img = driver.findElement(By.id("myImage"));
		WebElement box = driver.findElement(By.id("targetDiv"));
		actions.dragAndDrop(img, box);
		
	}

}
