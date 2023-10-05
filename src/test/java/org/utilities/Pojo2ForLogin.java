package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2ForLogin extends Baseclass {

	public Pojo2ForLogin() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//p[@data-test-id=\\\"tool-tip-button-text\\")
		private WebElement register;
		
		
		public WebElement getRegister() {
			return register;
		}
	
		
}

