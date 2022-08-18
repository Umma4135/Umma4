package com.TestingBee1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClass1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(6000, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());	    //Last line
		Thread.sleep(3000l); // index number going to click
		driver.findElement(By.xpath("//input[@name='radioButton']")).click();
		driver.findElement(By.id("autocomplete")).clear();
		Thread.sleep(3000l);
		driver.findElement(By.id("autocomplete")).sendKeys("USA");
		Thread.sleep(3000l);
		driver.findElement(By.id("autocomplete")).clear();
		WebElement s = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select = new Select(s);//  Call Select class for Drop down.
		select.selectByVisibleText("Option1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id = 'checkBoxOption2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'confirmbtn']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement r = driver.findElement(By.xpath("//button[@id = 'mousehover']"));
		JavascriptExecutor je = (JavascriptExecutor)driver; 
		je.executeScript("arguments[0].scrollIntoView();", r);
		Actions action = new Actions(driver);
		action.moveToElement(r).perform();
		Thread.sleep(3000);
		WebElement w = driver.findElement(By.xpath("//*[contains(text(),'Reload')]"));
		action.moveToElement(w).click().perform();
	
		driver.quit();
		
		

	}

}
