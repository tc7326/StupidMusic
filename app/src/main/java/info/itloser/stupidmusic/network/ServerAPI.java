package info.itloser.stupidmusic.network;

import java.util.List;

import info.itloser.stupidmusic.beans.Song;
import info.itloser.stupidmusic.network.responseBean.SongListResp;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by 10855 on 2018/6/27.
 */
public interface ServerAPI {

    //歌单( limit和offset参数基本没用 )
    @GET("songList")
    Observable<ApiResult<SongListResp>> songList(
            @Query("key") int key,
            @Query("id") int id,
            @Query("limit") int limit,
            @Query("offset") int offset);

    //搜索( type 见 Constants )
    @GET("search")
    Observable<ApiResult<List<Song>>> search(
            @Query("key") int key,
            @Query("s") String keyword,
            @Query("type") String type,
            @Query("limit") int limit,
            @Query("offset") int offset);

    //获取歌单分类
    @GET("songListCategory")
    Observable<ApiResult<List<Song>>> songListCategory(
            @Query("key") int key);


    //查找精品歌单( 根据分类 cat 默认 全部 )
    @GET("highQualitySongList")
    Observable<ApiResult<List<Song>>> highQualitySongList(
            @Query("key") int key,
            @Query("cat") String cat,
            @Query("limit") int limit,
            @Query("offset") int offset,
            @Query("order") String order);

    //查找热门歌单（根据分类 cat 默认 全部）（根据 order 最新 new / 最热 hot 默认）
    @GET("hotSongList")
    Observable<ApiResult<List<Song>>> hotSongList(
            @Query("key") int key,
            @Query("cat") String cat,
            @Query("type") String type,
            @Query("limit") int limit,
            @Query("offset") int offset);

    //MV排行榜
    @GET("topMvList")
    Observable<ApiResult<List<Song>>> topMvList(
            @Query("key") int key,
            @Query("limit") int limit,
            @Query("offset") int offset);


}
