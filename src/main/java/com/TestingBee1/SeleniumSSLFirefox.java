package com.TestingBee1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSSLFirefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.MILLISECONDS);
		 driver.manage().timeouts().implicitlyWait(5000l, TimeUnit.MILLISECONDS);
		//driver.get("https://expire.badssl.com/");
		 driver.get("https://google.com");
		

	}

}
