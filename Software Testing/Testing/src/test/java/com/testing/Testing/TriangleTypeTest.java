package com.testing.Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TriangleTypeTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to your chromedriver executable
    	WebDriverManager.chromedriver().clearDriverCache().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dac\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Open the HTML file
        driver.get("http://192.168.40.24:5500/Triangle%20Page/triangle.html");
    }

    @Test
    public void testEquilateralTriangle() {
        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));
        WebElement num3 = driver.findElement(By.id("num3"));
        WebElement submitButton = driver.findElement(By.id("btn"));
        WebElement output = driver.findElement(By.id("output"));

        // Input values for an equilateral triangle
        num1.clear();
        num1.sendKeys("5");
        num2.clear();
        num2.sendKeys("5");
        num3.clear();
        num3.sendKeys("5");
        submitButton.click();

        // Verify the output
        String result = output.getText();
        Assert.assertTrue(result.contains("Equilateral Triangle"), "Expected Equilateral Triangle but got: " + result);
    }

    @Test
    public void testIsoscelesTriangle() {
        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));
        WebElement num3 = driver.findElement(By.id("num3"));
        WebElement submitButton = driver.findElement(By.id("btn"));
        WebElement output = driver.findElement(By.id("output"));

        // Input values for an isosceles triangle
        num1.clear();
        num1.sendKeys("5");
        num2.clear();
        num2.sendKeys("5");
        num3.clear();
        num3.sendKeys("8");
        submitButton.click();

        // Verify the output
        String result = output.getText();
        Assert.assertTrue(result.contains("Isosceles Triangle"), "Expected Isosceles Triangle but got: " + result);
    }

    @Test
    public void testScaleneTriangle() {
        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));
        WebElement num3 = driver.findElement(By.id("num3"));
        WebElement submitButton = driver.findElement(By.id("btn"));
        WebElement output = driver.findElement(By.id("output"));

        // Input values for a scalene triangle
        num1.clear();
        num1.sendKeys("3");
        num2.clear();
        num2.sendKeys("4");
        num3.clear();
        num3.sendKeys("5");
        submitButton.click();

        // Verify the output
        String result = output.getText();
        Assert.assertTrue(result.contains("Right Angled Triangle"), "Expected Right Angled Triangle but got: " + result);
    }

    @Test
    public void testNonTriangle() {
        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));
        WebElement num3 = driver.findElement(By.id("num3"));
        WebElement submitButton = driver.findElement(By.id("btn"));
        WebElement output = driver.findElement(By.id("output"));

        // Input values that cannot form a triangle
        num1.clear();
        num1.sendKeys("1");
        num2.clear();
        num2.sendKeys("2");
        num3.clear();
        num3.sendKeys("3");
        submitButton.click();

        // Verify the output
        String result = output.getText();
        Assert.assertTrue(result.contains("Cannot Form a triangle"), "Expected Cannot Form a triangle but got: " + result);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    public static void main(String[] args) {
    	
    	TriangleTypeTest test = new TriangleTypeTest();
    	
    	test.setUp();
    	test.testEquilateralTriangle();
//    	test.testIsoscelesTriangle();
//    	test.testScaleneTriangle();
//    	test.testNonTriangle();
//    	test.tearDown();
	}
    
}
