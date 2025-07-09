package org.example;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Main {

  // @Test
   public void test01() {
      RestAssured.baseURI = "https://reqres.in/api/users?page=2";
      RestAssured.when().get().then().statusCode(200).log().all();
   }
   @Test
   public void test02(){
      Response res = RestAssured.get("https://reqres.in/api/users?page=2");
      System.out.println(res.statusCode());
      System.out.println(res.body().asString());
      System.out.println(res.header("content-type"));
      System.out.println(res.getBody().asString());
      System.out.println(res.getTime());
      Assert.assertEquals(String.valueOf(res.getStatusCode()), "200");

   }

}