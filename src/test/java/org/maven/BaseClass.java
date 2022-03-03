package org.maven;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	public void loadUrl(String url) {
		driver.get(url);

	}

	public void type(WebElement element, String data) {
		element.sendKeys("anto");

	}

	public void click(WebElement element) {
		element.click();

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getAttribute(WebElement element, String name) {
		String attribute = element.getAttribute("name");
		return attribute;

	}

	public void closeAll() {
		driver.quit();

	}

	public void closeCurrentWin() {
		driver.close();
	}

	public String CurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String titleGet() {
		String title = driver.getTitle();
		return title;

	}

	public void VisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	private void attributeValue(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue("value");

	}

	public void index(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void jsTextBox(String name, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','sherwin')", element);

	}

	public void jsClick(WebElement element, String name) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click())", element);

	}

	public WebElement findElementId(WebElement element, String id) {
		WebElement element2 = element.findElement(By.id("url"));
		return element2;

	}

	public TakesScreenshot screenShotAs() {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		return screenShot;

	}

	public void context() {
		Actions action = new Actions(driver);
		action.click();
	}

	public Alert alertSwitch() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	private void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	private void sendKeys(String name) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("anto");
		alert.accept();
	}

	private void moveTo(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void draganddrop(WebElement element, WebElement element1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element1).perform();
	}

	private String windowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}

	private Set<String> windowHandles(String name) {
		Set<String> l = driver.getWindowHandles();
		return l;

	}

	public List<WebElement> option(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public List<WebElement> allop(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;

	}

	public void deselect(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public WebElement firstSelect(WebElement element) {
		Select select = new Select(element);
		WebElement k = select.getFirstSelectedOption();
		return k;
	}

	public boolean multiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public void navigaterefresh() {
		driver.navigate().refresh();
	}

	public void navigateback() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void navigate(String url) {
		driver.navigate().to(url);
	}

	public void defaultframe() {
		driver.switchTo().defaultContent();
	}

	public void action(WebElement element, String name) {
		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys(element, name).keyUp(Keys.SHIFT).perform();
	}

	public void doubleclick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void frame(int index) {
		driver.switchTo().frame(index);
	}

	public void frameid(String name) {
		driver.switchTo().frame(name);
	}

	public void FrameElement(WebElement element) {
		driver.switchTo().frame(element);
	}

}