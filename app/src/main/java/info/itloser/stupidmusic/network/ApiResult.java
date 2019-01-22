package info.itloser.stupidmusic.network;

/*
 * 响应基类
 * */
public class ApiResult<T> {
    public int code;//响应码
    public String result;//提示信息
    public T data;//自定义的Javabean用泛型来代替,用统一字段retureMap来接收
}