package ir.pooriettaw.testfoursquare.network.foursquare.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pooriettaw on 17,July,2018
 */
public class Category {

    @SerializedName("icon")
    private Icon icon;

    public Category(Icon icon) {
        this.icon = icon;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
