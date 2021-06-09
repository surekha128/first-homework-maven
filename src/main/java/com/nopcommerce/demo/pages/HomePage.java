package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
/*
1. create class "TopMenuTest"
 */

public class HomePage extends Utility {

    public void getHomePage(String menu) throws InterruptedException
    {

        List<WebElement> elementList = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/child::li"));
        for (WebElement element : elementList)
            {
              if (element.getText().equals(menu))
                {
                    element.click();
                }continue;
            }
        String expectedMessage = gettextfromelemrnt(By.xpath("//ul[@class='top-menu notmobile']/child::li"));
        String actualMessage = gettextfromelemrnt(By.xpath("//ul[@class='top-menu notmobile']/child::li"));
        Assert.assertEquals("please select menu", expectedMessage, actualMessage);
        }

}

