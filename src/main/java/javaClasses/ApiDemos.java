package javaClasses;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class ApiDemos extends Base {

    static AndroidDriver<AndroidElement> driver;
    TouchAction t;
    public static void main(String[] args) throws MalformedURLException {

        driver = ApiDemoCapabilities();
        driver.startActivity(new Activity("io.appium.android.apis","javaClasses.ApiDemos"));

        ApiDemos apiDemos = new ApiDemos();
        //apiDemos.longClick();
        //apiDemos.swipeTime();
        //apiDemos.scrolling();
        apiDemos.drag();

    }

    //Long click on an object
    private void longClick() {
        driver.findElementByXPath("//android.widget.TextView[@text=\"Views\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@text=\"Expandable Lists\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@text=\"1. Custom Adapter\"]").click();
        //driver.findElementByXPath("(//android.widget.TextView)[0]").click();

        //Long click on People names

        TouchAction t = new TouchAction(driver);
        WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text=\"People Names\"]");
        t.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement sampleMenu = driver.findElementByXPath("//android.widget.TextView[@text=\"Sample menu\"]");
        System.out.println(sampleMenu.isDisplayed());

    }

    //Change the time to 3:45 by swiping to 45
    private void swipeTime() {
        driver.findElementByXPath("//android.widget.TextView[@text=\"Views\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
        driver.findElementByXPath("//*[@content-desc='3']").click();

        WebElement min15 = driver.findElementByXPath("//*[@content-desc='25']");
        WebElement min45 = driver.findElementByXPath("//*[@content-desc='45']");

        t = new TouchAction(driver);
        t.longPress(longPressOptions().withElement(element(min15)).withDuration(ofSeconds(1)))
                .moveTo(element(min45)).release().perform();
    }

    private void scrolling() {
        driver.findElementByXPath("//android.widget.TextView[@text=\"Views\"]").click();
        //WebElement webView = driver.findElementByXPath("//android.widget.TextView[@text='WebView']");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();

    }

    private void drag() {
        driver.findElementByXPath("//android.widget.TextView[@text=\"Views\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@text=\"Drag and Drop\"]").click();
        WebElement start = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
        WebElement stop = driver.findElementById("io.appium.android.apis:id/drag_dot_3");
        //WebElement start = driver.findElementByXPath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_1]")
        t = new TouchAction(driver);
        //t.longPress(longPressOptions().withElement(element(start))).moveTo(element(stop)).release().perform(); this also works
        t.longPress(element(start)).moveTo(element(stop)).release().perform();

    }

}
