package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Adact extends Baseee {
	
	public Login_Adact() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="username")
	private WebElement txtUsr;
	
	@FindBy(id="password")
	private WebElement txtPswd;
	
	@FindBy(id="login")
	private WebElement btnLgn;

	public WebElement getTxtUsr() {
		return txtUsr;
	}

	public WebElement getTxtPswd() {
		return txtPswd;
	}

	public WebElement getBtnLgn() {
		return btnLgn;
	}
	
	public void login(String userName,String password) {

		type(getTxtUsr(), userName);
		type(getTxtPswd(), password);
		click(getBtnLgn());
		
		
	}

}
