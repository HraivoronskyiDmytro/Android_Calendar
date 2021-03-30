package tests;

import org.testng.annotations.Test;
import pages.MenuPage;
import pages.NewEventPage;
import pages.SearchPage;
import utils.BaseTest;

public class kfzTest extends BaseTest {

    @Test
    public void calendarEventTest(){
        mainPage.tapMenu();
        menuPage= new MenuPage(driver);
        menuPage.selectDay();
        mainPage.tapNewItem();
        mainPage.tapNewEvent();
        newEventPage= new NewEventPage(driver);
        newEventPage.enterEventTitle();
        newEventPage.saveEvent();
        mainPage.tapMenu();
        menuPage.tapSearch();
        searchPage= new SearchPage(driver);
        searchPage.searchEvent();
        searchPage.checkEventPresent();
        takeScreenshot();
    }
}
