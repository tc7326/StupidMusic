package info.itloser.stupidmusic;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置抽屉布局的阴影颜色
        ((DrawerLayout) findViewById(R.id.dl_main)).setScrimColor(Color.TRANSPARENT);
//        RequestClient.getInstance().songList(3778678, 0, 0).subscribe(new Subscriber<SongListResp>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                e.printStackTrace();
//
//            }
//
//            @Override
//            public void onNext(SongListResp songListResp) {
//                Log.i("TAG", songListResp.getSongs().size() + "长度");
//            }
//        });

//        RequestClient.getInstance().search("茉莉花", Constants.SEARCH_TYPE_SONG, 10, 0).subscribe(new Subscriber<List<Song>>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                e.printStackTrace();
//            }
//
//            @Override
//            public void onNext(List<Song> songs) {
//                Log.i("TAG", songs.size() + "长度");
//            }
//        });

    }
}
