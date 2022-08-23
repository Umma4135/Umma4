package com.TestingBee1;

import java.awt.desktop.SystemSleepEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBank {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[text()='Register']")).click();
		//Assertion 
		String Actual=driver.findElement(By.xpath("//h1[@class='title']")).getText();  //actual result
		System.out.println(Actual);
		String Expected="Signing up is easy!";
		System.out.println(Expected);
		Assert.assertEquals(Actual, Expected);
		
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("umma");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("kulsum");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("3215 Bellaire place" );
		driver.findElement(By.xpath("//input[@name='customer.address.city']")).sendKeys("philadelphia");
		driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("pennsylvania");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("19020");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("215 245 7904");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("157 84 5600");
		driver.findElement(By.xpath("//input[@name='customer.username']")).sendKeys("umma4136");
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("abcd124");
		driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("confirm");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(4000);
		
		
		driver.quit();
		
		

	}

}
