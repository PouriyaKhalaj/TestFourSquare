package ir.pooriettaw.testfoursquare.network.foursquare;

import com.foursquare.api.types.FoursquareGeocode;
import com.foursquare.api.types.FoursquareGeocodeResponse;

import io.reactivex.Single;
import ir.pooriettaw.testfoursquare.G;
import ir.pooriettaw.testfoursquare.network.ApiConstant;
import ir.pooriettaw.testfoursquare.network.CommonApi;
import ir.pooriettaw.testfoursquare.network.base.ServiceFactory;
import ir.pooriettaw.testfoursquare.network.foursquare.model.SearchResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by pooriettaw on 17,July,2018
 */
public class FoursquareService extends CommonApi implements FoursquerBI {
    Api service;

    public FoursquareService() {
        service = ServiceFactory.createRetrofitService(G.context, Api.class, ApiConstant.HTTP_APP_URL);
    } // FoursquareService

    @Override
    public Single<SearchResponse> search(double lat, double lon) {
        return service.search(lat + "," + lon, CONSUMER_KEY, CONSUMER_SECRET, "20180718");
    } // search

    private interface Api {
        @GET("venues/search")
        Single<SearchResponse> search(@Query("ll") String latLng, @Query("client_id") String clientId, @Query("client_secret") String clientSecret, @Query("v") String v);
    } // Api interface
} // FoursquareService class
