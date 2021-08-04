package com.example.apitrial4;


import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface APIinterface {

    @Headers("Content-Type: application/json")
    @GET("v1/breeds?api_key=14fd010c-3ee9-48b0-9fb6-27f36dfe7a61")
    Call<ResponseBody> getResponse();

}




