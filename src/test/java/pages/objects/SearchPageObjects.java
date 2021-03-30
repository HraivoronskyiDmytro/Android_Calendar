package pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchPageObjects {

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'search_text')]")
    public MobileElement searchInput;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'kfz24_tech_task')]")
    public MobileElement kfz24_tech_task;
}
