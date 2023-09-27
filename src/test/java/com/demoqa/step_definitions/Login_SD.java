package com.demoqa.step_definitions;

import com.demoqa.pages.Base_Page;
import com.demoqa.pages.Books_Page;
import com.demoqa.pages.Login_Page;
import com.demoqa.utility.BrowserUtility;
import com.demoqa.utility.ConfigurationReader;
import com.demoqa.utility.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Login_SD {
    Login_Page loginPage = new Login_Page();
    Books_Page booksPage = new Books_Page();

    Actions actions = new Actions(Driver.getDriver());

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        booksPage.loginBtn.click();
    }

    @When("user enters a valid username {string} into the username input box")
    public void user_enters_a_valid_username_into_the_username_input_box(String string) {

        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperties("string"));
    }

    @When("user enters a valid password {string} into the password input box")
    public void user_enters_a_valid_password_into_the_password_input_box(String string) {

        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperties("string"));
    }

    @When("the user clicks on the Log in button")
    public void the_user_clicks_on_the_log_in_button() {
        BrowserUtility.scrollByVerticalAutomatically(loginPage.loginBtn);
        loginPage.loginBtn.click();
    }

    @Then("the user should see his username on the profile page")
    public void the_user_should_see_his_username_on_the_profile_page() {

        try {
            loginPage.userNameValue.isDisplayed();
        } catch (RuntimeException e) {
            Assert.fail("User could not log in");
        }
    }

    @When("the user hits the enter")
    public void the_user_hits_the_enter() {

        actions.sendKeys(Keys.ENTER);
    }
}
