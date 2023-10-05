package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.utilities.Baseclass;
import org.utilities.Pojo3ForUsernamePassword;


import io.cucumber.java.en.*;

public class LoginStepDefinition extends Baseclass {
	
	@Given("User should launch the browser and load the url")
	public void user_should_launch_the_browser_and_load_the_url() {
	    openchrome();
	    launcherurl("https://www.diy.com/");
	    maxwindow();
	    toimplicitWait(200);
		
	}

	@When("User should enter valid username and valid password")
	public void user_should_enter_valid_username_and_valid_password() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Got it']")).click();
		driver.findElement(By.xpath("//span[text()=\"Sign in\"]")).click();
		sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txtemail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		js.executeScript("arguments[0].setAttribute('value','archanarchu5991@gmail.com')", txtemail);
		WebElement txtpass = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].setAttribute('value','Altaf@98012609')", txtpass);
		
	}


    @When("User should enter valid username {string} and valid password {string}")
    public void userShouldEnterValidUsernameAndValidPassword(String s1, String s2) {
    	Pojo3ForUsernamePassword P = new Pojo3ForUsernamePassword();
		WebElement txtemail = P.getTxtemail();
		filltextbox(txtemail, s1);
		WebElement txtpass = P.getTxtpass();
		filltextbox(txtpass, s2);
    	
    }

    @When("User should enter vaid username and valid password")
    public void userShouldEnterVaidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {
    	Pojo3ForUsernamePassword P = new Pojo3ForUsernamePassword();
		WebElement txtemail = P.getTxtemail();   	
    	 //2D MAP
    			List<Map<String, String>> mp = d.asMaps();
    			String s1 = mp.get(1).get("Starters");
    			filltextbox(txtemail, s1); 
    			WebElement txtpass = P.getTxtpass();
    			filltextbox(txtpass,mp.get(2).get("Veg")); 
    		   
    }


    @When("User should print the title of your page")
	public void user_should_print_the_title_of_your_page() {
		System.out.println(driver.getTitle());
	    
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement btnlog = driver.findElement(By.xpath("//span[@class=\"e433fa60 ed9c0217 f9f4120c\"]"));
		js.executeScript("arguments[0].click()", btnlog);
		
	}
	
	@When("User should click the product of the page")
	public void user_should_click_the_product_of_the_page() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement prodclk = driver.findElement(By.xpath("//a[text()='Painting�& Decorating']"));
		js.executeScript("arguments[0].click()", prodclk);
		
	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("verify credential", currentUrl.contains("departments"));
		System.out.println("Test Case Passed");
	    
	}

}
