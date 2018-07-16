package ir.pooriettaw.testfoursquare.staff;

import com.hannesdorfmann.mosby.mvp.MvpView;

import java.util.ArrayList;

/**
 * Created by pooriettaw on 16,July,2018
 */
public interface StaffView extends MvpView {
    void showCameraQrCode();

    void displayData(ArrayList<Object> list);
}
