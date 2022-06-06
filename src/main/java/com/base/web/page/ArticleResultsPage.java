package com.base.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ArticleResultsPage {

    WebDriver driver;

    public ArticleResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//article//a")
    List<WebElement> articleList;

    public boolean doesArticleExists(String articleName) {
        boolean findIt = false;
        for(WebElement item : articleList) {
            if (item.getText().equalsIgnoreCase(articleName)) {
                findIt = true;
                break;
            }
        }
        return findIt;
    }
}
