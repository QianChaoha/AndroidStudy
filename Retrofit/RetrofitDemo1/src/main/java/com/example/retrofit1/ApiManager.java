package com.example.retrofit1;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiManager {

    @GET("person_object.json")
    Call<LoginResult> getData(@Query("name") String name, @Query("password") String pw);
}