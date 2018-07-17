package ir.pooriettaw.testfoursquare.network.base.interceptors;

import android.content.Context;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AddCookiesInterceptor implements Interceptor {

    Context context;

    public AddCookiesInterceptor(Context context) {
        this.context = context;
    } // AddCookiesInterceptor


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        return chain.proceed(builder.build());
    } // intercept
} // AddCookiesInterceptor class