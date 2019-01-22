package info.itloser.stupidmusic.network;

/**
 * 异常处理
 * Created by 10855 on 2018/6/27.
 */
public class ApiException extends RuntimeException {

    public int code;
    public String result;

    public ApiException(int code, String result) {
        super(result);
        this.code = code;
        this.result = result;
    }

}
