package com.prematix.profiledisplay.Api;

import com.prematix.profiledisplay.Bean.JSONResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {




 @GET("userRegistration?userId=30/")
    Call<JSONResponse> getJSON();
}
