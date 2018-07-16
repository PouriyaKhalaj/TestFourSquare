package ir.pooriettaw.testfoursquare.staff;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by pooriettaw on 16,July,2018
 */
public interface StaffPresenter extends MvpPresenter<StaffView> {

    void searchWord(String str);

    void loadData();

    void clickedQrCode();

    void endOfList();

    void onDestrot();
}
