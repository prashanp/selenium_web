package com.cucumber.test.page_objects.web;

import org.openqa.selenium.By;

import com.cucumber.test.framework.PageObject;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  Class which contains page objects should extend "PageObject" class
 * This gives access to the webdriver object and utility methods
 * USE CSS,ID,NAME,CLASSNAME selectors instead of xpath
 */
public class YahooPage extends PageObject {

    private By emailid = By.xpath("//div[3]/input");
    private By NextBtn = By.xpath("//div[2]/input");

    public void EnterLoginUserName() {
        waitForExpectedElement(emailid).sendKeys("test@yahoo.com");
    }

    public void clickNextBtn() {
        waitForExpectedElement(NextBtn).click();

    }
}
