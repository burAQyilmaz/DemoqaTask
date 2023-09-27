package com.demoqa.step_definitions;

import com.demoqa.pages.Base_Page;
import com.demoqa.pages.Login_Page;
import com.demoqa.utility.BrowserUtility;
import com.demoqa.utility.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Logout_SD {

    Login_Page loginPage=new Login_Page();
    Base_Page basePage=new Base_Page();

    @Given("user is logged in")
    public void user_is_logged_in() {

        loginPage.loginWithValidCredentials();
    }
    @When("user clicks on the log out button on the any page")
    public void user_clicks_on_the_log_out_button_on_the_any_page() {

        basePage.logoutBtn.click();
    }
    @Then("user is logged out")
    public void user_is_logged_out() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }


}
