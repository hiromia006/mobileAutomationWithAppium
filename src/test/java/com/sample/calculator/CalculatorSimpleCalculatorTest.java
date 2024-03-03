package com.sample.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSimpleCalculatorTest extends BaseSimpleCalculatorTest {
    @Test
    public void addShouldSucceed() {
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("btn_5")).click();

        driver.findElement(By.id("plus")).click();

        driver.findElement(By.id("btn_4")).click();
        driver.findElement(By.id("btn_9")).click();

        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText(), "144");
        takeScreenshot("addShouldSucceed");

    }

    @Test
    public void subtractionShouldSucceed() {
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("minus")).click();

        driver.findElement(By.id("btn_4")).click();

        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText(), "5");
        takeScreenshot("subtractionShouldSucceed");

    }

    @Test
    public void divideShouldSucceed() {
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("btn_5")).click();

        driver.findElement(By.id("divi")).click();

        driver.findElement(By.id("btn_5")).click();
//        driver.findElement(By.id("btn_9")).click();

        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText(), "19");

    }

    @Test
    public void multiShouldSucceed() {
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("_0p_1")).click();

        driver.findElement(By.id("multi")).click();
        driver.findElement(By.id("btn_8")).click();

        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText(), "720");

    }
}
