package com.demoqa.pages;

import com.demoqa.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Books_Page extends Base_Page{

    public Books_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div/div")
    public List<WebElement> bookTextList;


}
