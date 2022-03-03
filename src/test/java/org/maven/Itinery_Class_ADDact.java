package org.maven;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinery_Class_ADDact extends Baseee {
	
	public Itinery_Class_ADDact() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement cancel;
	
	@FindBy(xpath="//*[@id=\"order_id_text\"]")
	private WebElement srch;
	
	@FindBy(xpath="//*[@id=\"search_hotel_id\"]")
	private WebElement srcBtn;
	
	@FindBy(xpath="//*[@id=\"check_all\"]")
	private WebElement chckBox;
	
	@FindBy(xpath="//*[@id=\"booked_form\"]/table/tbody/tr[3]/td/input[1]")
	private WebElement cnclBtn;

	public WebElement getCancel() {
		return cancel;
	}

	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}

	public WebElement getSrch() {
		return srch;
	}

	public void setSrch(WebElement srch) {
		this.srch = srch;
	}

	public WebElement getSrcBtn() {
		return srcBtn;
	}

	public void setSrcBtn(WebElement srcBtn) {
		this.srcBtn = srcBtn;
	}

	public WebElement getChckBox() {
		return chckBox;
	}

	public void setChckBox(WebElement chckBox) {
		this.chckBox = chckBox;
	}

	public WebElement getCnclBtn() {
		return cnclBtn;
	}

	public void setCnclBtn(WebElement cnclBtn) {
		this.cnclBtn = cnclBtn;
	}
	
	public void cncl() throws IOException, InterruptedException {

		getCancel().click();
		type(getSrch(), getData("Sheet1", 2, 1));
		getSrcBtn().click();
		getChckBox().click();
		getCnclBtn().click();
		Thread.sleep(100);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
