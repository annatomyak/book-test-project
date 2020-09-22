package com.automation.ui.objects;
import com.automation.ui.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import java.util.ArrayList;

import java.util.List;

public class BooksPage extends BasePage {
    public BooksPage(WebDriver driver) {
        super(driver);
    }
    public List<String> listOfMainMenu;
    public List<String> listOfMainMenuOnSidebar;
    public List<String> expectedListOfMainMenuOnSidebar;
    public List<String> listOfMainMenuSide;
    public List<String> expectedStringListOfMainMenu=new ArrayList<>();
    public String authorOfBookText;
    public String nameOfBookText;
    private By bookUnknownDaughterLocator = By.xpath("//*[text()='Незнакомая дочь']");
    private By listOfMainMenuSelector = By.xpath("//*[@class='h-nav to-mob']/li/a");
    private By listOfMainMenuOnSidebarSelector = By.xpath("//*[@class='side-bc']/li/a");
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

    }

    public void getListPartsOfMainPageOnSidebar() {
        driver.get(baseUrl);
        listOfMainMenuOnSidebar=new ArrayList<>();
        listOfMainMenuSide=new ArrayList<>();

        List<WebElement> myElements = driver.findElements(listOfMainMenuOnSidebarSelector);
        for(WebElement e : myElements) {
            listOfMainMenuOnSidebar.add(e.getText());

        }
        listOfMainMenuSide=listOfMainMenuOnSidebar.subList(0,5);

        expectedListOfMainMenuOnSidebar=new ArrayList<>();
        expectedListOfMainMenuOnSidebar.add(0,"Главная страница");
        expectedListOfMainMenuOnSidebar.add(1,"Библиотека");
        expectedListOfMainMenuOnSidebar.add(2,"Стол заказов");
        expectedListOfMainMenuOnSidebar.add(3,"Полные версии книг");

        expectedListOfMainMenuOnSidebar.add(4,"Добавить книгу");


    }
}