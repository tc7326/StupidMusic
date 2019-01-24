package info.itloser.stupidmusic;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import info.itloser.stupidmusic.fragment.MainFragment;
import info.itloser.stupidmusic.fragment.TopNewFragment;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener, TopNewFragment.OnFragmentInteractionListener {

    @BindView(R.id.iv_search)
    ImageView ivSearch;
    @BindView(R.id.dl_main)
    DrawerLayout dlMain;
    @BindView(R.id.cardView)
    CardView cardView;

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //设置抽屉布局的阴影颜色
        ((DrawerLayout) findViewById(R.id.dl_main)).setScrimColor(Color.TRANSPARENT);

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //事务是不能共享的，每次用到都要重新开启一个事务，之后提交
        fragmentTransaction.replace(R.id.fl_main, new TopNewFragment());
        fragmentTransaction.commit();

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        //侧栏
        if (dlMain.isDrawerOpen(GravityCompat.START)) {
            dlMain.closeDrawer(GravityCompat.START);
            return true;
        }

        //返回到后台
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            moveTaskToBack(true);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @OnClick({R.id.iv_search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_search:
                //打开新fragment   并请求数据

                break;
        }
    }
}
