package org.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {
	
	@SuppressWarnings("deprecation")
	@Test
	private void Sample() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement name = driver.findElement(By.xpath("//td[text()='Yoshi Tannamuri']//following::td"));
		System.out.println(name.getText());
		WebElement name2 = driver.findElement(By.xpath("//td[text()='Yoshi Tannamuri']//preceding::td[1]"));
		System.out.println(name2.getText());
	}
	

}
