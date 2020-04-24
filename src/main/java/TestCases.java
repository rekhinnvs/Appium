import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TestCases extends Base {

    public static void main(String[] args) throws MalformedURLException{

        AndroidDriver<AndroidElement> driver = Capabilities();
        System.out.println("Waiting");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Waiting is over");
        //AndroidElement calculatorMode = driver.findElementByXPath("//android.widget.Button[@resource-id=com.google.android.calculator:id/mode");

        driver.findElementById("com.google.android.calculator:id/digit_5").click();
        driver.findElementById("com.google.android.calculator:id/digit_3").click();

        driver.findElementById("com.google.android.calculator:id/op_div").click();

        driver.findElementByXPath("//android.widget.Button[@text=4]").click();


    }
}
