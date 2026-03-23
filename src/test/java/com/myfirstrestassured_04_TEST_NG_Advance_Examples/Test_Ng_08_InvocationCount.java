package com.myfirstrestassured_04_TEST_NG_Advance_Examples;

import org.testng.annotations.Test;
//Invocation count means how many time a test case need to be run
public class Test_Ng_08_InvocationCount {
    @Test(invocationCount = 2)
public void test01() {
    System.out.printf("TC01");
};
    @Test(invocationCount = 4)
    public void test02() {
        System.out.printf("TC02");
    }
}
