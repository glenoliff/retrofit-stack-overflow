package com.example.glen.sotopusers.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by glen on 8/29/17.
 */
public class User {

    @SerializedName("badge_counts")
    private Badges mBadges;

    @SerializedName("display_name")
    private String mName;

    @SerializedName("location")
    private String mLocation;

    @SerializedName("user_id")
    private int mUserId;

    @SerializedName("reputation")
    private int mReputation;

    public Badges getBadges() {
        return mBadges;
    }

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getUserId() {
        return mUserId;
    }

    public int getReputation() {
        return mReputation;
    }
}

/*
"age":41,
"reputation_change_year":52564,
"reputation_change_quarter":13331,
"reputation_change_month":6409,
"reputation_change_week":630,
"reputation_change_day":200,
"reputation":969946,
"creation_date":1222430705,
"user_type":"registered",
"user_id":22656,
"accept_rate":90,
"location":"Reading, United Kingdom",
"website_url":"http://csharpindepth.com",
"link":"https://stackoverflow.com/users/22656/jon-skeet",
"profile_image":"https://www.gravatar.com/avatar/6d8ebb117e8d83d74ea95fbdd0f87e13?s=128&d=identicon&r=PG",
"display_name":"Jon Skeet"}
 */