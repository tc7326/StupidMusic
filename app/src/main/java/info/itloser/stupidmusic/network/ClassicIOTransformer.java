package info.itloser.stupidmusic.network;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Android典型的Http请求模式，后台请求数据，UI主线程显示结果
 * Created by di.zhang on 2016/4/14.
 */
public class ClassicIOTransformer<T> implements Observable.Transformer<T, T> {
    @Override
    public Observable<T> call(Observable<T> tObservable) {
        return tObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
