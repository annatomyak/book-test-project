package com.automation.ui.tests;
import com.automation.ui.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tests extends TestBase {
    String baseUrl = "https://vknige.net/";

    @Test
    public void goToMainPage() {
        driver.get(baseUrl);
        String projectTitle = driver.getTitle();
        System.out.println(projectTitle);
        String projectTitleExpected = "Скачивайте книги бесплатно. Формат fb2, без регистрации - ВКниге";
        Assert.assertEquals(projectTitle, projectTitleExpected);
    }




    }
