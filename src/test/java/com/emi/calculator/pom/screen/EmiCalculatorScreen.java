package com.emi.calculator.pom.screen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmiCalculatorScreen extends BaseScreen {
    public EmiCalculatorScreen(AndroidDriver driver) {
        super(driver);
    }

    public EmiCalculatorScreen fillLoanAmount(int amount) {
        getWebElement(By.id("etLoanAmount")).sendKeys(String.valueOf(amount));
        return this;
    }

    public EmiCalculatorScreen fillInterestRate(int rate) {
        getWebElement(By.id("etInterest")).sendKeys(String.valueOf(rate));
        return this;
    }

    public EmiCalculatorScreen fillYear(int year) {
        getWebElement(By.id("etYears")).sendKeys(String.valueOf(year));
        return this;
    }

    public EmiCalculatorScreen fillIMonth(int month) {
        getWebElement(By.id("etMonths")).sendKeys(String.valueOf(month));
        return this;
    }

    public EmiCalculatorScreen fillProcessFee(int fee) {
        getWebElement(By.id("etFee")).sendKeys(String.valueOf(fee));
        return this;
    }

    public EmiCalculatorScreen clickCalculateBtn() {
        getWebElement(By.id("btnCalculate")).click();
        return this;
    }

    public EmiCalculatorScreen resetCalculateBtn() {
        getWebElement(By.id("btnReset")).click();
        return this;
    }

    public EmiDetailScreen clickEmiDetailBtn() {
        getWebElement(By.id("btnDetail")).click();
        return getInstance(EmiDetailScreen.class);
    }

    public boolean isEmiDetailBtn() {
        return getWebElements(By.id("btnDetail")).size() > 0;
    }
}
