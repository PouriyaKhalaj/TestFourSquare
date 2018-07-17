package ir.pooriettaw.testfoursquare.network.foursquare;

import io.reactivex.Single;
import ir.pooriettaw.testfoursquare.network.foursquare.model.SearchResponse;

/**
 * Created by pooriettaw on 17,July,2018
 */
public interface FoursquerBI {

    Single<SearchResponse> search(double lat, double lon);
}
