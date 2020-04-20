# Appium


If your chromedriver is an old one, update it with below command while launching appium
    
    appium --allow-insecure chromedriver_autodownload
    or run it locally
    appium --chromedriver-executable /path/to/my/chromedriver    
If you are unable to launch downloaded chromedriver in mac, execute the below command

     xattr -d com.apple.quarantine <name-of-executable

Different ways of finding objects

     driver.findElementByXPath("//android.widget.TextView[@text='text']").click();
     driver.findElementByXPath("//android.widget.TextView[@text='text']").click();
     driver.findElementById("android:id/checkbox").click();
     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
     driver.findElementsByClassName("android.widget.Button").get(1).click();
     driver.findElementByXPath("//*[@content-desc='3']").click();
By using AndroidUIAutomator

     driver.findElementByAndroidUIAutomator("text(\"Alarm\")").click();