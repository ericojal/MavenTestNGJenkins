package com.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {

	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eric\\Desktop\\com.MavenTestNGJenkins\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
