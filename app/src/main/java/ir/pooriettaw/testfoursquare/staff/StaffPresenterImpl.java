package ir.pooriettaw.testfoursquare.staff;

import android.content.Context;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by pooriettaw on 16,July,2018
 */
public class StaffPresenterImpl extends MvpBasePresenter<StaffView> implements StaffPresenter {

    Context context;

    public StaffPresenterImpl(Context context) {
        this.context = context;
    }

    @Override
    public void searchWord(String str) {

    }

    @Override
    public void loadData() {

    }

    @Override
    public void clickedQrCode() {

    }

    @Override
    public void endOfList() {

    }

    @Override
    public void onDestrot() {

    }
}
