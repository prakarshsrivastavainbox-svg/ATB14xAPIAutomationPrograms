package com.myfirstrestassured_04_TEST_NG_Advance_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_beforeRunTest {

    @BeforeTest
    public void get_token(){
        System.out.println("Get Token");
    };
    @BeforeTest
    public void get_booId(){
        System.out.println("get book");
    };
    @Test
    public void put_book(){
        System.out.println("Put Book");
    }
    @AfterTest
    public void close(){
        System.out.println("closing");
    }

}
