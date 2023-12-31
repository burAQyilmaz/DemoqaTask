package com.demoqa.pages;

import com.demoqa.utility.BrowserUtility;
import com.demoqa.utility.ConfigurationReader;
import com.demoqa.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends Base_Page {

    public Login_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "login")
    public WebElement loginBtn;

    @FindBy(id = "newUser")
    public WebElement newUserBtn;


    Books_Page booksPage = new Books_Page();

    public void loginWithValidCredentials() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        BrowserUtility.scrollByVerticalAutomatically(booksPage.loginBtn);
        booksPage.loginBtn.click();
        userNameInput.sendKeys(ConfigurationReader.getProperties("userName"));
        passwordInput.sendKeys(ConfigurationReader.getProperties("password"));
        BrowserUtility.scrollByVerticalAutomatically(loginBtn);
        loginBtn.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }


}
