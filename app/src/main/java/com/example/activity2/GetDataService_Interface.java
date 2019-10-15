package com.example.activity2;

import com.example.activity2.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService_Interface {


    @GET("2")
    Call<Example> getExample();
}
