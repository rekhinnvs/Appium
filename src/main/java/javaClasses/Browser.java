package javaClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Browser extends Base {
    static AndroidDriver<AndroidElement> driver;

    public static void main(String[] args) throws MalformedURLException {
        driver = BrowserCapabilities();
        Browser b = new Browser();
        //b.facebook();
        b.cricbuzz();
    }

    private void facebook() {
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //driver.findElementByXPath("//*[@id=\"m_login_email\"]").sendKeys("dracksagain@gmail.com");
        //driver.findElementByName("email").sendKeys("dracksagain@gmail");
        driver.findElementByXPath("//input[@id='m_login_email']").sendKeys("hello");
    }

    private void cricbuzz() {
        driver.get("https://m.cricbuzz.com/");
        driver.findElementByXPath("/html/body/div/div[3]/div[2]/a");
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElementByXPath("//a[@href='#menu']").click();
        driver.findElementByXPath("//a[@title='Cricbuzz Home']").click();
        JavascriptExecutor jse = driver;
        jse.executeScript("window.scrollBy(0,1200)");

        String socialChannel = driver.findElementByXPath("//a[@title='Contact Us']").getAttribute("class");
        System.out.println(socialChannel.contains("head"));

    }
}