package com.xtremus.retrofittest.remote;

import retrofit2.Call;


import retrofit2.http.GET;

import retrofit2.http.Query;

import com.xtremus.retrofittest.data.model.Get;

public interface LoginInterface {

    @GET("/Home/testing/")
    Call<Get> getLogin(@Query("username") String username,
                       @Query("password") String password);


}
