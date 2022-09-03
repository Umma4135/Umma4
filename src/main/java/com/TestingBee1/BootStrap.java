package com.TestingBee1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();			   
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		List <WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());}
		for (int i=0;i<list.size();i++)
			if (list.get(i).getAttribute("class").equalsIgnoreCase("active")){
				System.out.println(list.get(i).getText());
			}else {
				list.get(i).click();	
			
			
			
					
		}		
		Thread.sleep(3000);
		driver.quit();

		

}
}