package com.prematix.profiledisplay.Bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.prematix.profiledisplay.Bean.Response;

import java.util.List;

public class JSONResponse {

    @SerializedName("response")
    @Expose
    private List<Response> response = null;
    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

}