import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class DeskClock extends Base{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();

        System.out.println("Launched clock app");
        driver.findElementByAndroidUIAutomator("text(\"Alarm\")").click();

        TouchAction t = new TouchAction(driver);
        //t.tap(tapOptions().withElement())

    }
}