package com.myfirstrestassured_04_TEST_NG_Advance_Examples;

import io.restassured.RestAssured;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Ng_05_Parameter {
@Parameters("browser")
    @Test
    public void test01(String value){
        System.out.printf("learning Param");
        if (value.equalsIgnoreCase("firefox"));
    {
        System.out.printf("Running on Firefox");
    }
    if (value.equalsIgnoreCase("chrome"));
    {
        System.out.printf("Running on Chrome");
    }

    }

}
