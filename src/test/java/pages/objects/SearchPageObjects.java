package pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchPageObjects {

    @AndroidFindBy(id = "//*[contains(@resource-id,'search_text')]")
    public MobileElement searchInput;

    @AndroidFindBy(id = "//*[contains(@content-desc,'kfz24_tech_task')]")
    public MobileElement kfz24_tech_task;
}
