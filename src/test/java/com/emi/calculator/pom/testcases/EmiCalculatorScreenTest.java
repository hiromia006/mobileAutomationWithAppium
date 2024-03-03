package com.emi.calculator.pom.testcases;

import com.emi.calculator.pom.screen.EmiCalculatorScreen;
import com.emi.calculator.pom.screen.EmiDetailScreen;
import com.emi.calculator.pom.screen.LandingScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorScreenTest extends BaseTest {
    EmiCalculatorScreen emiCalculatorScreen;
    EmiDetailScreen emiDetailScreen;

    @Test(priority = 0)
    public void calCalculateEmiShouldSucceed() {
        LandingScreen landingScreen = screen.getInstance(LandingScreen.class);
        emiCalculatorScreen = landingScreen
                .clickEmiCalculatorBtn();

        emiCalculatorScreen = emiCalculatorScreen
                .fillLoanAmount(50000)
                .fillInterestRate(10)
                .fillYear(2)
                .fillIMonth(7)
                .fillProcessFee(2)
                .clickCalculateBtn();

//        EmiCalculatorScreen emiCalculatorScreen2 = screen.getInstance(LandingScreen.class)
//                .clickEmiCalculatorBtn()
//                .fillLoanAmount(50000)
//                .fillInterestRate(10)
//                .fillYear(2)
//                .fillIMonth(7)
//                .fillProcessFee(2)
//                .clickCalculateBtn();

        Assert.assertTrue(emiCalculatorScreen.isEmiDetailBtn());
    }

    @Test(priority = 1)
    public void resetEmiShouldSucceed() {
        emiCalculatorScreen = emiCalculatorScreen
                .resetCalculateBtn();
        Assert.assertFalse(emiCalculatorScreen.isEmiDetailBtn());
    }

    @Test(priority = 2)
    public void checkEmiDetail() {
        emiCalculatorScreen = emiCalculatorScreen
                .fillLoanAmount(50000)
                .fillInterestRate(10)
                .fillYear(2)
                .fillIMonth(7)
                .fillProcessFee(2)
                .clickCalculateBtn();

        emiDetailScreen = emiCalculatorScreen
                .clickEmiDetailBtn();
        Assert.assertTrue(emiDetailScreen.isLayoutDetailContainer());
    }

    @Test(priority = 3)
    public void checkBackFromDetail() {
        emiCalculatorScreen = emiDetailScreen
                .clickBackBtn();
        Assert.assertTrue(emiCalculatorScreen.isEmiDetailBtn());
    }
}
