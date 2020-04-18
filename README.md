# Appium
Learn appium

Different ways of finding objects

     driver.findElementByXPath("//android.widget.TextView[@text='text']").click();
     driver.findElementByXPath("//android.widget.TextView[@text='text']").click();
     driver.findElementById("android:id/checkbox").click();
     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
     driver.findElementsByClassName("android.widget.Button").get(1).click();

