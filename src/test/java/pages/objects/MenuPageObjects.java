package pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPageObjects {

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]")
    public MobileElement dayButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[6]")
    public MobileElement searchButton;
}
