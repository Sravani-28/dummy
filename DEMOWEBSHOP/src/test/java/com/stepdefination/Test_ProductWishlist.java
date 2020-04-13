package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.BaseClass;
import com.pages.ProductWishlist;
import com.pages.Webshop_Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_ProductWishlist extends BaseClass {
	//importing the productwishlistpage and creating an instance
	Webshop_Loginpage lp;  
	ProductWishlist pw;
	
	private static Logger logger=(Logger)LogManager.getLogger(Test_WebshopRegister.class);

	
	@Given("the user launches  chrome")
	public void the_user_launches_chrome() throws Throwable{
		launchApp("chrome");
		logger.debug("Chrome launched and website opened");

	}

	@When("the user navigated into the home page")
	public void the_user_navigated_into_the_home_page() throws Throwable {
		lp=new Webshop_Loginpage(driver);
		lp.loginac();
		
		logger.info("login successfully");

	}

	@Then("the user adds some products to wishlist")
	public void the_user_adds_some_products_to_wishlist() throws Throwable {
		pw= new ProductWishlist(driver);
		pw.wishlist();
		logger.info("products added to wishlist");
	}

	@Then("the user checks the recently viewed products")
	public void the_user_checks_the_recently_viewed_products() throws Throwable {
		pw= new ProductWishlist(driver);
		pw.recently_viewed();
       logger.info("Recently viewed products shown in the window");
		screenshot("src/main/resources/Screenshots/Recently viewed.png");
		driver.quit();
	}
	 
}



