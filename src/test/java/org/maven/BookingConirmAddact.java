package org.maven;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConirmAddact extends Baseee{

	public BookingConirmAddact() throws Exception {

		PageFactory.initElements(driver, this);
		Thread.sleep(10000);
	}
	
	@FindBy(id="order_no")
	private WebElement ordN;

	public WebElement getOrdN() {
		return ordN;
	}

	public void setOrdN(WebElement ordN) {
		this.ordN = ordN;
	}
	
	public void confirmOrd() throws IOException {
		
		String text = getInsertedText(getOrdN());
		System.out.println(text);
		writeData("Sheet1", 2, 1, text);
		
	}
	
}
