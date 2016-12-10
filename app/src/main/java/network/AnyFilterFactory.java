package network;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import bean.BaseResponse;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;


/**
 * Created by Windows 10 on 2016/12/8.
 */

public class AnyFilterFactory {

    private final static Observable.Transformer transformer = new AnyTransFormer();

    public static <T> Observable<T> compose(Observable<BaseResponse<T>> observable)
    {
        return observable.compose(transformer);
    }

    private static final class AnyTransFormer<T> implements Observable.Transformer<BaseResponse<T>,T>
    {
        @Override
        public Observable<T> call(Observable<BaseResponse<T>> observable) {
            return observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .timeout(5, TimeUnit.SECONDS)
                    .retry(1)
                    .flatMap(new Func1<BaseResponse, Observable<T>>() {
                        @Override
                        public Observable<T> call(BaseResponse response) {
                            return flatResponse(response);
                        }
                    });
        }
    }

    private static <T> Observable<T> flatResponse( final BaseResponse<T> response )
    {
        return Observable.create(new Observable.OnSubscribe<T>() {
            @Override
            public void call(Subscriber<? super T> subscriber) {

                Log.i("Tag","response.result :" +response.result);

                if( 0 == response.result )
                {
                    if( !subscriber.isUnsubscribed() )
                    {
                        subscriber.onNext(response.data);
                    }
                }else
                {
                    if( !subscriber.isUnsubscribed() )
                    {
//                        //特殊返回结果码进行特殊处理
//                        if( response.resultCode==403){
//
//                        }
//
//                        subscriber.onError(new Throwable("Error code :" + response.resultCode + ", msg : "+ response.msg ));
                    }
                    return;
                }

                if( !subscriber.isUnsubscribed() )
                {
                    subscriber.onCompleted();
                }
            }
        });
    }

}
