package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//register to the website
public class Webshop_Register {
	

	 protected WebDriver driver;
	@FindBy(xpath="//*[@class='ico-register']")
	WebElement register;
	@FindBy(id="gender-female")
	WebElement gender;
	@FindBy(name="FirstName")
	WebElement firstname;
	@FindBy(name="LastName")
	WebElement lastname;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(name="Password")
	WebElement password;
	@FindBy(name="ConfirmPassword")
	WebElement confrimpswd;
	@FindBy(id="register-button")
	WebElement regbtn;

	public   Webshop_Register(WebDriver driver) {
		PageFactory.initElements(driver,this);
	this.driver=driver;   
	}
//click the register option
	public void Register() {
		
		register.click();
		gender.click();
		firstname.sendKeys("Lokam");
		lastname.sendKeys("Sravani");
		email.sendKeys("sravanilokam444@gmail.com");
		password.sendKeys("Webshop1234");
		confrimpswd.sendKeys("Webshop1234");
		regbtn.click();
		
	}
}
	
	

	
	
	
	
	
	
	
	
	