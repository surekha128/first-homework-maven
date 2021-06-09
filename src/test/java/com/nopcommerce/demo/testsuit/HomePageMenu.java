package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/*
 	1.1 create method with name "selectMenu" it has one parameter name "menu" of  type string
	1.2 This method should click on the menu whatever name is passed as parameter.
	1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation.
 */

public class HomePageMenu extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void navigatetomenu() throws InterruptedException {
//  "Computers\n,Electronics\n,Apparel\n,Digital downloads\n,Books \n,Jewelry \n,Gift Cards \n"
        homePage.getHomePage("Gift Cards");

    }
}