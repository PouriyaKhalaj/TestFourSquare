package ir.pooriettaw.testfoursquare.staff;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ir.pooriettaw.testfoursquare.R;

public class MainActivity extends MvpActivity<StaffView, StaffPresenter> implements StaffView {

    @BindView(R.id.main_rv)
    RecyclerView rvStaff;

    @OnClick(R.id.main_cv_qr_code)
    void clicked(View v) {
    } // clicked method

    StaffRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    } // onCreate

    private void init() {
        setupRecycler();
    } // init

    private void setupRecycler() {
        rvStaff.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvStaff.setLayoutManager(layoutManager);
        ArrayList<Object> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        adapter = new StaffRecyclerAdapter(this, list);
        rvStaff.setAdapter(adapter);
    } // setupRecycler

    @NonNull
    @Override
    public StaffPresenter createPresenter() {
        return new StaffPresenterImpl(this);
    } // createPresenter

    @Override
    public void showCameraQrCode() {

    } // showCameraQrCode

    @Override
    public void displayData(ArrayList<Object> list) {

    } // DisplayData


}
