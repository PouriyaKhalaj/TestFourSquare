package ir.pooriettaw.testfoursquare.network;


import ir.pooriettaw.testfoursquare.network.foursquare.FoursquareService;
import ir.pooriettaw.testfoursquare.network.foursquare.FoursquerBI;

public class BusinessDelegate {

    private static FoursquerBI foursquerBI;
    public static FoursquerBI getfoursquerBI() {
        if (foursquerBI == null)
            foursquerBI = new FoursquareService();
        return foursquerBI;
    }
}
