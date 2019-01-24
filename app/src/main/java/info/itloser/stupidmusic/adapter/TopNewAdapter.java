package info.itloser.stupidmusic.adapter;

import android.support.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import info.itloser.stupidmusic.R;
import info.itloser.stupidmusic.beans.SongListMsg;

/**
 * author：zhaoliangwang on 2019/1/23 14:50
 * email：tc7326@126.com
 */
public class TopNewAdapter extends BaseQuickAdapter<SongListMsg, BaseViewHolder> {

    public TopNewAdapter(int layoutResId, @Nullable List<SongListMsg> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, SongListMsg item) {
        Glide.with(mContext).load(item.getCoverImgUrl()).into((CircleImageView) helper.getView(R.id.iv_img));
        helper.setText(R.id.tv_title, item.getTitle());
        helper.setText(R.id.tv_song_num, item.getSongNum()+"首");
        helper.setText(R.id.tv_play_count, item.getPlayCount()+"次");
    }
}
