package com.example.glen.sotopusers.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by glen on 8/29/17.
 */

public class Items {

    @SerializedName("items")
    private List<User> mUsers;

    public List<User> getUsers() {
        return mUsers;
    }
}
