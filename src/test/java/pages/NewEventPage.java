package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pages.objects.NewEventPageObjects;
import utils.Common;

public class NewEventPage extends Common {

    private NewEventPageObjects newEventPageObjects = new NewEventPageObjects();

    public NewEventPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), newEventPageObjects);
    }

    public void enterEventTitle() {
        getElement(newEventPageObjects.titleInput).sendKeys("kfz24_tech_task");
    }

    public void saveEvent() {
        getElement(newEventPageObjects.saveButton).click();
    }


}
