package ir.pooriettaw.testfoursquare.network.foursquare.model;

import com.foursquare.api.types.Venue;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by pooriettaw on 17,July,2018
 */
public class Response {
    @SerializedName("venues")
    private ArrayList<Venue> venues;


    public Response(ArrayList<Venue> venues) {
        this.venues = venues;
    }

    public ArrayList<Venue> getVenues() {
        return venues;
    }

    public void setVenues(ArrayList<Venue> venues) {
        this.venues = venues;
    }
}
