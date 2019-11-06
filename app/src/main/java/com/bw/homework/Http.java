package com.bw.homework;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.GET;

public class Http {


    public interface GetRequest{
        Call<MyEntity> getCall(@Field("number")String name);



    }





}
