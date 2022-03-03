package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelClass extends Baseee {
	
	public BookAHotelClass() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="first_name")
	private WebElement frstNm;
	
	@FindBy(id="last_name")
	private WebElement lstNm;
	
	@FindBy(id="address")
	private WebElement addrs;
	
	@FindBy(id="cc_num")
	private WebElement ccNum;
	
	@FindBy(id="cc_type")
	private WebElement ccTyp;

	@FindBy(id="cc_exp_month")
	private WebElement expMnt;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYr;
	
	@FindBy(id="cc_cvv")
	private WebElement ccv;

	public WebElement getCcv() {
		return ccv;
	}
	
	@FindBy(id="book_now")
	private WebElement bookBtn;

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public void setBookBtn(WebElement bookBtn) {
		this.bookBtn = bookBtn;
	}

	public void setCcv(WebElement ccv) {
		this.ccv = ccv;
	}

	public WebElement getFrstNm() {
		return frstNm;
	}

	public WebElement getLstNm() {
		return lstNm;
	}

	public WebElement getAddrs() {
		return addrs;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcTyp() {
		return ccTyp;
	}

	public WebElement getExpMnt() {
		return expMnt;
	}

	public WebElement getExpYr() {
		return expYr;
	}
	
	public void setFrstNm(WebElement frstNm) {
		this.frstNm = frstNm;
	}

	public void setLstNm(WebElement lstNm) {
		this.lstNm = lstNm;
	}

	public void setAddrs(WebElement addrs) {
		this.addrs = addrs;
	}

	public void setCcNum(WebElement ccNum) {
		this.ccNum = ccNum;
	}

	public void setCcTyp(WebElement ccTyp) {
		this.ccTyp = ccTyp;
	}

	public void setExpMnt(WebElement expMnt) {
		this.expMnt = expMnt;
	}

	public void setExpYr(WebElement expYr) {
		this.expYr = expYr;
	}
	
	public void bookHot(String frst,String last,String addres,String card,String typ,String expM,String expY ,String cvv ) {

		type(getFrstNm(), frst);
		type(getLstNm(), last);
		type(getAddrs(), addres);
		type(getCcNum(), card);
		selectOptionByVisibleText(getCcTyp(), typ);
		selectOptionByVisibleText(getExpMnt(), expM);
		selectOptionByVisibleText(getExpYr(), expY);
		type(getCcv(), cvv);
		click(getBookBtn());
		
	}

	
	
	
}
