package com.test.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findelemen {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Seleniumjar\\geckodriver-v0.22.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/search?q=softwaretestingmaterial.com&cad=h");
		// Find Element
		WebElement findElement = driver.findElement(By.xpath("//h3[@class='LC20lb']"));
		
		String str = findElement.getText();
		System.out.println(str);
		
		//Find Elements
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement anc : list){
			System.out.println(anc.getText());
		}
		
	}

}
