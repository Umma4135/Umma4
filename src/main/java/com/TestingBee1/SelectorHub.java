package com.TestingBee1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorHub {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6l,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3l, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("umma");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kulsum123");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("EsteeLauder");
	   //Thread.sleep(3000);
	    WebElement frame = driver.findElement(By.tagName("iframe"));
		  List <WebElement>	totalFrame = driver.findElements(By.tagName("iframe"));
		    totalFrame.size();
		    System.out.println("total frame "+totalFrame.size());
		    WebElement scrollview = driver.findElement(By.xpath("//button[text()='Checkout here']"));
			
			JavascriptExecutor	 js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", scrollview);	
			//entering into iframe. 
			driver.switchTo().frame("pact");	

	   
	    
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("I love Tea");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("fish");
	    


	}

}
