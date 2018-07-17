package ir.pooriettaw.testfoursquare.network.foursquare.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by pooriettaw on 17,July,2018
 */
public class Venue {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("location")
    private Location location;

    @SerializedName("categories")
    private ArrayList<Category> categories;

    public Venue(String id, String name, Location location, ArrayList<Category> categories) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.categories = categories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
