package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3ForUsernamePassword extends Baseclass {

	public Pojo3ForUsernamePassword() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type=\\\"email\\\"]")
	private WebElement txtemail;
	
	@FindBy(name="password")
	private WebElement txtpass;
	
	@FindBy(xpath="//span[@class=\"e433fa60 ed9c0217 f9f4120c\"]")
	private WebElement btnlog;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlog() {
		return btnlog;
	}
	
	
}
