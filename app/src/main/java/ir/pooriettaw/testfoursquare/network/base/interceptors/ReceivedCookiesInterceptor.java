package ir.pooriettaw.testfoursquare.network.base.interceptors;

import android.content.Context;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

public class ReceivedCookiesInterceptor implements Interceptor {
    Context context;

    public ReceivedCookiesInterceptor(Context context) {
        this.context = context;
    } // ReceivedCookiesInterceptor

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse;
    } // intercept
} // ReceivedCookiesInterceptor class