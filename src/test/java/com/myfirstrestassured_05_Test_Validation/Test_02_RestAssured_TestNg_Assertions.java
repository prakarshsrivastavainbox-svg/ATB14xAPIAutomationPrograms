package com.myfirstrestassured_05_Test_Validation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_02_RestAssured_TestNg_Assertions {
    @Test
    public void test_RestAssured_Test_Hard_Assertions() {
        System.out.println("Hard Assertions");
        Assert.assertEquals("Prakarsh","prakarsh");
        System.out.println("Hard Assertions Passed");

    };
    @Test
    public void test_RestAssured_Test_Soft_Assertions() {
        System.out.println("SoftAssertions");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Prakarsh","prakarsh");
        System.out.println("SoftAssertions Passed");
    }
}
