package com.cucumber.test.step_definitions.web;


import com.cucumber.test.page_objects.web.YahooPage;

import cucumber.api.java.en.Given;

public class YahooPageSteps {

    private YahooPage YahooPage;

    public YahooPageSteps(YahooPage YahooPage) {
        this.YahooPage = YahooPage;
    }


    @Given("^i click \"(.*?)\" on the Yahoo Page$")
    public void i_click_on_the_Yahoo_Page(String pageToNavigate) throws Throwable {
        if (pageToNavigate.equals("EnterLoginUserName")) {
            YahooPage.EnterLoginUserName();
        } else if (pageToNavigate.equals("clickNextBtn")) {
            YahooPage.clickNextBtn();
        }
    }

}