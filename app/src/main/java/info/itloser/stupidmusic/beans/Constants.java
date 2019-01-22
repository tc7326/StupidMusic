package info.itloser.stupidmusic.beans;

/**
 * author：zhaoliangwang on 2019/1/22 14:15
 * email：tc7326@126.com
 */
public interface Constants {
    //请求的超时时间、单位秒
    int DEFAULT_TIMEOUT = 60;
    //BaseUrl
    String API_SERVER_URL = "https://api.bzqll.com/music/netease/";

    //url key
    int API_SERVER_KEY = 579621905;

    //搜索(类型)
    String SEARCH_TYPE_SONG = "song";//音乐
    String SEARCH_TYPE_SINGER = "singer";//歌手
    String SEARCH_TYPE_ALBUM = "album";//专辑
    String SEARCH_TYPE_LIST = "list";//歌单
    String SEARCH_TYPE_VIDEO = "video";//视频
    String SEARCH_TYPE_RADIO = "radio";//电台
    String SEARCH_TYPE_USER = "user";//用户
    String SEARCH_TYPE_LRC = "lrc";//歌词

}