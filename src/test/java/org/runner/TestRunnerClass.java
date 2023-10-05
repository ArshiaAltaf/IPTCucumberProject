package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org\\stepdefinition",dryRun=false,monochrome=true,
snippets=SnippetType.CAMELCASE,
plugin= {"html:target\\Reports",
		"junit:target\\Reports\\diyporoject.xml",
		"json:target\\Reports\\diy.json"})


public class TestRunnerClass extends JVMReport {
	
	@AfterClass
	public static void callReport() {
		
	      generateJVMReports(System.getProperty("user.dir")+"\\target\\Reports\\diy.json");
	


}

}