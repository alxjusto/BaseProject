package com.base.web.util;

import com.base.web.enums.Constant;
import com.base.web.enums.Value;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    protected static WebDriver driver;

    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Value.IMPLICIT_WAIT_TIME.get(), TimeUnit.SECONDS);
        driver.get(Constant.PERU_RAIL_URL.get());
    }

    public void exitDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
