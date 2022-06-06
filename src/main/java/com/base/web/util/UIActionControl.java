package com.base.web.util;

import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@NoArgsConstructor
public class UIActionControl extends Driver {

    private static volatile UIActionControl instanceUIActionControl;

    public static synchronized UIActionControl getInstance() {
        return (instanceUIActionControl == null) ? instanceUIActionControl = new UIActionControl() : instanceUIActionControl;
    }

    public void mouseHover(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void scrollDown(WebElement element) {
        Actions act =  new Actions(driver);
        act.moveToElement(element).click().perform();
    }
}
