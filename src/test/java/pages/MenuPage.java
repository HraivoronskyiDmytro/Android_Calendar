package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pages.objects.MenuPageObjects;
import utils.Common;

public class MenuPage extends Common {

    private MenuPageObjects menuPageObjects = new MenuPageObjects();

    public MenuPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), menuPageObjects);
    }

    public void tapSearch() {
        getElement(menuPageObjects.searchButton).click();
    }

    public void selectDay() {
        getElement(menuPageObjects.dayButton).click();
    }


}
