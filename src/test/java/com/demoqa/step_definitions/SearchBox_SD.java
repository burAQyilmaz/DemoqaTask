package com.demoqa.step_definitions;

import com.demoqa.pages.Books_Page;
import com.demoqa.pages.Profile_Page;
import com.demoqa.utility.ConfigurationReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SearchBox_SD {

    Profile_Page profilePage=new Profile_Page();
    Books_Page booksPage=new Books_Page();

    @When("user clicks on the search box")
    public void user_clicks_on_the_search_box() {

        profilePage.searchBox.click();

    }
    @When("user types {string} into the search box")
    public void user_types_into_the_search_box(String string) {

        profilePage.searchBox.sendKeys(ConfigurationReader.getProperties(string));

    }
    @Then("user sees listed books which contain {string}")
    public void user_sees_listed_books_which_contain(String string) {

        for (WebElement eachBook : booksPage.bookTextList) {
            Assert.assertTrue(eachBook.getText().contains(ConfigurationReader.getProperties(string)));
        }
    }



}
