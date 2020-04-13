package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.BaseClass;
import com.pages.Webshop_Register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_WebshopRegister extends BaseClass {
	
	private static Logger logger=(Logger)LogManager.getLogger(Test_WebshopRegister.class);
	//importing the register_page and creating an instance
	Webshop_Register lp;
	
	@Given("User launches webshop page")
	public void user_launches_webshop_page() throws Throwable{
		launchApp("chrome");
		logger.debug("Chrome Launched and navigated to website");
	}
	
	@When("User enters valid credentials")
	public void user_enters_valid_credentials() throws Throwable{
		lp=new Webshop_Register(driver);
	    lp.Register();
	    logger.info("Required details for registration were entered");
	} 
	@Then("User Registered successfully")
	public void user_Registered_successfully() throws Throwable {
	   logger.warn("You entered an existed email id");
		logger.error("the registration is not successful");
		screenshot("src/main/resources/Screenshots/Register.png");
		driver.quit();
	
	}

	

}
