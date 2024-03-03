package com.sample.calculator;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

public class AppiumMethodsSimpleCalculatorTest extends BaseSimpleCalculatorTest {
    @Test
    public void checkOrientation() throws InterruptedException {
        Thread.sleep(2000);
        driver.rotate(ScreenOrientation.LANDSCAPE);
        takeScreenshot("LANDSCAPE");
        Thread.sleep(2000);
        driver.rotate(ScreenOrientation.PORTRAIT);
        takeScreenshot("PORTRAIT");
        System.out.println( driver.getLocation().getLatitude()+" "+driver.getLocation().getLongitude());
    }
}
