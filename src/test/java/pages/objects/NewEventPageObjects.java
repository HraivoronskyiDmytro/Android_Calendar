package pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewEventPageObjects {

    @AndroidFindBy(id = "//*[contains(@resource-id,'title')]")
    public MobileElement titleInput;

    @AndroidFindBy(id = "//*[contains(@resource-id,'save')]")
    public MobileElement saveButton;
}
