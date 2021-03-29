package tests;

import org.testng.annotations.Test;
import utils.BaseTest;

public class kfzTest extends BaseTest {

    @Test
    public void calendarEventTest(){
        mainPage.tapMenu();
        menuPage.selectDay();
        mainPage.tapNewItem();
        mainPage.tapNewEvent();
        newEventPage.enterEventTitle();
        newEventPage.saveEvent();
        mainPage.tapMenu();
        menuPage.tapSearch();
        searchPage.searchEvent();
        searchPage.checkEventPresent();
        takeScreenshot();


    }


}
