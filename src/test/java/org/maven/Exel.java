package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;

public class Exel {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Praveena\\eclipse-workspace\\Framework\\spread\\test.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook work = new XSSFWorkbook(stream);

		Sheet sheet = work.getSheet("Sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				switch (type) {

				case STRING:
					String data = cell.getStringCellValue();
					System.out.println(data);
					break;
				case NUMERIC:
					
					if (DateUtil.isCellDateFormatted(cell)) {
						
						 Date date = cell.getDateCellValue();
						SimpleDateFormat dateFactory = new SimpleDateFormat("dd-MMM-yy");
						String format = dateFactory.format(date);
						System.out.println(format);
					}
					else
					{
					double d = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(d);
					String name = b.toString();
					System.out.println(name);
					break;
					}
				default:
					break;
				}

			}

		}

	}

}
