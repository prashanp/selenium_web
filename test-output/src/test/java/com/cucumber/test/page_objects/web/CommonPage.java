package com.cucumber.test.page_objects.web;

import org.openqa.selenium.By;

import com.cucumber.test.framework.PageObject;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  Class which contains page objects should extend "PageObject" class
 * This gives access to the webdriver object and utility methods
 * USE CSS,ID,NAME,CLASSNAME selectors instead of xpath
 */
public class CommonPage extends PageObject {

    public static By email = By.xpath("//input[@id='identifierId']");
    public static By NextButton = By.cssSelector("#identifierNext > div > button > span");

    public static By rollselrection_pa = By.id("Name");
    public static By enter_userid = By.id("Id");
    public static By enter_password = By.id("Pass");
    public static By logsignin = By.id("In");
    public static By background_revoke_no_radiobutton = By.id("RevokedNo");
    public static By background_felony_no_radiobutton = By.id("FelonyNo");
    public static By background_mental_no_radiobutton = By.id("MentalNo");
    public static By background_accept_button = By.id("Accept");
    public static By important_notice_dialog = By.id("dialog");
    public static By important_notice_dialog_deadline = By.id("cb_0");
    public static By important_notice_dialog_updateprofile = By.xpath("//*[@id='cb_1']"); 
    public static By important_notice_dialog_completeprofile = By.cssSelector("[id='cb_2']");
    public static By important_notice_acknowledge = By.xpath("//button[@id='k_1']");
    public static By important_notice_acknowledgeonly = By.xpath("//button[@id='y_0']");
    public static By link_dashboard = By.id("me1");
    public static By code_signout = By.cssSelector("[id='Out12']");

}
