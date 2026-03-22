package com.myfirstrestassured_04_TEST_NG_Advance_Examples;

import org.testng.annotations.Test;
//If we give negative priority it will be considered as 0, which is
//by default the highest priority
public class TestNG_Priority {
    @Test (priority = 1)
    public void firstTC(){
        System.out.println("First TC1");
    };
    @Test (priority = 3)
    public void secondTC(){
        System.out.println("First TC2");
    };
    @Test (priority = 2)
    public void thirdTC(){
        System.out.println("First TC3");
    };
}
