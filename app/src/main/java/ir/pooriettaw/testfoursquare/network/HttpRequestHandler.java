package ir.pooriettaw.testfoursquare.network;


import com.google.android.gms.maps.model.LatLng;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import ir.pooriettaw.testfoursquare.network.foursquare.model.SearchResponse;

/**
 * Created by pooriettaw on 17,July,2018
 */
public class HttpRequestHandler {


    public static void getCurrentLocation(LatLng latLng) {
        BusinessDelegate.getfoursquerBI().search(latLng.latitude, latLng.longitude)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<SearchResponse>() {
                    @Override
                    public void accept(SearchResponse searchResponse) throws Exception {

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });

    }
} // HttpRequestHandler
