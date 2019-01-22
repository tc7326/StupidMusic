package info.itloser.stupidmusic.network;

import rx.functions.Func1;

public class ApiResultFunc1<T> implements Func1<ApiResult<T>, T> {

    @Override
    public T call(ApiResult<T> apiResult) {
        if (apiResult.code != 200) {
            //非正常返回结构处理
            throw new ApiException(apiResult.code, apiResult.result);
        }
        return apiResult.data;
    }
}
