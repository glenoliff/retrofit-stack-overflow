package com.example.glen.sotopusers.api;

import com.example.glen.sotopusers.model.Items;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by glen on 8/29/17.
 */
public interface StackOverflowUsers {

    @GET("users?pagesize=10&order=desc&sort=reputation&site=stackoverflow")
    Call<Items> getTopUsers();
}
