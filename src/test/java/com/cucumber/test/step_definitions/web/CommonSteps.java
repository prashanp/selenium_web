package com.cucumber.test.step_definitions.web;
import java.util.Date;

import com.cucumber.test.framework.PageObject;
import com.cucumber.test.framework.helpers.CommonHelper;
import com.cucumber.test.framework.helpers.DatabaseHelper;
import com.cucumber.test.framework.helpers.UrlBuilder;
import com.cucumber.test.sql.DBCall;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonSteps extends DatabaseHelper {

   private CommonHelper commonpagehelper;
   public CommonSteps(CommonHelper commonpagehelper) {
   this.commonpagehelper=commonpagehelper;     
    }

    @When("^i enter \"(.*?)\" (.*) on the Home Page$")
    public void i_enter_on_the_Home_Page(String pageToNavigate,String loginId) throws Throwable {
        if (pageToNavigate.equals("UserName")) {
        	System.out.println(loginId);
        	String un=executesqlQuery(DBCall.testsql("a1"));
        	un = un.replaceAll("[\\[\\](){}]","");
        	commonpagehelper.enterUserName(un);
        	System.out.println(un);
       }
    }

    @When("^i enter Insured \"(.*?)\" (.*) on the Home Page$")
    public void i_enter_Insured_User_on_the_Home_Page(String pageToNavigate,String loginId) throws Throwable {
        if (pageToNavigate.equals("UserName")) {
        	System.out.println(loginId);
        	String un=executesqlQuery(DBCall.testsql("b1"));
        	un = un.replaceAll("[\\[\\](){}]","");
        	commonpagehelper.enterUserName(un);
        	System.out.println(un);
        	
        }
    }

    @When("^i click on \"(.*?)\" button$")
    public void i_click_on_the_Next_Button(String pageToNavigate) throws Throwable {
    	 if (pageToNavigate.equals("Next")) {
    		 commonpagehelper.clickNextButton();
    	 }   
    }
    
    
    
    @When("^I run query \"([^\"]*)\" (.*) to get list of users in record set$")
    public void I_run_query_to_get_list_of_users_in_record_set(String pageToNavigate, String loginId) throws Throwable {
    	executesqlQuery(DBCall.testsql("a1"));
    	System.out.println(executesqlQuery(DBCall.testsql("a1")));
    	
    	executesqlQuery(DBCall.testInsuredsql(loginId));
        System.out.println(executesqlQuery(DBCall.testInsuredsql(loginId)));
        
    }
    
    @Given("^Go to nccpa sign in page$") 
    public void Go_to_nccpa_signin_page() throws Throwable 
        
    {
    	UrlBuilder.startAtHomePage();
    }

    @When("^User is in signin page$") 
    public void User_is_in_signin_page() throws Throwable {
    	commonpagehelper.check_pagetitle("Sign In page"); 
    }

    @Then("^User should see the role from the select role dropdown list$") 
    public void User_should_see_the_role() throws Throwable {
		     
	    commonpagehelper.click_rollselrection_pa();
	    commonpagehelper.enter_rollselrection_pa();
    }

   @Then("^Enters a valid userid \"([^\"]*)\"$")
   public void Enters_a_valid_userid(String userid) throws Throwable 
   {
	        String paid = executesqlQuery(DBCall.querryexecuter("c1"));
	        String un = paid.replaceAll("[\\[\\](){}]","");
        	System.out.println(un);
            commonpagehelper.enter_userid(un);
   }

   @Then("^Enters a valid password \"([^\"]*)\"$")
   public void Enters_a_valid_password(String password) throws Throwable 
   {
         commonpagehelper.enter_password(password);
   }

   @Then("^Click on Signin button$")
   public void Click_on_Signin_button() throws Throwable 
   {
	   commonpagehelper.click_logsignin();
    }

   @Then("^Check background Questions$")
   public void Check_background_Questions() throws Throwable 
   {
	        try
            {

                System.out.println("Checking for Background Questions: ");
                commonpagehelper.get_currenturl();
                System.out.println("Background Questions: No to License Revoked");
                commonpagehelper.click_background_revoke_no_radiobutton();
                System.out.println("Background Questions: No to Convicted Felon");
                commonpagehelper.click_background_felony_no_radiobutton();
                System.out.println("Background Questions: No to Mentally Incompetent");
                commonpagehelper.click_background_mental_no_radiobutton();
                System.out.println("Background Questions: Submitted");
                commonpagehelper.click_background_accept_button();
              } 
   
	          catch(Exception e)
              {
	        	System.out.println("Background Questions not found."+e);
              }
               
        } 
    
   @Then("^validate login is successful$")
   public void validate_login_is_successful() throws Throwable 
   {
	commonpagehelper.check_pagetitle("NCCPA: Dashboard");
   }
   
   @Then("^Check Important Notice Dialog$")
   public void Check_Important_Notice_Dialog() throws Throwable 
   {
		    try{
            	System.out.println("Check Important Notice Dialog: ");
                commonpagehelper.click_important_notice_dialog();
                commonpagehelper.click_important_notice_dialog_updateprofile();
                commonpagehelper.click_important_notice_dialog_completeprofile();
                commonpagehelper.click_important_notice_acknowledgeonly();
                                
            } 
		    catch(Exception e)
            {
	        	System.out.println("Error Found"+e);
		    }
   }
 
  @Then("^Dashboard menu item dispaly is display$") 
  public void Dashboard_menu_item_dispaly(String title) throws Throwable 
  {
	     commonpagehelper.Verifytext("Dashboard");
  }
  
  @Then("^Verify the signout button is visible$")
  public void Verify_the_signout_button_is_visible(String title) throws Throwable 
  {
	  commonpagehelper.clickable_code_signout();
    }
    
 @Then("^Clicks on signout to leave the Dashboard page$")
 public void Clicks_on_signout_to_leave_the_Dashboard_page() throws Throwable 
 {
	
	 commonpagehelper.click_code_signout();
 }

 @Then("^Verifies the signout is successful$")
 public void Verifies_the_signout_is_successful() throws Throwable 
 {

	 	commonpagehelper.Verifytext("Sign In Page");
 }

}



