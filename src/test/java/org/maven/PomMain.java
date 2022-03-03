package org.maven;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class PomMain extends Baseee{
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/index.php");

	}
	@Test
	public void Adact() throws Exception {

		Login_Adact lgn=new Login_Adact();
		lgn.login(getData("Sheet1", 1, 0),getData("Sheet1", 1, 1));
		
		SearchHotel_Adact srch=new SearchHotel_Adact();
		srch.searchHot(getData("Sheet1", 1, 2),getData("Sheet1", 1, 3),getData("Sheet1", 1, 4),getData("Sheet1", 1, 5),getData("Sheet1", 1, 6),getData("Sheet1", 1, 7),getData("Sheet1", 1, 8),getData("Sheet1", 1, 9));
		
		SelectHotelAdact sel=new SelectHotelAdact();
		sel.SelHotel();
		
		BookAHotelClass book=new BookAHotelClass();
		book.bookHot(getData("Sheet1", 1, 10),getData("Sheet1", 1, 11),getData("Sheet1", 1, 12),getData("Sheet1", 1, 13),getData("Sheet1", 1, 14),getData("Sheet1", 1, 15), "2021",getData("Sheet1", 1, 17));
	
		BookingConirmAddact bookC=new BookingConirmAddact();
		bookC.confirmOrd();
		
		Itinery_Class_ADDact cn=new Itinery_Class_ADDact();
		cn.cncl();
	}
	
	
}
