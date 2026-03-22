package com.myfirstrestassured_04_TEST_NG_Advance_Examples;

import org.testng.annotations.Test;
/* These Grops Test cases are run with the help of Xml file*/


public class TestNg_groups {
    @Test(groups ={"smoke","san"})
    public void firstTC(){
        System.out.println("First TC1");
    };
    @Test (groups ={"reg"})
    public void secondTC(){
        System.out.println("First TC2");
    };
    @Test (groups ={"san"})
    public void thirdTC(){
        System.out.println("First TC3");
    };
}
