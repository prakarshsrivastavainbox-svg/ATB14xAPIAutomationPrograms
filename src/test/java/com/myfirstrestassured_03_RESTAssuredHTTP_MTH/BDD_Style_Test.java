package com.myfirstrestassured_03_RESTAssuredHTTP_MTH;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class BDD_Style_Test {
    @Test
    public void test_GET_POSITIVE(){
        String pincode = "560058";
        pincode ="110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                    .get()
                    .then()
                    .log()
                .all()
                .statusCode(200);
    }
}
