package org.maven;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	@Test
	private void runin() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=11051242546834273989&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061892&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAiAgvKQBhBbEiwAaPQw3BHHltaTYB0db_FnYAmOBfXgcNz6K-C9IB_mCgnOyN93kRiLDOYZyBoCHtkQAvD_BwE");
		WebElement srch = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		srch.sendKeys("iphone 13");
		WebElement srcBtn = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		srcBtn.click();
		Thread.sleep(2000);
		List<WebElement> allPn = driver
				.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
		int count = 0;
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		for (WebElement phone : allPn) {

			String c = phone.getText();
			if (mp.containsKey(c)) {

				mp.put(c, count + 1);
			} else {
				mp.put(c, 1);

			}

		}
		System.out.println(mp);

	}

}
