import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Browser extends Base {
    static AndroidDriver<AndroidElement> driver;

    public static void main(String[] args) throws MalformedURLException {
        driver = BrowserCapabilities();

    }
}