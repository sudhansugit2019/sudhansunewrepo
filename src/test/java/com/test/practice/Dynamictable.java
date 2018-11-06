package com.test.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamictable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		
		WebElement ch = driver.findElement(By.xpath(".//input[@id='a']"));
		ch.click();
		driver.switchTo().defaultContent();
		WebElement sp = driver.findElement(By.xpath(".//div[@class='card mb-3']/label/span"));
		System.out.println(sp.getText());
		
		
		driver.close();

	}

}
