package com.cucumber.test.framework.helpers;
import com.cucumber.test.framework.PageObject;
import com.cucumber.test.page_objects.web.CommonPage;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

public class CommonHelper extends PageObject{
	private CommonPage commonpageobject;
	   
	public CommonHelper(CommonHelper commonpagehelper) {
		this.commonpageobject=commonpageobject;     
	}
	public void enterUserName(String txt) {
        waitForExpectedElement(CommonPage.email).sendKeys(txt);
    }

    public void clickNextButton() {
        waitForExpectedElement(CommonPage.NextButton).click();
    }
	
    public void enter_userid(String userid) {
    	waitForExpectedElement(CommonPage.enter_userid).sendKeys(userid);
    }
    
    public void enter_password(String password) {
    	waitForExpectedElement(CommonPage.enter_password).sendKeys(password);

    }

    public void enter_rollselrection_pa() {
    	waitForExpectedElement(CommonPage.rollselrection_pa).sendKeys("na");
    }
    
    public void check_pagetitle(String title) {
    	commonpageobject.checkPageTitle(title);

    }

    public void click_rollselrection_pa() {
        waitForExpectedElement(CommonPage.rollselrection_pa).click();
    }
	
    public void click_logsignin() {
    	JavascriptExecutor je=(JavascriptExecutor) webDriver;
    	je.executeScript("arguments[0].scrollIntoView()",CommonPage.logsignin);
    	waitForExpectedElement(CommonPage.logsignin).click();
    }

    public void get_currenturl() {
    	commonpageobject.getCurrentUrl();

    }
   
    public void click_background_revoke_no_radiobutton() {
        waitForExpectedElement(CommonPage.background_revoke_no_radiobutton).click();
    }
	
    public void click_background_felony_no_radiobutton() {
        waitForExpectedElement(CommonPage.background_felony_no_radiobutton).click();
    }
    public void click_background_mental_no_radiobutton() {
        waitForExpectedElement(CommonPage.background_mental_no_radiobutton).click();
    }
    public void click_background_accept_button() {
        waitForExpectedElement(CommonPage.background_accept_button).click();
    }
    public void click_important_notice_dialog() {
        waitForExpectedElement(CommonPage.important_notice_dialog).click();
    }
    public void click_important_notice_dialog_updateprofile() {
        waitForExpectedElement(CommonPage.important_notice_dialog_updateprofile).click();
    }
    public void click_important_notice_dialog_completeprofile() {
        waitForExpectedElement(CommonPage.important_notice_dialog_completeprofile).click();
    }
    public void click_important_notice_acknowledgeonly() {
        waitForExpectedElement(CommonPage.important_notice_acknowledgeonly).click();
    }
    public void Verifytext(String title) {
        waitForExpectedElement(CommonPage.link_dashboard);
    }
    public void clickable_code_signout() {
    	commonpageobject.elementToBeClickable(CommonPage.code_signout);
    }
    public void click_code_signout() {
        waitForExpectedElement(CommonPage.code_signout);
    }
    
    
}
