package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.utilities.Baseclass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksClass extends Baseclass {
	
	@Before(order=1)
	public void beforeScenario() {
     
	    openchrome();
		launcherurl("https://www.diy.com/");
		
	}
	
	@Before(order=2)
	public void beforesce() {
		maxwindow();
		toimplicitWait(100);
		driver.findElement(By.xpath("//p[text()='Got it']")).click();
		driver.findElement(By.xpath("//span[text()=\"Sign in\"]")).click();
		
	}
	
	@Before(order=3)
	public void befores() {
		System.out.println("Last Before Executed");
	}
	
	@After(order=3)
	public void afterS() {
		System.out.println("third after order");
	}
	
	@After(order=2)
	public void afterSce() {
		System.out.println("second after order");
	}
	
	@After(order=1)
	public void afterScenario(Scenario s) throws IOException {
		
		closebrowser();
	}
	


}
