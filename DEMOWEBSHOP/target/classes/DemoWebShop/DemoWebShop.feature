#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Templat
Feature: DemoWebShop
 
 @TC01
 Scenario: Registration  
  Given User launches webshop page
  When User enters valid credentials
   Then User Registered successfully
    
@TC02
Scenario: Login successfully
 Given User launches demowebshop page
 When User enters valid credentials "<email>" and "<password>"
 Then User can login successfully
  
  
 @TC03
 Scenario: Product search and AddtoCart
 Given the user launches the chrome application
 When the user logged into the home page
 Then the user search the product
 Then the user give the specifications
 Then the user adds the product to the cart
 
@TC04 
Scenario: Wishlish and recently viewed products
 Given the user launches  chrome 
 When the user navigated into the home page
 Then the user adds some products to wishlist
 And the user checks the recently viewed products
 
 
 @Tc05_Address
 Scenario: Add Address
 Given user launches to chrome page
 When user logged into the home page
 Then the user can add the address
 
 
 @TC06_ChangePassword
 Scenario Outline: Change Password
 Given The user launches  the chrome 
 When  The user login  to the site
 Then  The user enters "<old password>" and "<new password>" and "<confirm password>"
 
 Examples:
 |  old password  |  new password  |  confirm password  |
 |  12345678      |   23245890     |   23245890         |
 |  23245890      |   demonew      |   demonew          |