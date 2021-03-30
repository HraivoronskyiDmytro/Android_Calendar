package utils;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.MenuPage;
import pages.MainPage;
import pages.NewEventPage;
import pages.SearchPage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest {

    private Logger logger = Logger.getLogger(BaseTest.class);
    protected AppiumDriver driver;
    protected MainPage mainPage;
    protected MenuPage menuPage;
    protected NewEventPage newEventPage;
    protected SearchPage searchPage;

    @BeforeSuite
    public void connect() throws Exception {
        this.driver = new Appium().init();
        driver.activateApp("com.google.android.calendar");
        mainPage= new MainPage(driver);
    }

    @BeforeMethod
    public void beforeMethod(Method testMethod, ITestContext testContext) {
        String className = testMethod.getDeclaringClass().getSimpleName();
        String methodName = testMethod.getName();
        String testName = testContext.getName();
        logger.info("\n\n:::\nStarting test: " + testName + "." + className + "." + methodName);
    }

    @AfterMethod
    public void shutDown() {
        logger.info("\n\n:::\nTest End");
        driver.resetApp();
    }

    protected void takeScreenshot(){
        File file  = driver.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(new SimpleDateFormat("yyyyMMddHHmm").format(new Date())+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
