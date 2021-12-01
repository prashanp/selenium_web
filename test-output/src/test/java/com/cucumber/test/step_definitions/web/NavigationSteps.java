package com.cucumber.test.step_definitions.web;


import com.cucumber.test.framework.helpers.UrlBuilder;

import cucumber.api.java.en.Given;


public class NavigationSteps {


    @Given("^i navigate to the website \"(.*?)\" page$")
    public void i_navigate_to_the_website_page(String Home) throws Throwable {
        if (Home.equals("HOME")) {
            UrlBuilder.startAtHomePage();
        }
    }


}