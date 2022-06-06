package com.base.web.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".searchbox")
    WebElement optionLocator;

    @FindBy(xpath = "//input[@type='search']")
    WebElement searchFieldLocator;

    @FindBy(xpath = "//form[@id='form-search']")
    WebElement formLocator;

    public void selectOption(String textToSearch) throws InterruptedException {
        optionLocator.click();
        searchFieldLocator.sendKeys(textToSearch);
        searchFieldLocator.sendKeys(Keys.ENTER);
    }
}
