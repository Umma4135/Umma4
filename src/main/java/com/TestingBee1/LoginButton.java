package com.TestingBee1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//button[text()='Home']")).click();
		String s = driver.getTitle();
		System.out.println(s);
		Assert.assertEquals(s,"Rahul Shetty Academy");
		
		driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
		String ss = driver.getTitle();
		System.out.println(ss);
		Assert.assertEquals(ss,"Rahul Shetty Academy");	
		
		

	

		
		
		
		Thread.sleep(3000);
		driver.quit();
	

}
}