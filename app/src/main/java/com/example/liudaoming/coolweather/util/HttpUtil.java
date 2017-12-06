package com.example.liudaoming.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by LiuDaoming on 2017/12/6.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
