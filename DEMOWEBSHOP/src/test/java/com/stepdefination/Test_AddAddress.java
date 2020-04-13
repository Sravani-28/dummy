package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.BaseClass;
import com.pages.AddAddress;
import com.pages.Webshop_Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_AddAddress extends BaseClass{
	
	private static Logger logger=(Logger)LogManager.getLogger(Test_WebshopRegister.class);

	Webshop_Loginpage lp;  
	AddAddress add;
	
	 @Given("^user launches to chrome page$")
	    public void user_launches_to_chrome_page() throws Throwable {
	        launchApp("firefox");
			logger.debug("firefox launched and website opened");

	    }

	    @When("^user logged into the home page$")
	    public void user_logged_into_the_home_page() throws Throwable {
	        
	    	lp=new Webshop_Loginpage(driver);
			lp.loginac();
			
			logger.info("login successfully");

	    }

	    @Then("^the user can add the address$")
	    public void the_user_can_add_the_address() throws Throwable {
	        
	    	add=new AddAddress(driver);
	    	add.addaddress();
	    	logger.info("address added successfully");
	    	//screenshot("src/main/resources/Screenshots/AddAddress.png");
	    	driver.quit();
	    }

}

