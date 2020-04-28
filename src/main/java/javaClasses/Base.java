package javaClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "13d56a3c");

        //if the application is given as an apk file
        //File appDir = new File("jars");
        //File app = new File(appDir, "original.apk");

        //cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());

        //Test Application name : io.appium.android.apis

        //cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"com.google.android.calculator");
        //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

        //cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"com.google.android.calculator");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");


        cap.setCapability("appPackage", "com.google.android.deskclock");
        cap.setCapability("appActivity", "com.android.deskclock.javaClasses.DeskClock");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);


        //driver.startActivity(calculatorActivity);
        //driver.startActivity(new Activity("com.google.android.calculator","com.android.calculator2.Calculator"));

        System.out.println("Driver initiated");
        return driver;
    }


    public static AndroidDriver<AndroidElement> ApiDemoCapabilities() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "13d56a3c");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        //if the application is given as an apk file
        //File appDir = new File("jars");
        //File app = new File(appDir, "original.apk");

        //cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Driver initiated");
        return driver;

    }

    public static AndroidDriver<AndroidElement> BrowserCapabilities() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "13d56a3c");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("Driver initiated");
        return driver;

    }
}
