package com.android.helloworldmvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.helloworldmvp.R;
import com.android.helloworldmvp.contract.IMainActivityContract;
import com.android.helloworldmvp.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements IMainActivityContract.View {

    /** Holds the instance of the presenter */
    private IMainActivityContract.Presenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {

    }

    @Override
    public void setViewData(String data) {

    }
}