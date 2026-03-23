package com.myfirstrestassured_04_TEST_NG_Advance_Examples;

import org.testng.annotations.Test;

public class Test_Ng_07_AlwaysRun {
    @Test(alwaysRun = true)
    public void test01() {
        System.out.printf("TC01");
    };
    @Test
    public void test02() {
        System.out.printf("TC02");
    }
}
