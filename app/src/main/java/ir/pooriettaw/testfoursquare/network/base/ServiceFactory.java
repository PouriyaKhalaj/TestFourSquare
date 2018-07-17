package ir.pooriettaw.testfoursquare.network.base;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.reactivex.schedulers.Schedulers;
import ir.pooriettaw.testfoursquare.network.base.interceptors.AddCookiesInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceFactory {
    private static HashMap<String, Object> services;
    private static ServiceFactory instance;


    private static ServiceFactory getInstance() {
        if (instance == null) {
            instance = new ServiceFactory();
            instance.services = new HashMap<>();
        } // if
        return instance;
    } // getInstance

    private ServiceFactory() {
    } // ServiceFactory


    /**
     * Creates a retrofit service from an arbitrary classes (clazz)
     *
     * @param clazz    Java interface of the retrofit service
     * @param endPoint REST endpoint url
     * @return retrofit service with defined endpoint
     */
    public static <T> T createRetrofitService(final Context context, final Class<T> clazz, final String endPoint) {
        if (getInstance().services.containsKey(getKey(clazz, endPoint))) {
            return (T) getInstance().services.get(getKey(clazz, endPoint));
        } else {
            try {

                HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
                loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.addInterceptor(new AddCookiesInterceptor(context));
//                builder.addInterceptor(new ReceivedCookiesInterceptor(context));
//                if (BuildConfig.DEBUG)
                    builder.addInterceptor(loggingInterceptor);

                OkHttpClient client = new OkHttpClient();
                builder.connectTimeout(15, TimeUnit.SECONDS);
                builder.readTimeout(20, TimeUnit.SECONDS);
                client = builder.build();

                Gson gson = new GsonBuilder().serializeNulls().create();
                RxJava2CallAdapterFactory rxAdapter = RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io());



                final Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(endPoint)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(rxAdapter)
                        .client(client)
                        .build();
                T service = retrofit.create(clazz);

                getInstance().services.put(getKey(clazz, endPoint), service);
                return service;
            } catch (Exception e) {
                e.printStackTrace();
                e.printStackTrace();
            } // catch
            return null;
        } // else
    } // createRetrofitService

    private static <T> String getKey(Class<T> clazz, String endPoint) {
        return endPoint + ";" + clazz.getName();
    } // getKey
} // ServiceFactory class
