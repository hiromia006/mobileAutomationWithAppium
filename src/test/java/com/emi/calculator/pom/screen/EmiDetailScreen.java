package com.emi.calculator.pom.screen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmiDetailScreen extends BaseScreen {
    public EmiDetailScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean isLayoutDetailContainer() {
        return getWebElements(By.id("layoutDetailContainer")).size() > 0;
    }

    public EmiCalculatorScreen clickBackBtn() {
        getWebElement(By.id("actionMenuBack")).click();
        return getInstance(EmiCalculatorScreen.class);
    }
}
