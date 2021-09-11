package com.Adactinhotel.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//java//com//AdactinHotelTraining//feature", glue="com.AdactinHotelTraining.stepdefinition")



public class Test_Runner {
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void Set_Up() {
		driver= Baseclass.browserLaunch("chrome");
		
	}
	
	@AfterClass
	public static void Tear_Down() {
   // driver.close();
	}
}	
	


