package com.demoqa.pages;

import com.demoqa.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {

    public Base_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "item-0")
    public WebElement loginLink;

    @FindBy(id = "item-2")
    public WebElement bookStoreLink;

    @FindBy(id = "item-3")
    public WebElement profileLink;

    @FindBy(id = "userName-value")
    public WebElement userNameValue;

    @FindBy(id = "submit")
    public WebElement logoutBtn;
}
