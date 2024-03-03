package com.emi.calculator.pom.testcases;

import com.emi.calculator.pom.screen.CompareLoanScreen;
import com.emi.calculator.pom.screen.LandingScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareLoanScreenTest extends BaseTest {
    CompareLoanScreen compareLoanScreen;
    @Test(priority = 0)
    public void checkCompareLoanScreen() {
        LandingScreen landingScreen = screen.getInstance(LandingScreen.class);
        Assert.assertTrue(landingScreen.isLandingScreen());

         compareLoanScreen = landingScreen
                .clickCompareLoanBtn();
        Assert.assertTrue(compareLoanScreen.isCompareLoanScreen());
    }

    @Test(priority = 1)
    public void compareLoanShouldSucceed(){
        compareLoanScreen=compareLoanScreen
                .fillLoan1Amount(15000)
                .fillInterest1(10)
                .fillMonth(18)
                .fillLoan2Amount(150000)
                .fillInterest2(11)
                .fillMonth2(19)
                .tapCalculateBtn();
        Assert.assertTrue(compareLoanScreen.hasResultLayout());
    }

    @Test(priority = 2)
    public void resetLoanShouldSucceed(){
        compareLoanScreen=compareLoanScreen
                .tapResetBtn();
        Assert.assertFalse(compareLoanScreen.hasResultLayout());
    }
}
