package com.emi.calculator.pom.testcases;

import com.emi.calculator.pom.screen.LandingScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingScreenTest extends BaseTest {

    @Test
    public void checkLandingScreen() {
        LandingScreen landingScreen = screen.getInstance(LandingScreen.class);
        Assert.assertTrue(landingScreen.isLandingScreen());
    }
}
