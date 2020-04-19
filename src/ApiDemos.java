import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class ApiDemos extends Base {

    static AndroidDriver<AndroidElement> driver;
    public static void main(String[] args) throws MalformedURLException {

        driver = ApiDemoCapabilities();
        driver.startActivity(new Activity("io.appium.android.apis","ApiDemos"));

        ApiDemos apiDemos = new ApiDemos();
        apiDemos.longClick();

    }

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
}
