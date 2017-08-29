package com.example.glen.sotopusers.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by glen on 8/29/17.
 */
public class APIClient {

    private static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    private static Retrofit mRetrofit = null;

    public static Retrofit getClient() {

        if (mRetrofit == null) {

            mRetrofit = (new Retrofit.Builder())
                                     .baseUrl(BASE_URL)
                                     .addConverterFactory(GsonConverterFactory.create())
                                     .build();
        }

        return mRetrofit;
    }
}
