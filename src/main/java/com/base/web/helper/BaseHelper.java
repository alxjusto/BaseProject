package com.base.web.helper;

import com.base.web.page.ArticleResultsPage;
import com.base.web.page.HomePage;
import com.base.web.util.Driver;

public class BaseHelper extends Driver {

    HomePage homePage = new HomePage(driver);
    ArticleResultsPage articleResultsPage = new ArticleResultsPage(driver);


    public void choseMenuOption(String textToSearch) throws InterruptedException {
        homePage.selectOption(textToSearch);
    }

    public boolean obtainArticleName(String articleName) {
        return articleResultsPage.doesArticleExists(articleName);
    }
}

