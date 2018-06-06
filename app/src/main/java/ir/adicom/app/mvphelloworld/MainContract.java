package ir.adicom.app.mvphelloworld;

/**
 * Created by adicom on 6/6/18.
 */

public interface MainContract {
    interface MainView {

        void showProgress();

        void hideProgress();

        void setQuote(String string);
    }

    interface MainPresenter {
        void onButtonClick();

        void onDestroy();
    }

    interface GetQuoteInteractor {
        interface OnFinishedListener {
            void onFinished(String string);
        }

        void getNextQuote(OnFinishedListener listener);
    }
}
