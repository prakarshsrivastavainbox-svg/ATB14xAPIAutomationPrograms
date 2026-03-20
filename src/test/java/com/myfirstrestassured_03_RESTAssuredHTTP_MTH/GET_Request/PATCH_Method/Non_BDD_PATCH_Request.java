package com.myfirstrestassured_03_RESTAssuredHTTP_MTH.GET_Request.PATCH_Method;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Non_BDD_PATCH_Request  {

    RequestSpecification r;
    Response res;
    ValidatableResponse vr;


    @Test
    public void test_put_non_bdd(){

        String token = "de88db00c339886";
        String Bookind_ID = "2601";
        String Payload = "{\n" +
                "    \"firstname\" : \"Prakarsh\",\n" +
                "    \"lastname\" : \"Srivastava\",\n" +
                "}";

        ///  Request Sepcification
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+Bookind_ID);
        r.contentType(ContentType.JSON);
        //r.header("Cookie", "token=" + token);
        r.cookie("token", token); //Token of the API, there are other syntax as well
        //r.auth().digest();
        //r.auth().basic();
        r.body(Payload).log().all();
        // Part - 2 --- response
        res = r.when().log().all().patch();
        //part 3 --- Validation
        vr =res.then().log().all();
        vr.statusCode(200);



    }


}
