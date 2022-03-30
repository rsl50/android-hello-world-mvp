package com.android.helloworldmvp.model;

import com.android.helloworldmvp.contract.IMainActivityContract;

/**
 * The Model provides data (e.g. parsin JSON data, fetch data from database, etc).
 */
public class MainActivityModel implements IMainActivityContract.Model {

    @Override
    public String getData() {
        return "Hello World";
    }
}
