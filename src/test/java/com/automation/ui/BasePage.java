package com.automation.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver=driver;
    }


    public WebDriverWait waitFor() {
        return new WebDriverWait(driver, 4);
    }
}
