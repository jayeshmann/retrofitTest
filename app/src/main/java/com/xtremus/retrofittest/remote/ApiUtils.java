package com.xtremus.retrofittest.remote;


public class ApiUtils {

    private static final String BASE_URL = "http://tsassessors.in/ncckanpur/";



    public static LoginInterface getLoginService() {
        return RetrofitClient.getClient(BASE_URL).create(LoginInterface.class);
    }
}
