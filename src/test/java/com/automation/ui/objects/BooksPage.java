package com.automation.ui.objects;
import com.automation.ui.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;

import java.util.List;

public class BooksPage extends BasePage {
    public BooksPage(WebDriver driver) {
        super(driver);
    }
    public List<String> listOfMainMenu;
    public List<String> expectedStringListOfMainMenu=new ArrayList<>();
    public String authorOfBookText;
    public String nameOfBookText;

    public List<String> expectedListOfMainMenu;
    private By bookUnknownDaughterLocator = By.xpath("//*[text()='Незнакомая дочь']");
    private By listOfMainMenuSelector = By.xpath("//*[@class='h-nav to-mob']/li/a");
    public String baseUrl = "https://vknige.net/";


    public void openBookInfo() {

        WebElement bookUnknownDaughter = driver.findElement(bookUnknownDaughterLocator);
        bookUnknownDaughter.click();
    }

    public void getInfoAboutBook() {
        WebElement nameOfBook = driver.findElement(By.xpath("//h1"));
        nameOfBookText = nameOfBook.getText();
        WebElement authorOfBook = driver.findElement(By.xpath("//*[@id='author']/a/span/span"));
        authorOfBookText = authorOfBook.getText();
        System.out.println(nameOfBookText);
        System.out.println(authorOfBookText);

    }

    public void goToMainPage() {

        driver.get(baseUrl);


    }

    public void getListPartsOfMainPage() {
        driver.get(baseUrl);
        listOfMainMenu=new ArrayList<>();
        List<WebElement> myElements = driver.findElements(listOfMainMenuSelector);
        for(WebElement e : myElements) {
            listOfMainMenu.add(e.getText());

        }

        expectedStringListOfMainMenu.add(0,"ГЛАВНАЯ");
        expectedStringListOfMainMenu.add(1,"ЖАНРЫ");
        expectedStringListOfMainMenu.add(2,"АВТОРЫ");
        expectedStringListOfMainMenu.add(3,"СЕРИИ");
        expectedStringListOfMainMenu.add(4,"ТОП 100");
        expectedStringListOfMainMenu.add(5,"ПОДБОРКИ");
        expectedStringListOfMainMenu.add(6,"#ОстаньтесьДома");
        expectedStringListOfMainMenu.add(7,"ОПРОС");
        expectedStringListOfMainMenu.add(8,"СЛУЧАЙНАЯ");
        //expectedStringListOfMainMenu.toString();
    }
}