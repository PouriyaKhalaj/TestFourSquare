package ir.pooriettaw.testfoursquare.network.foursquare.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pooriettaw on 17,July,2018
 */
public class Location {

    @SerializedName("address")
    private String address;

    @SerializedName("lat")
    private double lat;

    @SerializedName("lon")
    private double lon;

    @SerializedName("distance")
    private int distance;

    public Location(String address, double lat, double lon, int distance) {
        this.address = address;
        this.lat = lat;
        this.lon = lon;
        this.distance = distance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
