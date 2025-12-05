package com.myfirstrestassured;

import io.restassured.RestAssured;

public class tryingpush {
    public static void main(String[] args) {
        RestAssured.given().baseUri("https://www.google.com/").log().all().when().get().then().log().all();
    }
}
