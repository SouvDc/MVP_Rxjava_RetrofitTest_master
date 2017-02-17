package bule.souv.com.mvp_rxjava_retrofittest_master.model;

import android.content.Context;

import bule.souv.com.mvp_rxjava_retrofittest_master.api.WeatherServiceApi;
import bule.souv.com.mvp_rxjava_retrofittest_master.base.BaseModel;
import bule.souv.com.mvp_rxjava_retrofittest_master.base.IBaseRequestCallBack;
import bule.souv.com.mvp_rxjava_retrofittest_master.bean.WeatherInfoBean;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * 描述：MVP中的M实现类，处理业务逻辑数据
 * 作者：dc on 2017/2/16 11:05
 * 邮箱：597210600@qq.com
 */
public class WeatherModelImp extends BaseModel implements WeatherModel<WeatherInfoBean> {

    private Context context = null;
    private WeatherServiceApi weatherServiceApi;
    private CompositeSubscription mCompositeSubscription;

    public WeatherModelImp(Context mContext) {
        super();
        context = mContext;
        weatherServiceApi = retrofitManager.getService();
        mCompositeSubscription = new CompositeSubscription();
    }



    @Override
    public void loadWeather(String key, String city, final IBaseRequestCallBack iBaseRequestCallBack) {
        mCompositeSubscription.add(weatherServiceApi.loadWeatherInfo(key, city)  //将subscribe添加到subscription，用于注销subscribe
                .observeOn(AndroidSchedulers.mainThread())//指定事件消费线程
                .subscribeOn(Schedulers.io())  //指定 subscribe() 发生在 IO 线程
                .subscribe(new Subscriber<WeatherInfoBean>() {

                    @Override
                    public void onStart() {
                        super.onStart();
                        //onStart它总是在 subscribe 所发生的线程被调用 ,如果你的subscribe不是主线程，则会出错，则需要指定线程;
                        iBaseRequestCallBack.beforeRequest();
                    }

                    @Override
                    public void onCompleted() {
                        //回调接口：请求已完成，可以隐藏progress
                        iBaseRequestCallBack.requestComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        //回调接口：请求异常
                        iBaseRequestCallBack.requestError(e);
                    }

                    @Override
                    public void onNext(WeatherInfoBean weatherInfoBean) {
                        //回调接口：请求成功，获取实体类对象
                        iBaseRequestCallBack.requestSuccess(weatherInfoBean);
                    }
                }));
    }

    @Override
    public void onUnsubscribe() {
        //判断状态
        if(mCompositeSubscription.isUnsubscribed()){
            mCompositeSubscription.clear();  //注销
            mCompositeSubscription.unsubscribe();
        }
    }
}
