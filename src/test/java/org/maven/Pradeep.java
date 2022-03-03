package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pradeep {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("pradeep prabu v");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("gfygiuhijib");
		
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	}
	
	
}
