package com.cucumber.test.step_definitions.database;

import com.cucumber.test.framework.helpers.Props;
import com.cucumber.test.models.database.UserRegModel;
import com.cucumber.test.sql.UserRegDB;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Step Definition implementation class for Cucumber Steps defined in Feature file
 */
public class DatabaseSteps {
    private UserRegDB userRegDB;
    private List results;
    private List results1;
    private List results2;
    
    private List<UserRegModel> userRegModels;

    public DatabaseSteps(UserRegDB userRegDB) {
        this.userRegDB = userRegDB;
    }

    

    @When("^I run query \"([^\"]*)\" to get list of users in bean$")
    public void I_run_query_to_get_list_of_users_in_bean(String sqlQuery) throws Throwable {
        userRegModels = userRegDB.getUserRegResults("Select top 1 ID from Claim ORDER BY ID desc");
	//System.out.println(userRegDB.executesqlQuery("Select top 1 ID from Claim ORDER BY ID desc"));

    }

    @Then("^the list of users is not empty$")
    public void the_list_of_users_is_not_empty() throws Throwable {
        assertThat(results.size()).isGreaterThan(0);
    }

    @Then("^the list of users contains \"([^\"]*)\" as a user$")
    public void the_list_of_users_contains_as_a_user(String userName) throws Throwable {
        List<UserRegModel> userRegModels = this.userRegModels;
        //Optional<Boolean> user = userRegModels.stream().map(userRegMode -> userRegMode.getLogonId().contains(userName)).findFirst();
        //assertThat(user.isPresent()).isTrue();
    }
}