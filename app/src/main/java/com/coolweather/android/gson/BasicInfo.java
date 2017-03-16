package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by u0153942 on 3/15/2017.
 */

public class BasicInfo {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
