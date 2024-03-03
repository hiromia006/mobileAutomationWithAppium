package com.emi.calculator.pom.screen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LandingScreen extends BaseScreen {
    public LandingScreen(AndroidDriver driver) {
        super(driver);
    }

    public EmiCalculatorScreen clickEmiCalculatorBtn() {
        getWebElement(By.id("btnStart")).click();
        return getInstance(EmiCalculatorScreen.class);
    }

    public CompareLoanScreen clickCompareLoanBtn() {
        getWebElement(By.id("btnCompare")).click();
        return getInstance(CompareLoanScreen.class);
    }

    public boolean isLandingScreen() {
        return getWebElements(By.id("btnStart")).size() > 0;
    }
}
