package com.android.helloworldmvp.contract;

/**
 * The Contract sets the rules that will be followed by the classes.
 */
public interface IMainActivityContract {

    /**
     * Interface that must be implemented by the View.
     */
    interface View {
        /**
         * Initializes the view.
         */
        void initView();

        /**
         * Set data to the view.
         *
         * @param data the string to be set into the view.
         */
        void setViewData(final String data);
    }

    /**
     * Interface that must be implemented by the Model.
     */
    interface Model {
        /**
         * Fetch data from view.
         *
         * @return string that contains data from the view.
         */
        String getData();
    }

    /**
     * Interface that must be implemented by the Presenter.
     */
    interface Presenter {
        /**
         * Handle the click event from the View.
         *
         * @param view {@link android.view.View} that will receive the click event.
         */
        void onClick(final android.view.View view);
    }
}
