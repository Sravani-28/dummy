$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/DemoWebShop/DemoWebShop.feature");
formatter.feature({
  "name": "DemoWebShop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "name": "User launches webshop page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefination.Test_WebshopRegister.user_launches_webshop_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefination.Test_WebshopRegister.user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.Test_WebshopRegister.user_Registered_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC02"
    }
  ]
});
formatter.step({
  "name": "User launches demowebshop page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefination.Test_LoginPage.user_launches_demowebshop_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid credentials \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefination.Test_LoginPage.user_enters_valid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.Test_LoginPage.user_can_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Product search and AddtoCart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC03"
    }
  ]
});
formatter.step({
  "name": "the user launches the chrome application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefination.TestAddtoCart.the_user_launches_the_chrome_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged into the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefination.TestAddtoCart.the_user_logged_into_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.TestAddtoCart.the_user_search_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user give the specifications",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.TestAddtoCart.the_user_give_the_specifications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds the product to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.TestAddtoCart.the_user_adds_the_product_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Wishlish and recently viewed products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC04"
    }
  ]
});
formatter.step({
  "name": "the user launches  chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefination.Test_ProductWishlist.the_user_launches_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigated into the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefination.Test_ProductWishlist.the_user_navigated_into_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds some products to wishlist",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.Test_ProductWishlist.the_user_adds_some_products_to_wishlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user checks the recently viewed products",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdefination.Test_ProductWishlist.the_user_checks_the_recently_viewed_products()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Tc05_Address"
    }
  ]
});
formatter.step({
  "name": "user launches to chrome page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefination.Test_AddAddress.user_launches_to_chrome_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logged into the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefination.Test_AddAddress.user_logged_into_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user can add the address",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.Test_AddAddress.the_user_can_add_the_address()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Change Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC06_ChangePassword"
    }
  ]
});
formatter.step({
  "name": "The user launches  the chrome",
  "keyword": "Given "
});
formatter.step({
  "name": "The user login  to the site",
  "keyword": "When "
});
formatter.step({
  "name": "The user enters \"\u003cold password\u003e\" and \"\u003cnew password\u003e\" and \"\u003cconfirm password\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "old password",
        "new password",
        "confirm password"
      ]
    },
    {
      "cells": [
        "12345678",
        "23245890",
        "23245890"
      ]
    },
    {
      "cells": [
        "23245890",
        "demonew",
        "demonew"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Change Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC06_ChangePassword"
    }
  ]
});
formatter.step({
  "name": "The user launches  the chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefination.Test_ChangePassword.the_user_launches_the_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user login  to the site",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefination.Test_ChangePassword.the_user_login_to_the_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"12345678\" and \"23245890\" and \"23245890\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.Test_ChangePassword.the_user_enters_and_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Change Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC06_ChangePassword"
    }
  ]
});
formatter.step({
  "name": "The user launches  the chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefination.Test_ChangePassword.the_user_launches_the_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user login  to the site",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefination.Test_ChangePassword.the_user_login_to_the_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"23245890\" and \"demonew\" and \"demonew\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefination.Test_ChangePassword.the_user_enters_and_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});