package com.android.helloworldmvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.android.helloworldmvp.R;
import com.android.helloworldmvp.contract.IMainActivityContract;
import com.android.helloworldmvp.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements IMainActivityContract.View {

    /** Holds the instance of the presenter */
    private IMainActivityContract.Presenter mPresenter;

    /** Holds the instance of the {@link TextView} */
    private TextView mTextView;

    /** Holds the instance of the {@link Button} */
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        // Initialize the views intances.
        mTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.button);

        // Set button onClickListener using lambda and passing the event to the Presenter.
        mButton.setOnClickListener(view -> mPresenter.onClick(view));
    }

    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
}