package com.automation.ui.tests;
import com.automation.ui.TestBase;
import com.automation.ui.objects.BooksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookTest extends TestBase {
    private BooksPage booksPage;
    String baseUrl = "https://vknige.net/";
    @Test
    public void bookTest(){
        booksPage = new BooksPage(driver);
        booksPage.goToMainPage();
        booksPage.openBookInfo();
        booksPage.getInfoAboutBook();
        Assert.assertEquals(booksPage.authorOfBookText,"Элена Ферранте");
        Assert.assertEquals(booksPage.nameOfBookText,"Незнакомая дочь");

    }
    @Test
    public void goToMainPage() {
        driver.get(baseUrl);
        String projectTitle = driver.getTitle();
        System.out.println(projectTitle);
        String projectTitleExpected = "Скачивайте книги бесплатно. Формат fb2, без регистрации - ВКниге";
        Assert.assertEquals(projectTitle, projectTitleExpected);
    }
    @Test
    public void getListMainMenu() {
        booksPage = new BooksPage(driver);
        booksPage.goToMainPage();
        booksPage.getListPartsOfMainPage();
        Assert.assertEquals(booksPage.listOfMainMenu,booksPage.expectedStringListOfMainMenu);
    }
    @Test
    public void getListMainMenuOnSidebar() {
        booksPage = new BooksPage(driver);
        booksPage.goToMainPage();
        booksPage.getListPartsOfMainPageOnSidebar();
        Assert.assertEquals(booksPage.listOfMainMenuSide,booksPage.expectedListOfMainMenuOnSidebar);
    }
}
