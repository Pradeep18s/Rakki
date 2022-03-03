package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_Adact extends Baseee {
	
	public SearchHotel_Adact() {

		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement rooomN;
	
	@FindBy(id="datepick_in")
	private WebElement din;
	
	@FindBy(id="datepick_out")
	private WebElement dout;
	
	@FindBy(id="adult_room")
	private WebElement adlt;
	
	@FindBy(id="child_room")
	private WebElement chld;
	
	@FindBy(id="Submit")
	private WebElement srchBtn;

	public WebElement getSrchBtn() {
		return srchBtn;
	}

	public void setSrchBtn(WebElement srchBtn) {
		this.srchBtn = srchBtn;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}

	public void setRooomN(WebElement rooomN) {
		this.rooomN = rooomN;
	}

	public void setDin(WebElement din) {
		this.din = din;
	}

	public void setDout(WebElement dout) {
		this.dout = dout;
	}

	public void setAdlt(WebElement adlt) {
		this.adlt = adlt;
	}

	public void setChld(WebElement chld) {
		this.chld = chld;
	}

	public WebElement getRooomN() {
		return rooomN;
	}

	public WebElement getDin() {
		return din;
	}

	public WebElement getDout() {
		return dout;
	}

	public WebElement getAdlt() {
		return adlt;
	}

	public WebElement getChld() {
		return chld;
	}
public void searchHot(String Location,String hotels, String roomType,String RoomNo,String checkIn,String checkOut,String adultPer,String chilPer) {

	selectOptionByVisibleText(getLocation(), Location);
	selectOptionByVisibleText(getHotels(), hotels);
	selectOptionByVisibleText(getRoomType(), roomType);
	selectOptionByVisibleText(getRooomN(), RoomNo);
	type(getDin(), checkIn);
	type(getDout(), checkOut);
	selectOptionByVisibleText(getAdlt(), adultPer);
	selectOptionByVisibleText(getChld(), chilPer);
	click(getSrchBtn());
	
	
}
	

}
