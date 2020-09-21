package com.automation.ui.objects;

import com.automation.ui.BasePage;
import com.automation.ui.TestBase;
import org.openqa.selenium.WebDriver;

public class BookObject extends BasePage {
    public  BookObject(WebDriver driver){
        super(driver);
    }
    private String name;
    private String author;
    private int countDownloads;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountDownloads() {
        return countDownloads;
    }

    public void setCountDownloads(int countDownloads) {
        this.countDownloads = countDownloads;
    }

    @Override
    public String toString() {
        return "BookObject{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", countDownloads=" + countDownloads +
                '}';
    }
}
