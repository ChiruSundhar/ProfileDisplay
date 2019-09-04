package com.prematix.profiledisplay;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

 @GET("userRegistration?userId=17/")
    Call<JSONResponse> getJSON();
}
