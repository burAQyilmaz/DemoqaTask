package com.demoqa.pages;

import com.demoqa.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Profile_Page extends Base_Page {

    public Profile_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchBox")
    public WebElement searchBox;

    @FindBy(xpath = "//select[@aria-label='rows per page']")
    public WebElement rowDropdown;

    @FindBy(xpath = "//select[@aria-label='rows per page']/option")
    public List<WebElement> rowNums;

}
