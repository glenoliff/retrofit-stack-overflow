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
