package com.emi.calculator.pom.screen;

import com.aventstack.extentreports.Status;
import com.emi.calculator.pom.report.ReportTestManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BaseScreen extends Screen {
    public BaseScreen(AndroidDriver driver) {
        super(driver);
    }


    @Override
    public WebElement getWebElement(By selector) {
        WebElement webElement = null;
        try {
            addInfo(selector.toString() + " going to operate");
            waitForWebElement(selector);
            webElement = driver.findElement(selector);
            addInfo(selector.toString() + " already did successfully operation");
        } catch (Exception e) {
            System.out.println(selector.toString() + " Select or Locator Not Found");
        }
        return webElement;
    }

    @Override
    public List<WebElement> getWebElements(By selector) {
        List<WebElement> webElements = null;
        try {

            waitForWebElement(selector);
            webElements = driver.findElements(selector);
            addInfo(selector.toString() + " already did successfully operation");
        } catch (Exception e) {
            System.out.println(selector.toString() + " Select or Locator Not Found");
        }
        return webElements;
    }

    @Override
    public void waitForWebElement(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            System.out.println(locator.toString() + " Select or Locator Not Found");
        }

    }

    public void addInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.INFO, message);
        }
    }
}
