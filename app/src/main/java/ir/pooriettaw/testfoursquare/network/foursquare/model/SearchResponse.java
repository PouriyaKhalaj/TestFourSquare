package ir.pooriettaw.testfoursquare.network.foursquare.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by pooriettaw on 17,July,2018
 */
public class SearchResponse {

    @SerializedName("response")
    Response response;

    public SearchResponse(Response response) {
        this.response = response;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
