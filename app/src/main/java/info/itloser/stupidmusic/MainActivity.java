package info.itloser.stupidmusic;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener {

    @BindView(R.id.et_search)
    EditText etSearch;
    @BindView(R.id.iv_search)
    ImageView ivSearch;
    @BindView(R.id.dl_main)
    DrawerLayout dlMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //设置抽屉布局的阴影颜色
        ((DrawerLayout) findViewById(R.id.dl_main)).setScrimColor(Color.TRANSPARENT);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //返回键按下
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //如果侧栏打开则关闭
            if (dlMain.isDrawerOpen(GravityCompat.END)) {
                dlMain.closeDrawer(GravityCompat.END);
            } else {
                moveTaskToBack(true);
            }
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
