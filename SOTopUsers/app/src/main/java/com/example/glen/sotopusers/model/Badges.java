package com.example.glen.sotopusers.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by glen on 8/29/17.
 */
public class Badges {

    @SerializedName("bronze")
    private int mBronze;

    @SerializedName("silver")
    private int mSilver;

    @SerializedName("gold")
    private int mGold;

    public int getBronze() {
        return mBronze;
    }

    public int getSilver() {
        return mSilver;
    }

    public int getGold() {
        return mGold;
    }
}
