package org.maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTest {
	
	static WebDriver driver;
	
	
	@BeforeClass
	public static void beforeClass() { //1
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		
	}
	
	@AfterClass
	public static void afterClass() {  //5

		System.out.println("End");
	}
	
	@Before
	public void befMethod() throws InterruptedException {  //2

		long millis = System.currentTimeMillis();
		System.out.println(millis);
		Thread.sleep(1000);
	}
	
	@After
	public void aftMethod() {   //4

		long millis = System.currentTimeMillis();
		System.out.println(millis);
		
	}
	
	@Test
	public void testing() throws InterruptedException {  //3

		WebElement txt = driver.findElement(By.xpath("//*[@id=\"loginEmailId\"]"));
		WebElement pswd = driver.findElement(By.xpath("//*[@id=\"loginPassword\"]"));
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"profile\"]/div/form/div[3]/div[2]/input"));
		txt.sendKeys("Pradeep");
		pswd.sendKeys("hjui");
		btn.click();
	}

	
	
}
