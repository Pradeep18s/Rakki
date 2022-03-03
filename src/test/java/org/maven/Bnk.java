package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bnk {
	
	@Test
	private void runin() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.metrobankonline.co.uk/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement BtnLogin = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/button/span[1]"));
		
		js.executeScript("arguments[0].click()",BtnLogin);
		
		WebElement Login = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/button/span[1]/html/body/div[1]/header/div/div[5]/ul/li[1]/a"));
		js.executeScript("arguments[0].click()",Login);
		
		
	}
}
