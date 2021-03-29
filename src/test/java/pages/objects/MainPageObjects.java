package pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainPageObjects {

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'floating_action_button')]")
    public MobileElement newItemButton;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'speed_dial_event_container')]//*[contains(@resource-id,'speed_dial_icon')]")
    public MobileElement newEventButton;

    @AndroidFindBy(xpath = " //*[contains(@resource-id,'toolbar')]/android.widget.ImageButton")
    public MobileElement menuButton;
}
