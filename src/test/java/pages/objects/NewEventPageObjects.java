package pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewEventPageObjects {

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'title')]")
    public MobileElement titleInput;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'save')]")
    public MobileElement saveButton;
}
