package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select select = new Select(element);
		
		File file = new File("C:\\Users\\Praveena\\eclipse-workspace\\Framework\\spread\\it.xlsx");
		
		Workbook workbook = new XSSFWorkbook();

		Sheet sheet = workbook.createSheet("SheetTest");
		
		List<WebElement> DdnList = select.getOptions();
		for (int i = 0; i < DdnList.size(); i++) {

			WebElement element2 = DdnList.get(i);
			String opt = element2.getText();
			System.out.println(opt);
			
			Row row=sheet.createRow(i);
			 Cell cell = row.createCell(0);
			cell.setCellValue(opt);
		}
		
		FileOutputStream  out=new FileOutputStream(file);
		workbook.write(out);

	}

}
