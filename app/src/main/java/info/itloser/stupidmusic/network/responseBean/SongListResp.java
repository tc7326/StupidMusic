package info.itloser.stupidmusic.network.responseBean;

import java.util.List;

import info.itloser.stupidmusic.beans.Song;

/**
 * author：zhaoliangwang on 2019/1/22 14:54
 * email：tc7326@126.com
 */
public class SongListResp {

    private String songListId;
    private String songListName;
    private String songListPic;
    private int songListCount;
    private long songListPlayCount;
    private String songListDescription;
    private int songListUserId;
    private List<Song> songs;

    public String getSongListId() {
        return songListId;
    }

    public void setSongListId(String songListId) {
        this.songListId = songListId;
    }

    public String getSongListName() {
        return songListName;
    }

    public void setSongListName(String songListName) {
        this.songListName = songListName;
    }

    public String getSongListPic() {
        return songListPic;
    }

    public void setSongListPic(String songListPic) {
        this.songListPic = songListPic;
    }

    public int getSongListCount() {
        return songListCount;
    }

    public void setSongListCount(int songListCount) {
        this.songListCount = songListCount;
    }

    public long getSongListPlayCount() {
        return songListPlayCount;
    }

    public void setSongListPlayCount(long songListPlayCount) {
        this.songListPlayCount = songListPlayCount;
    }

    public String getSongListDescription() {
        return songListDescription;
    }

    public void setSongListDescription(String songListDescription) {
        this.songListDescription = songListDescription;
    }

    public int getSongListUserId() {
        return songListUserId;
    }

    public void setSongListUserId(int songListUserId) {
        this.songListUserId = songListUserId;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

}
