package com.base.web.util;

import com.base.web.model.PostDetail;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataControl {

    private static volatile DataControl instanceDataControl;

    public static synchronized DataControl getInstance() {
        return (instanceDataControl == null) ? instanceDataControl = new DataControl() : instanceDataControl;
    }

    public boolean findElementInList(List<WebElement> listOfWebElements, String element) {
        boolean doYouFindIt = false;
        for (WebElement item : listOfWebElements) {
            if (item.getText().equalsIgnoreCase(element)) {
                doYouFindIt = true;
            }
        }
        return doYouFindIt;
    }

    public void pickItemFromList(List<WebElement> listOfWebElements, String itemName) {
        for (WebElement item : listOfWebElements) {
            if (item.getText().equalsIgnoreCase(itemName)) {
                item.click();
                break;
            }
        }
    }
}
