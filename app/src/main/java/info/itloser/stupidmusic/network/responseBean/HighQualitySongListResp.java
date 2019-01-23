package info.itloser.stupidmusic.network.responseBean;

import java.util.List;

import info.itloser.stupidmusic.beans.SongListMsg;

/**
 * author：zhaoliangwang on 2019/1/23 16:45
 * email：tc7326@126.com
 */
public class HighQualitySongListResp {
    private List<SongListMsg> playlists;
    private String lasttime;

    public List<SongListMsg> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<SongListMsg> playlists) {
        this.playlists = playlists;
    }

    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }
}
