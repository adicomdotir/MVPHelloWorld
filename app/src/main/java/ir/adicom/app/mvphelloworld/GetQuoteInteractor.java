package ir.adicom.app.mvphelloworld;

/**
 * Created by adicom on 6/6/18.
 */

public interface GetQuoteInteractor {
    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}
