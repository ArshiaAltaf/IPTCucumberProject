package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo4ForSearchProduct extends Baseclass {
	
	public Pojo4ForSearchProduct() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Painting & Decorating']")
	private WebElement prodclk;

	public WebElement getProdclk() {
		return prodclk;
	}
	
	
	}

	

