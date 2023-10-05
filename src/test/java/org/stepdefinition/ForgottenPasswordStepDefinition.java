package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.utilities.Baseclass;

import io.cucumber.java.en.*;

public class ForgottenPasswordStepDefinition extends Baseclass {

	@Given("User should launch the chrome browser and load the url of page")
	public void user_should_launch_the_chrome_browser_and_load_the_url_of_page() throws InterruptedException {
	//	openchrome();
	//  launcherurl("https://www.diy.com/");
	//  maxwindow();
		toimplicitWait(300);
		driver.findElement(By.xpath("//p[text()='Got it']")).click();
		driver.findElement(By.xpath("//span[text()=\"Sign in\"]")).click();
		
	}

	@When("User should click the forgotten password button")
	public void user_should_click_the_forgotten_password_button() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Forgotten your password?']")).click();
	   
	}

	@When("User should enter invalid email address in the text box")
	public void user_should_enter_invalid_email_address_in_the_text_box() {
		driver.findElement(By.name("email")).sendKeys("archana123@gmail.com");
	    
	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() {
		driver.findElement(By.xpath("//button[@data-test-id=\"account-form-submit\"]")).click();
	    
	}

	@Then("User should navigate to temp blocked page")
	public void user_should_navigate_to_temp_blocked_page() {
		String title = driver.getTitle();
		Assert.assertTrue("Check the forgot password", title.contains("forgot"));
	    
	}
	
	@When("User should print the title of the page")
	public void userShouldPrintTheTitleOfThePage() {
	    System.out.println(driver.getTitle());
	}

	
	
}
