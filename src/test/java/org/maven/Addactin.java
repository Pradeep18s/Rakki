package org.maven;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Addactin {

	public static void main(String[] args) throws IOException, InterruptedException {

		Baseee obj = new Baseee();
		String shName = "Sheet1";
		obj.getDriver();
		String xx = "https://adactinhotelapp.com/index.php";
		obj.loadUrl(xx);

		String s = "//input[@id='username']";
		WebElement usrname = obj.findElemx(s);
		String z = obj.getData(shName, 1, 0);
		obj.type(usrname, z);

		String t = "//input[@id='password']";
		WebElement pswd = obj.findElemx(t);
		String p = obj.getData(shName, 1, 1);
		obj.type(pswd, p);

		String bt = "//input[@id='login']";
		WebElement btn = obj.findElemx(bt);
		obj.click(btn);

		String loct = "//select[@id='location']";
		WebElement loctn = obj.findElemx(loct);
		String loc = obj.getData(shName, 1, 2);
		obj.type(loctn, loc);

		String hotels = "//select[@id='hotels']";
		WebElement hot = obj.findElemx(hotels);
		String hots = obj.getData(shName, 1, 3);
		obj.type(hot, hots);

		String j = "//select[@id='room_type']";
		WebElement room = obj.findElemx(j);
		String hroom = obj.getData(shName, 1, 4);
		obj.type(room, hroom);

		String k = "//select[@id='room_nos']";
		WebElement roomn = obj.findElemx(k);
		String roomns = obj.getData(shName, 1, 5);
		obj.type(roomn, roomns);

		String l = "//input[@id='datepick_in']";
		WebElement din = obj.findElemx(l);
		String dain = obj.getData(shName, 1, 6);
		obj.type(din, dain);

		String m = "//input[@id='datepick_out']";
		WebElement dout = obj.findElemx(m);
		String douts = obj.getData(shName, 1, 7);
		obj.type(dout, douts);

		String n = "//select[@id='adult_room']";
		WebElement adlt = obj.findElemx(n);
		String adult = obj.getData(shName, 1, 8);
		obj.type(adlt, adult);

		String op = "//select[@id='child_room']";
		WebElement chld = obj.findElemx(op);
		String child = obj.getData(shName, 1, 9);
		obj.type(chld, child);

		WebElement subBtn = obj.findElemx("//input[@id='Submit']");
		obj.click(subBtn);

		WebElement rdoBtn = obj.findElemx("//input[@id='radiobutton_0']");
		obj.click(rdoBtn);

		WebElement cntBtn = obj.findElemx("//input[@id='continue']");
		obj.click(cntBtn);

		WebElement frsN = obj.findElemx("//input[@id='first_name']");
		String name = obj.getData(shName, 1, 10);
		obj.type(frsN, name);

		WebElement lstN = obj.findElemx("//input[@id='last_name']");
		String lastN = obj.getData(shName, 1, 11);
		obj.type(lstN, lastN);

		WebElement address = obj.findElemx("//textarea[@id='address']");
		String adrs = obj.getData(shName, 1, 12);
		obj.type(address, adrs);

		WebElement ccv = obj.findElemx("//input[@id='cc_num']");
		String ccvT = obj.getData(shName, 1, 13);
		obj.type(ccv, ccvT);

		WebElement ccT = obj.findElemx("//select[@id='cc_type']");
		String ccTy = obj.getData(shName, 1, 14);
		obj.type(ccT, ccTy);

		WebElement expD = obj.findElemx("//select[@id='cc_exp_month']");
		String expDa = obj.getData(shName, 1, 15);
		obj.type(expD, expDa);

		WebElement expY = obj.findElemx("//select[@id='cc_exp_year']");
		String expYr = obj.getData(shName, 1, 16);
		obj.type(expY, expYr);

		WebElement cvv = obj.findElemx("//input[@id='cc_cvv']");
		String CvvN = obj.getData(shName, 1, 17);
		obj.type(cvv, CvvN);

		WebElement bookN = obj.findElemx("//input[@id='book_now']");
		obj.click(bookN);

		Thread.sleep(10000);

		WebElement orderN = obj.findElementId("order_no");
		String ordNo = obj.getInsertedText(orderN);
		System.out.println(ordNo);

	}

}
