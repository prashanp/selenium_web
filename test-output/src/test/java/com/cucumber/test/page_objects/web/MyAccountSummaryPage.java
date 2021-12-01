package com.cucumber.test.page_objects.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.test.framework.PageObject;

import java.util.List;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  page object class should extend "PageObject" class
 */


public class MyAccountSummaryPage extends PageObject {


    private By myaccountSummaryTitle = By.cssSelector(".my_account h1");

    private By personalInformation = By.cssSelector(".label + .info_content");

    public String getMyaccountSummaryTitle() {
        return waitForExpectedElement(myaccountSummaryTitle).getText();
    }

    public List<WebElement> getPersonalInformation() {
        return webDriver.findElements(personalInformation);
    }


}
