package org.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebT {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement tble = driver.findElement(By.xpath("//*[@id=\"customers\"]"));
		String text = tble.getText();
//		System.out.println(text);
		
		List<WebElement> elements = tble.findElements(By.tagName("td"));
		for (int i = 0; i < elements.size(); i++) {
			
			WebElement ele = elements.get(i);
			String text2 = ele.getText();
			System.out.println(text2);
			
		}
		
		
		
	}
}
