package com.test.practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class geckoDriver {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "D:\\Seleniumjar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		/*driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
		
		WebElement button = driver.findElement(By.xpath(".//button[@id='idOfButton']"));
		//button.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);

		
		WebElement textBox = driver.findElement(By.xpath(".//input[@id='fname']"));
		textBox.sendKeys("test");
		//js.executeScript("document.getElementById('').value='fssd';");
		
		System.out.println(textBox.getAttribute("value"));
		
		WebElement select = driver.findElement(By.xpath(".//select[@id='testingDropdown']"));
		Select sel = new Select(select);
		List<WebElement> li = sel.getOptions();
		
		Iterator<WebElement> itr = li.iterator();
		while(itr.hasNext()){
			WebElement str = itr.next();
			System.out.println(str.getText());
			
			if(str.getText().contains("Manual Testing")){
				str.click();
			}
		}*/
		driver.get("https://www.hdfcbank.com/");
		WebElement drop = driver.findElement(By.xpath(".//div[@class='selectedvalue']/../div/"));
		drop.click();
		List<WebElement> li = driver.findElements(By.tagName("ul/li"));
		for(int i=0; i<li.size();i++){
			System.out.println(li.get(i).getText());
		}
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
