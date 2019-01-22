package info.itloser.stupidmusic.network;

import java.util.List;
import java.util.concurrent.TimeUnit;

import info.itloser.stupidmusic.beans.Constants;
import info.itloser.stupidmusic.beans.Song;
import info.itloser.stupidmusic.network.responseBean.SongListResp;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class RequestClient {
    private static RequestClient requestClient;

    private ServerAPI mServerApi;

    private RequestClient() {
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(Constants.API_SERVER_URL)
                .client(new OkHttpClient.Builder()
                        .connectTimeout(Constants.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                        .readTimeout(Constants.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                        .retryOnConnectionFailure(true)
                        .addInterceptor(new HttpLoggingInterceptor()
                                .setLevel(HttpLoggingInterceptor.Level.BODY))
                        .build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        mServerApi = mRetrofit.create(ServerAPI.class);
    }

    public static RequestClient getInstance() {
        if (null == requestClient) {
            requestClient = new RequestClient();
        }
        return requestClient;
    }

    /*
     * 获取歌单
     * */
    public Observable<SongListResp> songList(int id, int limit, int offset) {
        return mServerApi.songList(579621905, id, limit, offset).map(new ApiResultFunc1<SongListResp>()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    /*
     * 搜索
     * */
    public Observable<List<Song>> search(String keyword, String type, int limit, int offset) {
        return mServerApi.search(579621905, keyword, type, limit, offset).map(new ApiResultFunc1<List<Song>>()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

}
