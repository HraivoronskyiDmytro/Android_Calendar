package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.objects.SearchPageObjects;
import utils.Common;

public class SearchPage extends Common {

    private SearchPageObjects searchPageObjects = new SearchPageObjects();

    public SearchPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), searchPageObjects);
    }

    public void searchEvent() {
        getElement(searchPageObjects.searchInput).sendKeys("kfz24_tech_task\\n");
    }

    public void checkEventPresent() {
        Assert.assertTrue(getElement(searchPageObjects.kfz24_tech_task).isDisplayed());
    }
}
