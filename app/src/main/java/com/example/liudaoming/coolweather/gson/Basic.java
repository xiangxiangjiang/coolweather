package com.example.liudaoming.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LiuDaoming on 2017/12/6.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
