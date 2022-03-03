package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseee {

	static WebDriver driver;
	public Select select;
	
	static String loctn = "C:\\Users\\Praveena\\eclipse-workspace\\Framework\\spread\\addact.xlsx";

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public void click(WebElement element) {
		element.click();

	}

	public void typeJS(WebElement ele, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", ele);
	}

	public void selectOptionByVisibleText(WebElement e, String s) {

		select = new Select(e);
		select.selectByVisibleText(s);

	}

	public WebElement findElementId(String id) {
		WebElement element2 = driver.findElement(By.id(id));
		return element2;

	}

	public String getInsertedText(WebElement e) {

		String s = e.getAttribute("value");
		return s;

	}

	public WebElement findElemx(String s) {

		WebElement element = driver.findElement(By.xpath(s));
		return element;
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);

	}
	
	public static void alert() {

		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	
	

	public String getData(String sheetName, int rowN, int cellN) throws IOException {

		String data = null;
		File file = new File(loctn);
		FileInputStream stream = new FileInputStream(file);
		Workbook wrkb = new XSSFWorkbook(stream);
		Sheet sheet = wrkb.getSheet(sheetName);
		Row row = sheet.getRow(rowN);
		Cell cell = row.getCell(cellN);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			data = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateForm = new SimpleDateFormat("dd-MMM-yy");
				data = dateForm.format(date);
			} else {
				double Numeric = cell.getNumericCellValue();
				BigDecimal value = BigDecimal.valueOf(Numeric);
				data = value.toString();
			}
			break;

		default:
			break;
		}

		return data;

	}

	public void updateData(String s, int rowN, int cellN, String old, String nw) throws IOException {

		File file = new File(loctn);
		FileInputStream stream = new FileInputStream(file);
		Workbook wrkb = new XSSFWorkbook(stream);
		Sheet sheet = wrkb.getSheet(s);
		Row row = sheet.getRow(rowN);
		Cell cell = row.getCell(cellN);
		String data = cell.getStringCellValue();
		if (data.equals(old)) {
			cell.setCellValue(nw);
		}
		FileOutputStream out = new FileOutputStream(file);
		wrkb.write(out);

	}

	public void writeData(String s, int rowN, int cellN, String data) throws IOException {

		File file = new File(loctn);
		FileInputStream stream = new FileInputStream(file);
		Workbook wrkb = new XSSFWorkbook(stream);
		Sheet sheet = wrkb.getSheet(s);
		Row row = sheet.getRow(rowN);
		Cell cell = row.createCell(cellN);
		cell.setCellValue(data);
		FileOutputStream o = new FileOutputStream(file);
		wrkb.write(o);

	}

}
