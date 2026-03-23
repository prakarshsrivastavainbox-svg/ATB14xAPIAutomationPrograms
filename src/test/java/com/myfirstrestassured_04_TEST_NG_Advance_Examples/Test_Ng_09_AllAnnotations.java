package com.myfirstrestassured_04_TEST_NG_Advance_Examples;

import org.testng.annotations.*;

public class Test_Ng_09_AllAnnotations {
    @BeforeSuite
    public void test01() {
        System.out.printf("Before suite");
    };
    @BeforeClass
    public void test02() {
        System.out.printf("Before class");
    };
    @BeforeMethod // Mostly used
    public void test03() {
        System.out.printf("Before Method");
    };
    @BeforeTest// Mostly used
    public void test09() {
        System.out.println ("Before Test");
    };
    @Test // Mostly used
    public void test04() {
        System.out.printf("Before Test");
    };
    @AfterMethod// Mostly used
    public void test05() {
        System.out.printf("After method");
    };
    @AfterClass
    public void test06() {
        System.out.printf("After class");
    };
    @AfterTest// Mostly used
    public void test07() {
        System.out.printf("After Test");
    };
}
