package com.demoqa.step_definitions;

import com.demoqa.pages.Login_Page;
import com.demoqa.pages.Profile_Page;
import com.demoqa.utility.BrowserUtility;
import com.demoqa.utility.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChangeRow_SD {

    Profile_Page profilePage = new Profile_Page();
    Login_Page loginPage = new Login_Page();

    @Given("user is on the profile page")
    public void user_is_on_the_profile_page() {
        loginPage.loginWithValidCredentials();

        BrowserUtility.scrollByVerticalAutomatically(profilePage.profileLink);
        profilePage.profileLink.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("profile"));

    }

    @When("user clicks row dropdown menu")
    public void user_clicks_row_dropdown_menu() {
        BrowserUtility.scrollByVerticalAutomatically(profilePage.rowDropdown);

        profilePage.rowDropdown.click();

    }

    @When("user select any row {string}")
    public void user_select_any_row(String string) {
        Select select = new Select(profilePage.rowDropdown);

        select.selectByValue(string);
        /*
        for (WebElement rowNum : profilePage.rowNums) {

            select.selectByValue(rowNum.getAttribute("value"));
        }
        */
    }

    @Then("user sees changed row {string}")
    public void user_sees_changed_row(String string) {

        BrowserUtility.scrollByVerticalAutomatically(profilePage.rowDropdown);

        Assert.assertEquals(string + " ", profilePage.rowDropdown.getText());
    }

}
