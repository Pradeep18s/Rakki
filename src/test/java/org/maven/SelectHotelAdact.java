package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelAdact extends Baseee{

	public SelectHotelAdact() {

	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement rdoBtn;
	
	@FindBy(id="continue")
	private WebElement cntBtn;
	
	public void SelHotel() {

		rdoBtn.click();
		cntBtn.click();
		
	}
}
