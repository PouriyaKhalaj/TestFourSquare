package ir.pooriettaw.testfoursquare;

import android.app.Application;
import android.content.Context;

/**
 * Created by pooriettaw on 17,July,2018
 */
public class G extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
