package com.TestingBee1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;              //umma

public class Selenium_drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(6000l,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.tagName("iframe"));
		List< WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		totalframe.size();
		System.out.println(totalframe.size());
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Target = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions ac = new Actions(driver);
        ac.dragAndDrop(source, Target).build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@href='http://jqueryui.com/draggable/']")).click();
        Thread.sleep(3000);
        driver.close();
       // driver.quit();
	}

}
