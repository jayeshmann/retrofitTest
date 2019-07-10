package com.xtremus.retrofittest.remote;

import retrofit2.Call;


import retrofit2.http.GET;

import retrofit2.http.Path;
import retrofit2.http.Query;

import com.xtremus.retrofittest.data.model.Get;

public interface LoginInterface {

    @GET("Home/testing/")
    Call<Get> getLogin(@Query("user") String username,
                       @Query("pass") String password);
   /* @GET("/Home/testing/?user={username}&pass={password}")
    Call<Get> getLogin(@Path("username") String username,
                       @Path("password") String password);*/


}
