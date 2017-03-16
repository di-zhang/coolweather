package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by u0153942 on 3/15/2017.
 */

public class Weather {

    public String status;

    @SerializedName("basic")
    public BasicInfo basicInfo;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
