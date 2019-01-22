package info.itloser.stupidmusic.beans;

/**
 * author：zhaoliangwang on 2019/1/22 17:40
 * email：tc7326@126.com
 */
public class SongListMsg {

    /**
     * id : 2629041485
     * title : 洒脱生活，做酷酷的自己才美丽
     * creator : 流年忧光影
     * description : 生活上不坚定，感情不够洒脱，患得患失敏感多疑，所以你才那么不快乐。 ​
     * <p>
     * 生活随心随性，感情洒脱自信。做酷酷的自己才会更加美丽。
     * coverImgUrl : http://p1.music.126.net/XOwZYLlaTWhpIUZ3mjIg1Q==/109951163801575843.jpg?param=400y400
     * songNum : 85
     * playCount : 2800
     */

    private long id;
    private String title;
    private String creator;
    private String description;
    private String coverImgUrl;
    private int songNum;
    private int playCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public int getSongNum() {
        return songNum;
    }

    public void setSongNum(int songNum) {
        this.songNum = songNum;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }
}
