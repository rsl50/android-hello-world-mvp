package com.android.helloworldmvp.presenter;

import android.view.View;

import com.android.helloworldmvp.contract.IMainActivityContract;
import com.android.helloworldmvp.model.MainActivityModel;

/**
 * The Presenter holds all the business logic and provides a mediator between the view and the model.
 */
public class MainActivityPresenter implements IMainActivityContract.Presenter {

    private IMainActivityContract.View mView;
    private IMainActivityContract.Model mModel;

    public MainActivityPresenter(final IMainActivityContract.View view) {
        mView = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(View view) {
        final String data = mModel.getData();
        mView.setViewData(data);
    }
}
