package org.maven;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Adact extends Baseee {

	@BeforeClass
	public static void base() {
		getDriver();
		String url = "https://adactinhotelapp.com/index.php";
		loadUrl(url);

	}

	@Test
	public void Funcn() throws IOException, InterruptedException {
		String Sh = "Sheet1";
		
		
		WebElement elemx = findElemx("//*[@id=\"login_form\"]/table/tbody/tr[1]/td");
		String actuals = elemx.getText();
		assertEquals("Login page", "Existing User Login - Build 1", actuals);
		
		String s = "//input[@id='username']";
		WebElement uNm = findElemx(s);
		type(uNm, getData(Sh, 1, 0));

		String t = "//input[@id='password']";
		WebElement pswd = findElemx(t);
		type(pswd, getData(Sh, 1, 1));

		String bt = "//input[@id='login']";
		WebElement btn = findElemx(bt);
		click(btn);

		String loct = "//select[@id='location']";
		WebElement locn = findElemx(loct);
		type(locn, getData(Sh, 1, 2));	//

		String hotels = "//select[@id='hotels']";
		WebElement hotl = findElemx(hotels);
		type(hotl, getData(Sh, 1, 3));

		String j = "//select[@id='room_type']";
		WebElement room = findElemx(j);
		type(room, getData(Sh, 1, 4));

		String k = "//select[@id='room_nos']";
		WebElement roomN = findElemx(k);
		type(roomN, getData(Sh, 1, 5));

		String l = "//input[@id='datepick_in']";
		WebElement din = findElemx(l);
		type(din, getData(Sh, 1, 6));

		String m = "//input[@id='datepick_out']";
		WebElement dout = findElemx(m);
		type(dout, getData(Sh, 1, 7));

		String n = "//select[@id='adult_room']";
		WebElement adlt = findElemx(n);
		type(adlt, getData(Sh, 1, 8));

		
		
		String op = "//select[@id='child_room']";
		WebElement chld = findElemx(op);
		type(chld, getData(Sh, 1, 9));

		WebElement subBtn = findElemx("//input[@id='Submit']");
		click(subBtn);

		WebElement rdoBtn = findElemx("//input[@id='radiobutton_0']");
		click(rdoBtn);

		WebElement cntBtn = findElemx("//input[@id='continue']");
		click(cntBtn);

		WebElement frsN = findElemx("//input[@id='first_name']");
		type(frsN, getData(Sh, 1, 10));
		
		WebElement lstN = findElemx("//input[@id='last_name']");
		type(lstN, getData(Sh, 1, 11));

		WebElement address = findElemx("//textarea[@id='address']");
		type(address, getData(Sh, 1, 12));

		WebElement ccv = findElemx("//input[@id='cc_num']");
		type(ccv, getData(Sh, 1, 13));

		WebElement ccT = findElemx("//select[@id='cc_type']");
		type(ccT, getData(Sh, 1, 14));

		WebElement expD = findElemx("//select[@id='cc_exp_month']");
		type(expD, getData(Sh, 1, 15));

		WebElement expY = findElemx("//select[@id='cc_exp_year']");
		type(expY, getData(Sh, 1, 16));

		WebElement cvv = findElemx("//input[@id='cc_cvv']");
		type(cvv, getData(Sh, 1, 17));

		WebElement bookN = findElemx("//input[@id='book_now']");
		click(bookN);
		
		 Thread.sleep(10000);
		
		 WebElement orderN =findElementId("order_no");
		 System.out.println(getInsertedText(orderN));

	}

}
