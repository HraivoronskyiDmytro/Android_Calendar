package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pages.objects.MainPageObjects;
import utils.Common;

public class MainPage extends Common {

    private MainPageObjects mainPageObjects = new MainPageObjects();

    public MainPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), mainPageObjects);
    }

    public void tapMenu() {
        getElement(mainPageObjects.menuButton).click();
    }

    public void tapNewEvent() {
        getElement(mainPageObjects.newEventButton).click();
    }

    public void tapNewItem() {
        getElement(mainPageObjects.newItemButton).click();
    }
}
